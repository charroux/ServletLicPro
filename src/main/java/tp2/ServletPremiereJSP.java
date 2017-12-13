package tp2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPremiereJSP extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("nom");
		req.setAttribute("name", s);
		getServletContext().getRequestDispatcher("/premiereJSP.jsp").forward(req, resp);
	}

	
}
