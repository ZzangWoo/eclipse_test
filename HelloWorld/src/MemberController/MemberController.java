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
		
		/****** URI���� �ʿ��� �κи� ������ ���� ������ �����ϴ� �κ� ******/
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
				System.out.println("ȸ������ ����");
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('ȸ�����Կ� �����߽��ϴ�.');");
				script.println("location.href = 'index.jsp';");
				script.println("</script>");
			}
			else
				System.out.println("ȸ������ ����");
			
		} else {
			System.out.println("��������");
		}
		
		
	}
}