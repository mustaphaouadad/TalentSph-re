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

@WebServlet("/DisplayCandidatureByFullNameServlet")
public class DisplayCandidatureByFullNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	@Override
	public void init() throws ServletException {
		
		super.init();
		CandidatureDao c = new CandidatureDao();
	}



	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.print("servlet executed");

		
		List<Condidature> candidatures = (List<Condidature>) CandidatureDao.displayCandidatureByCandidatName();
		
		for (Condidature prod : candidatures) {
			 System.out.println(prod);
			}
		req.setAttribute("candidatures", candidatures);
		
	}
	





	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
