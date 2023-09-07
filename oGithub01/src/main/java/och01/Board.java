package och01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		// request Encoding 적용
		request.setCharacterEncoding("utf-8");

		// Parameter 받기
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");

		// response Encoding 적용
		response.setContentType("text/html;charset=utf-8");

		// 결과 보내기
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>게시판</h1>");
		out.println("제목: " + title + "<p>");
		out.println("작성자: " + writer + "<p>");

		/*
		GregorianCalendar gc = new GregorianCalendar(); SimpleDateFormat sdf = new
		SimpleDateFormat("YYYY-MM-dd(E) (a)hh:mm:ss"); Date date = gc.getTime();
		out.println("작성일: "+sdf.format(date)+"<br>");
		//작성일: 2023-08-16(수) (오후)05:01:41
 		*/
		
		//작성일: Wed Aug 16 17:02:42 KST 2023
		Date date = new Date(); 
		out.println("작성일: " + date.toString() + "<p>");

		out.println("내용" + "<br><pre>" + content + "</pre>");
		out.println("</body></html>");
		
		out.close();

		/*
		 * 제목: 안시성 
		 * 작성자: 양만춘 
		 * 작성일: Wed Aug 16 15:47:37 KST 2023 
		 * 내용 
		 * 당태종 체포
		 */

	}

}
