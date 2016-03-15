package tp3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletPremiereJSP
 */
public class ServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie = new Cookie("utilisateur", "123");
		response.addCookie(cookie);
		response.sendRedirect("cookie.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String produit = request.getParameter("produit");
		HttpSession httpSession = request.getSession();
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie: cookies){
			if(cookie.getName().equals("utilisateur")){
				httpSession.setAttribute("produit", produit);
				System.out.println(cookie.getValue());
			}
		}
	}

}
