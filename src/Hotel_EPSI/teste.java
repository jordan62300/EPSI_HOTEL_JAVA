package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;
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
			// Nombre de client supérieru a 0 et inférieur a 3 
			if(clientNumber > 0 && clientNumber < 3 ) {
				SingleRoom single = new SingleRoom();
				single.getAllSingleRoom();
				try {
				int roomNumber = single.getSingleRoomNumber();
				Scanner scan = new Scanner(System.in);
				System.out.println("Entrez votre date de reservation");
				System.out.println("Pour quelle année ? ( format: yyyy )");
				int year =  scan.nextInt();
				System.out.println("Pour quel mois ? ( format: m )");
				int month =  scan.nextInt();
				System.out.println("Pour quel jour ? ( format: dd )");
				int day =  scan.nextInt();
				LocalDate reservationDate  = LocalDate.of(year, month, day);
				Reservation reservation = new Reservation(reservationDate,roomNumber);
				reservation.createReservation(reservation);
				reservation.getAllReservation();
				SingleRoom singleRoomToRemove = single.getSinglerRoomByRoomNumber(roomNumber);
				single.removeSingleRoom(singleRoomToRemove);
				Chambre chambre = new Chambre();
				Chambre chambreToRemove = chambre.getRoomByRoomNumber(roomNumber);
				chambre.removeRoom(chambreToRemove);
				chambre.getChambre();
				System.out.println("Chambre reservé !")	;
				afficherMenuPrincipal();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			// Nombre de client pour chambre familiale
			} else if(clientNumber >2 && clientNumber <=6) {
				System.out.println("Chambre familiale : ");
				FamilyRoom family = new FamilyRoom();
				family.getAllFamilyRoom();
				try {
				int roomNumber = family.getFamilyRoomNumber();
				Scanner scan = new Scanner(System.in);
				System.out.println("Entrez votre date de reservation");
				System.out.println("Pour quelle année ? ( format: yyyy )");
				int year =  scan.nextInt();
				System.out.println("Pour quel mois ? ( format: m )");
				int month =  scan.nextInt();
				System.out.println("Pour quel jour ? ( format: dd )");
				int day =  scan.nextInt();
				LocalDate reservationDate  = LocalDate.of(year, month, day);
				Reservation reservation = new Reservation(reservationDate,roomNumber);
				reservation.createReservation(reservation);
				reservation.getAllReservation();
				FamilyRoom familyRoomToRemove = family.getFamilyRoomByRoomNumber(roomNumber);
				family.removeSingleRoom(familyRoomToRemove);
				Chambre chambre = new Chambre();
				Chambre chambreToRemove = chambre.getRoomByRoomNumber(roomNumber);
				chambre.removeRoom(chambreToRemove);
				chambre.getChambre();
				System.out.println("Chambre reservé !")	;
				afficherMenuPrincipal();
				} catch (Exception e) {
				
					e.printStackTrace();
				}
				// Nombre de client pour une suiteroom
			} else if(clientNumber>6 && clientNumber <10) {
				System.out.println("Suite disponible : ");
				SuiteRoom suite = new SuiteRoom();
				suite.getAllSingleRoom();
				try {
				int roomNumber = suite.getSuiteRoomNumber();
				Scanner scan = new Scanner(System.in);
				System.out.println("Entrez votre date de reservation");
				System.out.println("Pour quelle année ? ( format: yyyy )");
				int year =  scan.nextInt();
				System.out.println("Pour quel mois ? ( format: m )");
				int month =  scan.nextInt();
				System.out.println("Pour quel jour ? ( format: dd )");
				int day =  scan.nextInt();
				LocalDate reservationDate  = LocalDate.of(year, month, day);
				Reservation reservation = new Reservation(reservationDate,roomNumber);
				reservation.createReservation(reservation);
				reservation.getAllReservation();
				SuiteRoom suiteRoomToRemove = suite.getSuiteRoomByRoomNumber(roomNumber);
				suite.removeSingleRoom(suiteRoomToRemove);
				Chambre chambre = new Chambre();
				Chambre chambreToRemove = chambre.getRoomByRoomNumber(roomNumber);
				chambre.removeRoom(chambreToRemove);
				chambre.getChambre();
				System.out.println("Chambre reservé !")	;
				afficherMenuPrincipal();
				} catch (Exception e) {
				
					e.printStackTrace();
				}
			} else {
				System.out.println("Vous etes trop nombreux pour les chambres de cette hotel");
			}
		} else if(optionTaken == 3) {
			Reservation reservation = new Reservation();
			reservation.getAllReservation();
			afficherMenuPrincipal();
		} else if(optionTaken == 4) {
			System.out.println("Vous quittez l'application a+ ");
			System.exit(0);
		} else {
			System.out.println("Vous quittez l'application a+ ");
			System.exit(0);
		}
	}
	

	// Recupere le nombre de client
	public static int  getClientNumber() {
		 System.out.println("Combien etes vous ?");
		 Scanner scan = new Scanner(System.in);
		 int clientNumber = scan.nextInt();
		 System.out.println("Vous avez saisi : " + clientNumber + "\n ---------");
		 return clientNumber;
		
	}
	
	
	
	// montre toutes les chambres disponibles
	public static void showAllChamber() {
		 Chambre chambre = new Chambre();
		 chambre.getChambre();
	}
	
	

	public static void main(String[] args) {
		

		Hotel hotel = new Hotel("Le grand hotel BelleVue" ,"Addresse 12 rue des Oliviers, 83000 Cavalaires" );
		SingleRoom singleRoom = new SingleRoom(2 , 50, 4, "Romeo");
		SingleRoom singleRoom2 = new SingleRoom(2 , 50, 8, "Juliette" );
		SingleRoom singleRoom3 = new SingleRoom(2 , 50, 5, "Chirac" );
		FamilyRoom familyRoom = new FamilyRoom(5, 170 ,3,"Famille Adams");
		FamilyRoom familyRoom2 = new FamilyRoom(6, 170 ,1,"Famille Simpson");
		SuiteRoom suiteRoom = new SuiteRoom(10,300,2,"Party Room");
		singleRoom.createSingleRoom(singleRoom);
		singleRoom2.createSingleRoom(singleRoom2);
		singleRoom3.createSingleRoom(singleRoom3);
		familyRoom.createFamilyRoom(familyRoom);
		familyRoom2.createFamilyRoom(familyRoom2);
		suiteRoom.createSuiteRoom(suiteRoom);
		afficherMenuPrincipal();
	}

}
