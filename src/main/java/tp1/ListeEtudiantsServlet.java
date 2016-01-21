package tp1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListeEtudiantsServlet
 */
public class ListeEtudiantsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeEtudiantsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> paramNames = request.getParameterNames();
		String paramName;
		String nom = null;
		String note = null;
		float noteFloat;
		ArrayList<Evaluation> evaluations = new ArrayList<Evaluation>();
		while(paramNames.hasMoreElements()){
			paramName = paramNames.nextElement();
			if(paramName.startsWith("nom")){
				nom = request.getParameter(paramName);
			} else {	// notes
				note = request.getParameter(paramName);
			}
			if(nom!=null && note!=null){
				noteFloat = Float.parseFloat(note);
				Evaluation evaluation = new Evaluation(nom, noteFloat);
				evaluations.add(evaluation);
				nom = null;
				note = null;
			}
		}
		request.setAttribute("evaluations", evaluations);
		getServletContext().getRequestDispatcher("/listeEtudiants.jsp").forward(request, response);
	}

}
