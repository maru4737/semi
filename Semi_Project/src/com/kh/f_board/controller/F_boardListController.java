package com.kh.f_board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.common.model.vo.PageInfo;
import com.kh.f_board.model.service.BoardService;
import com.kh.f_board.model.vo.Board;

/**
 * Servlet implementation class F_boardListController
 */
@WebServlet("/list.fb")
public class F_boardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public F_boardListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 쿼리스트링으로 요청 /jsp/list.bo?currentPage=1 => GET 인코딩X

		// 2) request 로 부터 값 뽑기

		// ----------- 페이징 처리 -----------
		// 필요한 변수들
		int listCount; // 현재 일반게시판의 게시글 총 갯수 => BOARD 로 부터 조회 COUNT(*) 활용 (STATUS = 'Y')
		int currentPage; // 현재 페이지 (즉, 사용자가 요청한 페이지) => request.getParameter("currentPage");
		int pageLimit; // 페이지 하단에 보여질 페이징바의 페이지 최대 갯수 => 10 개로 고정
		int boardLimit; // 한 페이지에 보여질 게시글의 최대 갯수 => 10 개로 고정

		int maxPage; // 가장 마지막 페이지가 몇번 페이지인지 (== 총 페이지의 갯수)
		int startPage; // 페이지 하단에 보여질 페이징바의 시작수
		int endPage; // 페이지 하단에 보여질 페이징바의 끝수

		listCount = new BoardService().selectListCount();
		
		// * currrentPage : 현재페이지 (== 사용자가 요청한 페이지)
		currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		// * pageLimit : 페이징바의 페이지 최대 갯수
		pageLimit = 10;
		
		// * boardLimit : 한 페이지에 보여질 게시글의 최대 갯수
		boardLimit = 10;
		
		// System.out.println("wlist" +listCount);
		// System.out.println(currentPage);
		

		maxPage = (int) Math.ceil((double) listCount / boardLimit);

		startPage = (currentPage - 1) / pageLimit * pageLimit + 1;

		endPage = startPage + pageLimit - 1;

		if (endPage > maxPage) {
			endPage = maxPage;
		}

		// 3) VO 로 가공
		PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);

		// 4) Service 단으로 토스
		ArrayList<Board> list = new BoardService().selectList(pi);

		// 5) 응답뷰 지정 => list, pi 를 넘겨서
		request.setAttribute("list", list); // 우리가 실제로 조회한 한 페이지에 보일 10개의 게시글
		request.setAttribute("pi", pi); // 페이징바를 만들때 필요한 변수

		request.getRequestDispatcher("views/board/boardListView.jsp").forward(request, response);

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
