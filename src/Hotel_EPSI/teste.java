package Hotel_EPSI;

import java.time.LocalDate;

public class teste {

	public static void main(String[] args) {
		// Client testeClient = new Client("Fievet" , "Jordan" , "adresseClient" , "070807081" ,"hello", "dateClient");
	//	System.out.println(testeClient.getMail());
		Chambre testChambre = new Chambre(2 , 50, 4, "appolo", LocalDate.of(2007, 9, 24) );
		System.out.println(testChambre.getReservationDate());
	}

}
