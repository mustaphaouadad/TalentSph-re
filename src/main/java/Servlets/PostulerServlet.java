package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Daos.Offre.OffreDAO;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/PostulerServlet")
public class PostulerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idOffre = Integer.parseInt(request.getParameter("idOffre"));
        
        boolean success = OffreDAO.PostulerOffre(idOffre);
        
        if (success) {
            response.sendRedirect("offres.jsp?message=Postulation réussie");
        } else {
            response.sendRedirect("offres.jsp?message=Erreur lors de la postulation");
        }
    }
}




