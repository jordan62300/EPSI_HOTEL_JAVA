package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;

public class FamilyRoom extends Chambre {
	static ArrayList<FamilyRoom> familyroom = new ArrayList<FamilyRoom>();
	
	public FamilyRoom(int capacity , double price , int idRoom , String name , LocalDate reservation) {
		super(capacity ,price , idRoom ,name ,reservation);
	}
	
	public void createFamilyRoom(FamilyRoom familyroomobj) {
		familyroom.add(familyroomobj);
		super.createChambre(familyroomobj);
	}
	
	
	// Affiche le contenu de l'arraylist chambre
	public void getSingle() {
		 for(FamilyRoom elem: familyroom)
	       {
	       	 System.out.println ("capacité : " +elem.getCapacity());
	       	 System.out.println ("prix : " +elem.getPrice());
	       	 System.out.println ("numéro : " +elem.getIdRoom());
	       	 System.out.println ("nom : " +elem.getName());
	       	System.out.println ("-------------------");
	       	 
	       }
	}
}
