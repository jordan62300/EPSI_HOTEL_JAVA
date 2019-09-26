package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;

public class Chambre extends Reservation {
	
	private int capacity;
	private double price;
	private int idRoom;
	private String name;
	
	static ArrayList<Chambre> chambre = new ArrayList<Chambre>();
	

	public Chambre(int capacity , double price , int idRoom , String name , LocalDate reservation) {
		super(reservation);
		setCapacity(capacity);
		setPrice(price);
		setIdRoom(idRoom);
		setName(name);
		
	}
	
	
	
	
	// Creation d'une chambre
	static void createChambre(Chambre chambreobj) {
		chambre.add(chambreobj);
	}
	
	
	// Affiche le contenu de l'arraylist chambre
	public void getChambre() {
		 for(Chambre elem: chambre)
	       {
	       	 System.out.println ("capacité : " +elem.capacity);
	       	 System.out.println ("prix : " +elem.price);
	       	 System.out.println ("numéro : " +elem.idRoom);
	       	 System.out.println ("nom : " +elem.name);
	       	System.out.println ("-------------------");
	       	 
	       }
	}
	
	
	
	// Affiche les infos de la chambre 
	
	public String afficherInfo() {
		return "le prix est de " +this.price+"€ la capacité est de : "+ this.capacity+" personne le numero de la chambre est le "+ this.idRoom + " son nom est : "+ this.name+ " et sa date de reservation est " + super.getReservationDate();
	}
	
	
	
	// GET & SET


	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getIdRoom() {
		return idRoom;
	}


	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
