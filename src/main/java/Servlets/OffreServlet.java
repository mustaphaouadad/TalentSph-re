package Servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Daos.Offre.OffreDAO;
import Models.Offre.Offre;


@WebServlet("/OffreServlet")
public class OffreServlet extends HttpServlet {
	
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Offre>offres=OffreDAO.getAllOffres();
		request.setAttribute("offre", offres);
		request.getRequestDispatcher("").forward(request, response);
		
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
			 response.sendRedirect("ajout_offre.jsp");
			
		} else {
			PrintWriter out = response.getWriter();
			out.println("Data not add ");
			

		}
		
	}

}
