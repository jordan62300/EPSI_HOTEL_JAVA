package Hotel_EPSI;

import java.time.LocalDate;

public class Reservation {
	
	private LocalDate reservationDate = LocalDate.of(2007, 9, 24);
	public Reservation(LocalDate reservationDate ) {
		setReservationDate(reservationDate);
	}
	
	public Reservation() {
		
	}


	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

}
