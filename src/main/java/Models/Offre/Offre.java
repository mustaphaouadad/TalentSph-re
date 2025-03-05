package Models.Offre;

import java.util.Date;

public class Offre {
	
	
        private int id;
	    private String titre;
	    private String description;
	    private Date datePublication;
	    private String category;
	    
	    
	    
		 // constructor vide
		public Offre() {
			
			
		}

  
		 // constructor non vide        
		public Offre(String titre, String description, String category) {
			this.titre = titre;
			this.description = description;
			this.datePublication = new Date();
			this.category = category;
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getTitre() {
			return titre;
		}


		public void setTitre(String titre) {
			this.titre = titre;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public Date getDatePublication() {
			return datePublication;
		}
		




		public void setDatePublication(Date datePublication) {
			this.datePublication = datePublication;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}
		  
		
	    
		
		
		
	    
	    
	
	

}
