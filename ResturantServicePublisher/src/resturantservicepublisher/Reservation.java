package resturantservicepublisher;


public class Reservation {
	private int ReservationID;
	private String customerName;
	private int noOfguests;
	private String phoneNumber;
	private String reservationDate;
	
	public Reservation() {
		super();
	}
	
	public Reservation(int reservationID, String customerName, int noOfguests, String phoneNumber) {
		super();
		ReservationID = reservationID;
		this.customerName = customerName;
		this.noOfguests = noOfguests;
		this.phoneNumber = phoneNumber;
	}
	
	public int getReservationID() {
		return ReservationID;
	}
	public void setReservationID(int reservationID) {
		ReservationID = reservationID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getNoOfguests() {
		return noOfguests;
	}
	public void setNoOfguests(int noOfguests) {
		this.noOfguests = noOfguests;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	
}
