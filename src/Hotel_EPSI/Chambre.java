package Hotel_EPSI;

import java.time.LocalDate;

public class Chambre extends Reservation {
	
	private int capacity;
	private double price;
	private int idRoom;
	private String name;
	
	
	public Chambre(int capacity , double price , int idRoom , String name , LocalDate reservation) {
		super(reservation);
	}


	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getIdRoom() {
		return idRoom;
	}


	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
