package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;

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
	
	
	
	

}
