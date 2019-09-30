package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SuiteRoom extends Chambre {
	static ArrayList<SuiteRoom> suiteroom = new ArrayList<SuiteRoom>();
	
	public SuiteRoom(int capacity , double price , int idRoom , String name) {
		super(capacity ,price , idRoom ,name );
	}
	
	public SuiteRoom() {
		
	}
	
	public void createSuiteRoom(SuiteRoom suiteroomobj) {
		suiteroom.add(suiteroomobj);
		super.createChambre(suiteroomobj);
	}
	
	
	// Affiche le contenu de l'arraylist chambre
	public void getAllSingleRoom() {
		 for(SuiteRoom elem: suiteroom)
	       {
	       	 System.out.println ("capacité : " +elem.getCapacity());
	       	 System.out.println ("prix : " +elem.getPrice());
	       	 System.out.println ("numéro : " +elem.getIdRoom());
	       	 System.out.println ("nom : " +elem.getName());
	       	System.out.println ("-------------------");
	       	 
	       }
	}
	
	// recupere une chambre grace a son numero de chambre

	public static SuiteRoom getSuiteRoomByRoomNumber(int roomNumber)
	{
	    for (SuiteRoom elem : suiteroom)
	    {
	        if(elem.getIdRoom() == roomNumber)
	            return elem;
	    }
	    return null;
	}
	
	public void removeSingleRoom(SuiteRoom suiteroomToRemove) {
		suiteroom.remove(suiteroomToRemove);
	}
	
	
	// Recupere le numero de chambre que l'utilisateur veut reserver ou renvoit une erreur si la chambre n'existe pas
	public static int getSuiteRoomNumber() throws Exception {
		System.out.println ("Choisissez un numéro de chambre parmis celles proposées");
		Scanner scan = new Scanner(System.in);
		int roomNumber = scan.nextInt();
		Boolean numberExist = null;
		 for(SuiteRoom elem: suiteroom)
	       {
	       	 if(roomNumber == elem.getIdRoom()) {
	       		 numberExist = true;
	       		 break;
	       	 } else {
	       		 numberExist = false;
	       	 }
	       	
	       }
		 if(!numberExist) {
			 System.out.println("Le numéro de chambre n'existe pas");
			 throw new Exception();
		 }
		 System.out.println("Le numéro de chambre est bien");
		 return roomNumber;
	}
}

