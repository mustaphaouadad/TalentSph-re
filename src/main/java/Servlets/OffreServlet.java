package Servlets;

import java.io.IOException;

import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Daos.Offre.OffreDAO;
import Models.Offre.Offre;


@WebServlet("/OffreServlet")
public class OffreServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titre = request.getParameter("titre");
        String description = request.getParameter("description");
        String category = request.getParameter("category");

        Offre offre = new Offre();
        offre.setTitre(titre);
        offre.setDescription(description);
        offre.setCategory(category);

        // Appeler la méthode AjouterOffre pour insérer dans la DB
        int result = OffreDAO.AjouterOffer(offre);
        
        if (result > 0) {
            // Rediriger vers une page de confirmation ou vers la liste
            response.sendRedirect("displayOffreEmploi");
        } else {
            // Afficher une erreur si ça ne marche pas
            PrintWriter out = response.getWriter();
            out.println("Data not added ");
        }
    }
}
