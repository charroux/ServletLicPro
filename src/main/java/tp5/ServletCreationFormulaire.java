package tp5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCreationFormulaire extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n = req.getParameter("nbEtudiants");
		int nbEtudiants = Integer.parseInt(n);
		req.setAttribute("nbEtudiants", nbEtudiants);
		getServletContext().getRequestDispatcher("/jspCreationFormulaire.jsp").forward(req, resp);
	}

	
}
;