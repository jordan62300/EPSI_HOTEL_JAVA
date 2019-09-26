package Hotel_EPSI;

import java.time.LocalDate;
import java.util.Scanner;

public class teste {
	
	protected static  int optionTaken;
	
	// Affiche le menu principale et recupere l'option de l'utilisateur
	public static void afficherMenuPrincipal() {
		 System.out.println ("--------- Reservation ---------");
		 System.out.println ("1. Lister les chambres");
		 System.out.println ("2. Reserver une chambre");
		 System.out.println ("3. Afficher les reservations");
		 System.out.println ("4. Quitter l'application");
		 System.out.println ("----------------------------");
		 Scanner scan = new Scanner(System.in);
		 optionTaken = scan.nextInt();
		 System.out.println("Vous avez saisi : " + optionTaken);
		 setup(optionTaken);
	}
	
	
	// Lance l'application en fonction de l'option choisi
	public static void setup(int optionTaken) {
		if(optionTaken == 1) {
			showAllChamber();
		} else if(optionTaken == 2) {
		int clientNumber =	getClientNumber();
			if(clientNumber == 1 ) {
				SingleRoom single = new SingleRoom();
				single.getAllSingleRoom();
				try {
					getRoomNumber();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
	// TODO
	public static int getRoomNumber() throws Exception {
		System.out.println ("Choisissez un numéro de chambre parmis celles proposées");
		 Scanner scan = new Scanner(System.in);
		int roomNumber = scan.nextInt();
		SingleRoom single = new SingleRoom();
		Boolean numberExist = null;
		 for(SingleRoom elem: single.singleroom)
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
	
	
	
	
	public static int  getClientNumber() {
		 System.out.println("Combien etes vous ?");
		 Scanner scan = new Scanner(System.in);
		 int clientNumber = scan.nextInt();
		 System.out.println("Vous avez saisi : " + clientNumber + "\n ---------");
		 return clientNumber;
		
	}
	
	
	
	
	public static void showAllChamber() {
		 Chambre chambre = new Chambre();
		 chambre.getChambre();
	}
	
	

	public static void main(String[] args) {
		//afficherMenuPrincipal();
		// Client testeClient = new Client("Fievet" , "Jordan" , "adresseClient" , "070807081" ,"hello", "dateClient");
	//	System.out.println(testeClient.getMail());
	//	Hotel hotel = new Hotel("Le grand hotel BelleVue" ,"Addresse 12 rue des Oliviers, 83000 Cavalaires" );
	//	Chambre testChambre = new Chambre(2 , 50, 4, "appolo", LocalDate.of(2007, 9, 24) );
	//	Chambre testChambre2 = new Chambre(2 , 50, 4, "eeeelo", LocalDate.of(2007, 9, 24) );
	//	SingleRoom singleRoom = new SingleRoom(2 , 50, 4, "single", LocalDate.of(2007, 9, 24) );
		SingleRoom singleRoom2 = new SingleRoom(2 , 50, 4, "single2" );
	//	afficherMenuPrincipal();
	//	Chambre teste = new Chambre();
	//	System.out.println(testChambre.getReservationDate());
	//	System.out.println(testChambre.afficherInfo());
	//	testChambre.createChambre(testChambre);
	//	testChambre2.createChambre(testChambre2);
	//	singleRoom.createSingleRoom(singleRoom);
		singleRoom2.createSingleRoom(singleRoom2);
		afficherMenuPrincipal();
	//	singleRoom.getChambre();
	//	singleRoom.getSingle();
		
	}

}
