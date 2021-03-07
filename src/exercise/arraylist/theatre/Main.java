package exercise.arraylist.theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Cleopatra", 8, 12);

		// Separate arraylist where it is Shallow copied, where the reference is same
		// eg: if we reserve a seat in Seat copy list, the same seat will be reserved in
		// theatre list
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
		printList(seatCopy);

		seatCopy.get(1).reserve();
		if (theatre.reserveSeat("A02")) {
			System.out.println("Please pay for A02");
		} else {
			System.out.println("Seat already reserved");
		}

		// Reverse list
		Collections.reverse(seatCopy);
		System.out.println("Printing seatCopy");
		printList(seatCopy);
		System.out.println("Printing theatre.seat");
		printList(theatre.seats);

		// Shuffle list
		Collections.shuffle(seatCopy);

		System.out.println("Printing seatCopy");
		printList(seatCopy);
		System.out.println("Printing theatre.seat");
		printList(theatre.seats);

		// Get min seat
		Theatre.Seat minSeat = Collections.min(seatCopy);

		System.out.println("Min Seat number == " + minSeat.getSeatNumber());

		// Get max seat
		Theatre.Seat maxSeat = Collections.max(seatCopy);

		System.out.println("Max Seat number == " + maxSeat.getSeatNumber());

		// Sort - Bubble sort
		sortList(seatCopy);

		System.out.println("Sorted Seat copy");
		printList(seatCopy);

		// Copy list to new list

		// This will not work, since the copy list can be done only if the new list size
		// is equal to the old list size
		// In this below line, Array list will be initialized only with the size as
		// theatre.seats size but it doesn't have 96 elements
		List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
		Collections.copy(newList, theatre.seats);
	}

	public static void printList(List<Theatre.Seat> list) {
		for (Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("===============================================================================");
	}

	public static void sortList(List<? extends Theatre.Seat> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
					Collections.swap(list, i, j);
				}
			}
		}
	}

}
