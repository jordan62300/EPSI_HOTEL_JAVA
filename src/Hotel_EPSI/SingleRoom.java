package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SingleRoom extends Chambre{
	
	static ArrayList<SingleRoom> singleroom = new ArrayList<SingleRoom>();
	
	public SingleRoom(int capacity , double price , int idRoom , String name) {
		super(capacity ,price , idRoom ,name);
	}
	
	public SingleRoom() {
		
	}
	
	public void createSingleRoom(SingleRoom singleRoomObj) {
		singleroom.add(singleRoomObj);
		super.createChambre(singleRoomObj);
	}
	
	public void removeSingleRoom(SingleRoom singleRoom) {
		singleroom.remove(singleRoom);
	}
	
	
	// Affiche le contenu de l'arraylist chambre
	public void getAllSingleRoom() {
		 for(SingleRoom elem: singleroom)
	       {
	       	 System.out.println ("capacité : " +elem.getCapacity());
	       	 System.out.println ("prix : " +elem.getPrice());
	       	 System.out.println ("numéro : " +elem.getIdRoom());
	       	 System.out.println ("nom : " +elem.getName());
	       	System.out.println ("-------------------");
	       	 
	       }
	}
	
	// recupere une chambre grace a son numero de chambre
	public static SingleRoom getSinglerRoomByRoomNumber(int roomNumber)
	{
	    for (SingleRoom elem : singleroom)
	    {
	        if(elem.getIdRoom() == roomNumber)
	            return elem;
	    }
	    return null; 
	}
	
	
	// Recupere le numero de chambre que l'utilisateur veut reserver ou renvoit une erreur si la chambre n'existe pas
	public static int getSingleRoomNumber() throws Exception {
		System.out.println ("Choisissez un numéro de chambre parmis celles proposées");
		Scanner scan = new Scanner(System.in);
		int roomNumber = scan.nextInt();
		Boolean numberExist = null;
		 for(SingleRoom elem: singleroom)
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
