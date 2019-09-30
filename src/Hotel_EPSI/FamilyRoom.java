package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FamilyRoom extends Chambre {
	static ArrayList<FamilyRoom> familyroom = new ArrayList<FamilyRoom>();
	
	public FamilyRoom(int capacity , double price , int idRoom , String name ) {
		super(capacity ,price , idRoom ,name);
	}
	
	public FamilyRoom() {
		
	}
	
	public void createFamilyRoom(FamilyRoom familyroomobj) {
		familyroom.add(familyroomobj);
		super.createChambre(familyroomobj);
	}
	
	
	// Affiche le contenu de l'arraylist chambre
	public void getAllFamilyRoom() {
		 for(FamilyRoom elem: familyroom)
	       {
	       	 System.out.println ("capacité : " +elem.getCapacity());
	       	 System.out.println ("prix : " +elem.getPrice());
	       	 System.out.println ("numéro : " +elem.getIdRoom());
	       	 System.out.println ("nom : " +elem.getName());
	       	System.out.println ("-------------------");
	       	 
	       }
	}
	// recupere une chambre grace a son numero de chambre
	public static FamilyRoom getFamilyRoomByRoomNumber(int roomNumber)
	{
	    for (FamilyRoom elem : familyroom)
	    {
	        if(elem.getIdRoom() == roomNumber)
	            return elem;
	    }
	    return null; 
	}
	
	public void removeSingleRoom(FamilyRoom familyroomToRemove) {
		familyroom.remove(familyroomToRemove);
	}
	// Recupere le numero de chambre que l'utilisateur veut reserver ou renvoit une erreur si la chambre n'existe pas
	public static int getFamilyRoomNumber() throws Exception {
		System.out.println ("Choisissez un numéro de chambre parmis celles proposées");
		Scanner scan = new Scanner(System.in);
		int roomNumber = scan.nextInt();
		Boolean numberExist = null;
		 for(FamilyRoom elem: familyroom)
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
