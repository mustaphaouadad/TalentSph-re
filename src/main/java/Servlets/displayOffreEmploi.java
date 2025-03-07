package Servlets;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import Daos.Offre.OffreDAO;
import Models.Offre.Offre;


@WebServlet("/displayOffreEmploi")
public class displayOffreEmploi extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        List<Offre> offres = OffreDAO.getAllOffres(); 
       
        request.setAttribute("offres", offres); 
   
        request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
