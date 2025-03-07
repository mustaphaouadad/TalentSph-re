package Models.CondidatureModel;

public class Condidature {
	private int idCandidature;
	private String offreCompangName ;
	private String condida_name;
	private String condida_email;
	private String condida_tele;
	private String condida_cv;
	
	//constuctors
	public Condidature() {}

	public Condidature(int idCandidature, String offreCompangName, String condida_name, String condida_email,
			String condida_tele, String condida_cv) {
		super();
		this.idCandidature = idCandidature;
		this.offreCompangName = offreCompangName;
		this.condida_name = condida_name;
		this.condida_email = condida_email;
		this.condida_tele = condida_tele;
		this.condida_cv = condida_cv;
	}

	public Condidature(String offreCompangName, String condida_name, String condida_email, String condida_tele,
			String condida_cv) {
		super();
		this.offreCompangName = offreCompangName;
		this.condida_name = condida_name;
		this.condida_email = condida_email;
		this.condida_tele = condida_tele;
		this.condida_cv = condida_cv;
	}
	
	//getters && setters

	public int getIdCandidature() {
		return idCandidature;
	}

	public void setIdCandidature(int idCandidature) {
		this.idCandidature = idCandidature;
	}

	public String getOffreCompangName() {
		return offreCompangName;
	}

	public void setOffreCompangName(String offreCompangName) {
		this.offreCompangName = offreCompangName;
	}

	public String getCondida_name() {
		return condida_name;
	}

	public void setCondida_name(String condida_name) {
		this.condida_name = condida_name;
	}

	public String getCondida_email() {
		return condida_email;
	}

	public void setCondida_email(String condida_email) {
		this.condida_email = condida_email;
	}

	public String getCondida_tele() {
		return condida_tele;
	}

	public void setCondida_tele(String condida_tele) {
		this.condida_tele = condida_tele;
	}

	public String getCondida_cv() {
		return condida_cv;
	}

	public void setCondida_cv(String condida_cv) {
		this.condida_cv = condida_cv;
	}

	@Override
	public String toString() {
		return "Condidature [offreCompangName=" + offreCompangName + ", condida_name=" + condida_name
				+ ", condida_email=" + condida_email + ", condida_tele=" + condida_tele + ", condida_cv=" + condida_cv
				+ "]";
	};
	
	
	
	
	

}
