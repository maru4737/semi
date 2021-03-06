package com.kh.f_board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.f_board.model.service.BoardService;
import com.kh.f_board.model.vo.Attachment;
import com.kh.f_board.model.vo.Board;

/**
 * Servlet implementation class F_boardDetailController
 */
@WebServlet("/detail.fb")
public class F_boardDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public F_boardDetailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int boardNo = Integer.parseInt(request.getParameter("bno"));
		
		// 3) 가공 => 패싱
		
		// 4) Service 단으로 토스 - 조회수 증가
		BoardService bService = new BoardService();
		
		int result = bService.increaseCount(boardNo);
		
		
		// 조회수가 성공적으로 증가되었다면 => board, attachment 테이블 조회
		if(result > 0) {

			// board 조회
			Board b = bService.selectBoard(boardNo);
			
			
			ArrayList<Attachment> list = new BoardService().selectAttachmentList(boardNo);
			
			int m = bService.maxBoard();
			
			
			request.setAttribute("b", b);
			
			request.setAttribute("m", m);
			
			request.setAttribute("list", list);
			
			
			
			// 화면 => 포워딩
			request.getRequestDispatcher("views/board/boardDetailView.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
