package Daos.Offre;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Daos.DB.DBConnect;
import Models.Offre.Offre;

public class OffreDAO {
	 public static int idCondidatStatic = 1;
	
	

	

	public static int AjouterOffer(Offre offre) {
	    int idOffre = -1; // تخزين الـ ID الجديد
	    try {
	        // SQL لإدراج العرض
	        String sql = "INSERT INTO OffreEmploi(Titre, Description, category) VALUES (?, ?, ?)";
	        Connection coon = DBConnect.getCoon();
	        
	       
	        PreparedStatement stm = coon.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	        stm.setString(1, offre.getTitre());
	        stm.setString(2, offre.getDescription());
	        stm.setString(3, offre.getCategory());

	        int rowsInserted = stm.executeUpdate();
	        
	        // استرجاع الـ ID الجديد
	        if (rowsInserted > 0) {
	            ResultSet generatedKeys = stm.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                idOffre = generatedKeys.getInt(1); // استخراج ID
	            }
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return idOffre; // إرجاع ID العرض المدخل
	}
	
	
	public static boolean PostulerOffre(int idOffre) {
	    int idCondidat = OffreDAO.idCondidatStatic; // استعملنا static ID مؤقتًا
	    boolean result = false;
	    try {
	        Connection coon = DBConnect.getCoon();
	        String sql = "INSERT INTO Condidature(idOffre, idCondidat) VALUES (?, ?)";
	        PreparedStatement stm = coon.prepareStatement(sql);
	        stm.setInt(1, idOffre);
	        stm.setInt(2, idCondidat);
	        result = stm.executeUpdate() > 0;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}



	
	
	  public static List<Offre> getAllOffres(){
		  List<Offre> offres=new ArrayList<Offre>();
		  
		  try {
			  String sql ="SELECT * FROM OffreEmploi";
			  Connection coon = DBConnect.getCoon();
			  Statement stm = coon.createStatement();
			  ResultSet rs = stm.executeQuery(sql);
			  while (rs.next()) {
				  Offre offre = new Offre(
						  rs.getString("titre"),
						  rs.getString("description"),
						  rs.getString("category")
						  );
				  
				  offre.setDatePublication(rs.getTimestamp("datePublication"));
				  offres.add(offre);
				  
				
			}
			
		} catch (Exception e) {
			  e.printStackTrace();
		}
		  
		  
		  return offres;
	  }

	
	
	

}
