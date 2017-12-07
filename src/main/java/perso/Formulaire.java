package perso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Formulaire extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		System.out.println("nom = " + nom);
		
		String age = req.getParameter("age");
		System.out.println("age = " + age);
		
		//resp.sendRedirect("reponseStatique.html");
		req.setAttribute("nom", nom);
		req.setAttribute("age", age);
		getServletContext().getRequestDispatcher("/reponseDynamique.jsp").forward(req, resp);
	}
	
}
