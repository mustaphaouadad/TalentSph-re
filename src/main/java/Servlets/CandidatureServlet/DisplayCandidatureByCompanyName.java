package Servlets.CandidatureServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Daos.CandidatureDao.CandidatureDao;
import Models.CondidatureModel.Condidature;

@WebServlet("/DisplayCandidatureByCompanyName")
public class DisplayCandidatureByCompanyName extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.print("servlet executed");
		
		List<Condidature> candidatures = (List<Condidature>) CandidatureDao.displayCandidatureByCandidatName();
		request.setAttribute("candidatures", candidatures);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listCandidatureByCompanyName.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}    

}
