package com.kh.f_board.model.service;

import static com.kh.common.JDBCTemplate.*;
import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.model.vo.PageInfo;
import com.kh.f_board.model.dao.BoardDao;
import com.kh.f_board.model.vo.Attachment;
import com.kh.f_board.model.vo.Board;

public class BoardService {

	public ArrayList<Board> selectList(PageInfo pi) {
		Connection conn = getConnection();

		ArrayList<Board> list = new BoardDao().selectList(conn, pi);

		close(conn);

		return list;
	}

	public int selectListCount() {
		Connection conn = getConnection();

		int listCount = new BoardDao().selectListCount(conn);

		close(conn);

		return listCount;
	}

	public int increaseCount(int boardNo) {
		Connection conn = getConnection();

		int result = new BoardDao().increaseCount(conn, boardNo);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public Board selectBoard(int boardNo) {
		Connection conn = getConnection();

		Board b = new BoardDao().selectBoard(conn, boardNo);

		close(conn);

		return b;
	}

	public int maxBoard() {
		Connection conn = getConnection();
		int m = new BoardDao().maxBoard(conn);

		close(conn);

		return m;
	}

	public int insertBoard(Board b, ArrayList<Attachment> list) {
		Connection conn = getConnection();

		// 1개의 트랜잭션에 두개의 insert 문이 있음 => DAO 각각 한번씩 호출
		int result1 = new BoardDao().insertBoard(conn, b);

		int result2 = new BoardDao().insertAttachmentList(conn, list);

		if (result1 > 0 && result2 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result1 * result2;
	}

	public ArrayList<Attachment> selectAttachmentList(int boardNo) {
		Connection conn = getConnection();

		ArrayList<Attachment> list = new BoardDao().selectAttachmentList(conn, boardNo);

		close(conn);

		return list;
	}

	public int updateBoard(Board b, Attachment at) {
		Connection conn = getConnection();

		// 1, 2, 3 케이스에 대해 공통적으로 일어나는 BOARD UPDATE 먼저 하고 조건 지정
		int result1 = new BoardDao().updateBoard(conn, b);

		int result2 = 1; // ATTACHMENT 테이블과 관련된 결과물

		// 새롭게 첨부된 파일이 있을경우
		if (at != null) {

			// 기존의 첨부파일이 있었을 경우
			if (at.getFileNo() != 0) {
				result2 = new BoardDao().updateAttachment(conn, at);
			} else {
				// 없었을 경우
				result2 = new BoardDao().insertNewAttachment(conn, at); // 재활용X
			}
		}
		// 아닐경우 따로 ATTACHMENT 에 할 일이 없음 => else 블럭 X

		if (result1 > 0 && result2 > 0) { // 둘 다 성공 했을 경우에만 무조건 commit
			commit(conn);
		} else { // 둘중에 하나라도 실패했을 경우 무조건 rollback
			rollback(conn);
		}

		close(conn);

		return (result1 * result2);
	}

	public Attachment selectAttachment(int boardNo) {
		Connection conn = getConnection();

		Attachment at = new BoardDao().selectAttachment(conn, boardNo);

		close(conn);

		return at;
	}

	public int deleteBoard(int boardNo) {

		Connection conn = getConnection();

		int result = new BoardDao().deleteBoard(conn, boardNo);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;

	}

}
