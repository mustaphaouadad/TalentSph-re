package Daos.Offre;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Models.Offre.Offre;

public class OffreDAO {
	
	private static Connection coon;

	public OffreDAO(Connection coon) {
		super();
		this.coon = coon;
	}

	public static int AjouterOffer(Offre offre) {
		int result=0;
		try {
			String sql="INSERT INTO OffreEmploi(Titre,Description,category)values(?,?,?)";
			PreparedStatement stm= coon.prepareStatement(sql);
			stm.setString(1, offre.getTitre());
			stm.setString(2, offre.getDescription());
			stm.setString(3, offre.getCategory());
			result=stm.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
		
	}
	
	
	  public static List<Offre> getAllOffres(){
		  List<Offre> offres=new ArrayList<Offre>();
		  
		  try {
			  String sql ="SELECT * FROM OffreEmploi";
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
