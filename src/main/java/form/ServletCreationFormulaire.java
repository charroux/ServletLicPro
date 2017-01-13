package form;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletListeEtudiants
 */
public class ServletCreationFormulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationFormulaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		 
		String s = request.getParameter("nbPersonnes");
		int nbPersonnes = Integer.parseInt(s);
		request.setAttribute("nombrePersonnes", nbPersonnes);
		getServletContext().getRequestDispatcher("/formulaireCreeDynamiquement.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration<String> names = request.getParameterNames();
		String name;
		String value;
		ArrayList<form.Student> liste = new ArrayList<form.Student>();
		
		while(names.hasMoreElements()){
			name = names.nextElement();
			value = request.getParameter(name);
			Student student = new Student(value);
			liste.add(student);			
		}
		
		request.setAttribute("listeEtudiants", liste);
		
		getServletContext().getRequestDispatcher("/listeEtudiants.jsp").forward(request, response);
		
	}

}
