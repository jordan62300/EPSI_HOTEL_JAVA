package Hotel_EPSI;

import java.time.LocalDate;
import java.util.Scanner;

public class teste {
	
	protected static  int optionTaken;
	
	public void afficherMenuPrincipal() {
		 System.out.println ("--------- Reservation ---------");
		 System.out.println ("1. Lister les chambres");
		 System.out.println ("2. Reserver une chambre");
		 System.out.println ("3. Afficher les reservations");
		 System.out.println ("4. Quitter l'application");
		 System.out.println ("----------------------------");
		 Scanner scan = new Scanner(System.in);
		 optionTaken = scan.nextInt();
		 System.out.println("Vous avez saisi : " + optionTaken);
		 
	}
	
	

	public static void main(String[] args) {
	// utile	afficherMenuPrincipal();
		// Client testeClient = new Client("Fievet" , "Jordan" , "adresseClient" , "070807081" ,"hello", "dateClient");
	//	System.out.println(testeClient.getMail());
		Hotel hotel = new Hotel("Le grand hotel BelleVue" ,"Addresse 12 rue des Oliviers, 83000 Cavalaires" );
	//	Chambre testChambre = new Chambre(2 , 50, 4, "appolo", LocalDate.of(2007, 9, 24) );
	//	Chambre testChambre2 = new Chambre(2 , 50, 4, "eeeelo", LocalDate.of(2007, 9, 24) );
		SingleRoom singleRoom = new SingleRoom(2 , 50, 4, "single", LocalDate.of(2007, 9, 24) );
		SingleRoom singleRoom2 = new SingleRoom(2 , 50, 4, "single2", LocalDate.of(2007, 9, 24) );
	//	System.out.println(testChambre.getReservationDate());
	//	System.out.println(testChambre.afficherInfo());
	//	testChambre.createChambre(testChambre);
	//	testChambre2.createChambre(testChambre2);
		singleRoom.createSingleRoom(singleRoom);
		singleRoom2.createSingleRoom(singleRoom2);
		singleRoom.getChambre();
	//	singleRoom.getSingle();
		
	}

}
