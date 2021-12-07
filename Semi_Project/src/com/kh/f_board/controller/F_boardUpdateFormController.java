package com.kh.f_board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.f_board.model.service.BoardService;
import com.kh.f_board.model.vo.Attachment;
import com.kh.f_board.model.vo.Board;

/**
 * Servlet implementation class F_boardUpdateformController
 */
@WebServlet("/updateForm.fb")
public class F_boardUpdateFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public F_boardUpdateFormController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int boardNo = Integer.parseInt(request.getParameter("bno"));

		// 글번호에 해당하는 Board 테이블로부터 행을 조회
		Board b = new BoardService().selectBoard(boardNo);

		// 글번호에 해당하는 첨부파일 Attachment 테이블로부터 행을 조회
		Attachment at = new BoardService().selectAttachment(boardNo);

		// 값 넘기기
		request.setAttribute("b", b);
		request.setAttribute("at", at);

		request.getRequestDispatcher("views/board/boardUpdateView.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
