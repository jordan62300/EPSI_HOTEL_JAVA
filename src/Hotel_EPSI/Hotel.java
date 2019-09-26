package Hotel_EPSI;

import java.util.ArrayList;

public class Hotel {
	private String nom;
	private String adresse;
	
	static ArrayList<Chambre> chambre = new ArrayList<Chambre>();
	
	
	
	public Hotel(String nom , String adresse) {
		setNom(nom);
		setAdresse(adresse);
	}
	
	// GET & SET

	public static void main(String[] args) {
		System.out.println("hello");
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
