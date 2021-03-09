package exercise.list.flightbooking;

public class ReservationMain {
	public static void main(String[] args) {
		TicketReservation reservation = new TicketReservation();
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1231"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1232"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1233"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1234"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1235"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1236"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1237"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1238"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1239"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1230"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1211"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1222"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1225"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1226"));

		System.out.println(reservation.cancel("A1235"));
		System.out.println(reservation.bookFlight("Jack", "Tim", 13, "M", "economy", "A1227"));

	}
}
