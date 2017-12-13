package tp3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletBean extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n = req.getParameter("nom");
		String p = req.getParameter("prenom");
		Personne pers = new Personne(n, p);
		req.setAttribute("personne", pers);
		getServletContext().getRequestDispatcher("/jspBean.jsp").forward(req, resp);
	}

	
}
