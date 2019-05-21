package MemberController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MemberDAO.MemberDAO;

@WebServlet("*.do")
public class MemberController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MemberDAO dao = MemberDAO.getInstance();
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		/****** URI에서 필요한 부분만 나눠서 따로 변수에 저장하는 부분 ******/
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String uriFinal = uri.substring(path.length()+1, uri.length()-3);
		/*************************************************/

		if (uriFinal.equals("MemberJoin")) {
			String userID = request.getParameter("userID");
			String userPW = request.getParameter("userPW");
			String userName = request.getParameter("userName");
			int userAge = Integer.parseInt(request.getParameter("userAge"));
			
			int rs = dao.insert(userID, userPW, userName, userAge);
			
			if (rs == 1) {
				System.out.println("회원가입 성공");
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('회원가입에 성공했습니다.');");
				script.println("location.href = 'index.jsp';");
				script.println("</script>");
			}
			else
				System.out.println("회원가입 실패");
			
		} else {
			System.out.println("에러에러");
		}
		
		
	}
}
