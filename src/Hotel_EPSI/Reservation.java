package Hotel_EPSI;

import java.time.LocalDate;

public class Reservation {
	
	private LocalDate reservationDate;
	
	public Reservation(LocalDate reservationDate) {
		setReservationDate(reservationDate);
		System.out.println(reservationDate);
	}

	public LocalDate getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}

}
