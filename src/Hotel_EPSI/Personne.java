package Hotel_EPSI;

public class Personne {
	
	private String nom = "george";
	private String prenom;
	private String dateDeNaissance;
	private String adresse;
	
	public Personne (String nom,String prenom ,String dateDeNaissance ,String adresse ) {
		setNom(nom);
		setPrenom(prenom);
		setDateDeNaissance(dateDeNaissance);
		setAdresse(adresse);
	}
	
	
	// GET & SET


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
