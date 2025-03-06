package Daos.CandidatureDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Daos.DB.DBConnect;
import Models.CondidatureModel.Condidature;

public class CandidatureDao {
	
	
	//fonction qui retoure les candidatures corespond a un condidat par condida_nom
	public static List displayCandidatureByCandidatName() {
		
		ArrayList<Condidature> candidatures = new ArrayList<>();
	
	try {
		String query =" select offreCompangName,condida_name,condida_email,condida_tele,condida_cv from condidature where condida_name = 'hajar zerhouni'";
		Connection connection = DBConnect.getCoon();
		PreparedStatement pst = connection.prepareStatement(query);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Condidature candidature = new Condidature();
			
			candidature.setOffreCompangName(rs.getString("offreCompangName"));
			candidature.setOffreCompangName(rs.getString("condida_name"));
			candidature.setCondida_email(rs.getString("condida_email"));
			candidature.setCondida_tele(rs.getString("condia_tele"));
			candidature.setCondida_cv(rs.getString("condida_cv"));
			
			candidatures.add(candidature);
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	return candidatures;
	}

	
	//fonction qui retourne la list des condidatures liées à un offre d'emploi
	
public static List displayCandidaturebyCompanyName() {
		
		ArrayList<Condidature> candidatures = new ArrayList<>();
	
	try {
		String query =" select condida_name,condida_email,condida_tele,condida_cv from condidature where offreCompangName = 'tesla'";
		Connection connection = DBConnect.getCoon();
		PreparedStatement pst = connection.prepareStatement(query);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Condidature candidature = new Condidature();
			
			
			candidature.setOffreCompangName(rs.getString("condida_name"));
			candidature.setCondida_email(rs.getString("condida_email"));
			candidature.setCondida_tele(rs.getString("condia_tele"));
			candidature.setCondida_cv(rs.getString("condida_cv"));
			
			candidatures.add(candidature);
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	System.out.print("data connecter succses");
	
	
	return candidatures;
	}
}
