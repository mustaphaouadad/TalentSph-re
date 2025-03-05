package Daos.Offre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import Models.Offre.Offre;

public class OffreDAO {
	
	private Connection coon;

	public OffreDAO(Connection coon) {
		super();
		this.coon = coon;
	}

	public void AjouterOffer(Offre offre) {
		try {
			String sql="INSERT INTO OffreEmploi(Titre,Description,category)values(?,?,?)";
			PreparedStatement stm= coon.prepareStatement(sql);
			stm.setString(1, offre.getTitre());
			stm.setString(2, offre.getDescription());
			stm.setString(3, offre.getCategory());
			stm.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	  public List<Offre> getAllOffres(){
		  List<Offre> offres=new ArrayList<>();
		  return offres;
	  }

	
	
	

}
