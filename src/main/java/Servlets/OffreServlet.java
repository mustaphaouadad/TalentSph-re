package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Daos.Offre.OffreDAO;
import Models.Offre.Offre;


@WebServlet("/OffreServlet")
public class OffreServlet extends HttpServlet {
	
    public OffreServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titre=request.getParameter("titre");
		String description=request.getParameter("description");
		String category=request.getParameter("category");
		
		Offre offre= new Offre();
		offre.setTitre(titre);
		offre.setDescription(description);
		offre.setCategory(category);
		
		
		int result =OffreDAO.AjouterOffer(offre);
		 if (result>0) {
			 response.sendRedirect("");
			
		} else {
			PrintWriter out = response.getWriter();
			out.println("Data not add ");

		}
		
	}

}
