package com.kh.f_board.controller;



import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.common.MyFileRenamePolicy;
import com.kh.f_board.model.service.BoardService;
import com.kh.f_board.model.vo.Attachment;
import com.kh.f_board.model.vo.Board;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class boardInsertController
 */
@WebServlet("/insert.fb")
public class F_boardInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public F_boardInsertController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		// 2) 단계 전에 "첨부파일" => multipart/form-data => 조건 먼저 제시
		if (ServletFileUpload.isMultipartContent(request)) {

			// MultipartRequest 객체 생성 => 곧바로 서버로 파일이 올라옴

			// 1_1. 전송 용량 제한 (10Mbyte)
			int maxSize = 1024 * 1024 * 10;

			// 1_2. 저장할 서버의 물리적 경로 제시
			String savePath = request.getServletContext().getRealPath("/resources/f_board_upfiles/");

			// 2. MultipartREquest 객체 생성
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8",
					new MyFileRenamePolicy());

			// 2) MultiRequest 으로 부터 값 뽑기 => getParameter 메소드 이용
			String boardTitle = multiRequest.getParameter("title");
			String boardContent = multiRequest.getParameter("content");
			String userNo = multiRequest.getParameter("userNo");

			// 3) VO 가공
			// Board
			Board b = new Board();
			b.setF_TITLE(boardTitle);
			b.setCONTENT(boardContent);
			b.setBOARD_WRITER(userNo);

			// Attachment => 사진게시판에 메인이미지에 required
			// => 적어도 게시글 한개당 최소 한개의 첨부파일은 존재한다.
			// 여러개의 VO 객체를 묶어서 다룰 경우 ArrayList
			ArrayList<Attachment> list = new ArrayList<>();

			// 키값 : file1 ~ 4
			for (int i = 1; i < 5; i++) {

				// 키값만 미리 변수로 셋팅
				String key = "file" + i;

				// 원본파일명이 존재하는지 메소드를 이용해서 파악 => 조건
				if (multiRequest.getOriginalFileName(key) != null) { // 원본 파일이 존재할 경우

					// 첨부파일이 존재할 경우 Attachment 객체 생성
					// 필드 : 원본명, 수정명, 폴더경로, 파일레벨** (1:대표, 2:상세)
					Attachment at = new Attachment();
					at.setOriginName(multiRequest.getOriginalFileName(key)); // 원본명
					at.setChangeName(multiRequest.getFilesystemName(key)); // 수정명
					at.setFilePath("resources/f_board_upfiles/"); // 경로명

					list.add(at);

				}

			}

			// 4) Service 단으로 토스
			int result = new BoardService().insertBoard(b, list);

			// 5) 결과에 따른 응답뷰 지정
			

				request.getSession().setAttribute("alertMsg", "성공적으로 업로드 되었습니다.");
				response.sendRedirect(request.getContextPath() + "/list.fb?currentPage=1");

				request.setAttribute(boardTitle, boardTitle);

		
		}

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
