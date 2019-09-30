package Hotel_EPSI;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
	
	private LocalDate reservationDate = LocalDate.of(2007, 9, 24);

	private int roomNumber;
	
	static ArrayList<Reservation> reservation = new ArrayList<Reservation>();
	
	public Reservation(LocalDate reservationDate,int roomNumber ) {
		setReservationDate(reservationDate);
		setRoomNumber(roomNumber);
	}
	
	public Reservation() {
		
	}


	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void createReservation(Reservation reservationObj) {
		reservation.add(reservationObj);
	}
	
	public void getAllReservation() {
		for(Reservation elem : reservation) {
			System.out.println("Numero de la chambre " + elem.getRoomNumber());
			System.out.println("date de reservation " + elem.getReservationDate());
		}
	}

}
