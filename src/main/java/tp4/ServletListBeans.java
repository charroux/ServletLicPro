package tp4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletListBeans extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
		Enumeration<String> names = req.getParameterNames();
		String name;
		while(names.hasMoreElements()){
			name = names.nextElement();
			String nom = req.getParameter(name);
			Etudiant etudiant = new Etudiant(nom);
			etudiants.add(etudiant);
		}
		req.setAttribute("etudiants", etudiants);
		getServletContext().getRequestDispatcher("/jspListeBeans.jsp").forward(req, resp);
	}

	
}
;