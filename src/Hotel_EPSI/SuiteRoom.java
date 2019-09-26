package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;

public class SuiteRoom extends Chambre {
	static ArrayList<SuiteRoom> suiteroom = new ArrayList<SuiteRoom>();
	
	public SuiteRoom(int capacity , double price , int idRoom , String name , LocalDate reservation) {
		super(capacity ,price , idRoom ,name ,reservation);
	}
	
	public void createFamilyRoom(SuiteRoom suiteroomobj) {
		suiteroom.add(suiteroomobj);
		super.createChambre(suiteroomobj);
	}
	
	
	// Affiche le contenu de l'arraylist chambre
	public void getSingle() {
		 for(SuiteRoom elem: suiteroom)
	       {
	       	 System.out.println ("capacité : " +elem.getCapacity());
	       	 System.out.println ("prix : " +elem.getPrice());
	       	 System.out.println ("numéro : " +elem.getIdRoom());
	       	 System.out.println ("nom : " +elem.getName());
	       	System.out.println ("-------------------");
	       	 
	       }
	}
}
