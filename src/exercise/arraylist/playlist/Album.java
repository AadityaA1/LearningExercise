package exercise.arraylist.playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Album {

	private String name;
	private String artist;

	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		songs = new ArrayList<>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for (Song s : songs) {
			if (s.getTitle().equals(title)) {
				return s;
			}
		}
		return null;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		Song song = findSong(title);
		if (song != null) {
			ListIterator<Song> iterator = playlist.listIterator();
			while (iterator.hasNext()) {
				int compare = iterator.next().getTitle().compareTo(title);
				if (compare == 0) {
					return false;
				}
			}
			iterator.add(song);
			return true;
		}
		return false;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
		if (trackNumber <= 0 || trackNumber > songs.size()) {
			return false;
		}
		Song song = findSong(songs.get(trackNumber - 1).getTitle());
		if (song != null) {
			ListIterator<Song> iterator = playlist.listIterator();
			while (iterator.hasNext()) {
				int compare = iterator.next().getTitle().compareTo(songs.get(trackNumber - 1).getTitle());
				if (compare == 0) {
					return false;
				}
			}
			iterator.add(songs.get(trackNumber - 1));
			return true;
		}
		return false;
	}

	public void playMusic(LinkedList<Song> playlist) {
		ListIterator listIterator = playlist.listIterator();
		boolean goingForward = true;
		boolean quit = false;
		while (!quit) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your option");
			int menuOption = scanner.nextInt();
			switch (menuOption) {
			case 0:
				printMenu();
				break;
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Playing..." + listIterator.next());
				} else {
					System.out.println("Reached end of playlist");
				}
				break;
			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Playing..." + listIterator.previous());
				} else {
					System.out.println("Reached start of playlist");
				}
				break;
			case 3:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Playing..." + listIterator.previous());
						goingForward = false;
					} else
						System.out.println("Playing..." + "Reached start of playlist");
				} else {
					if (listIterator.hasNext()) {
						System.out.println(listIterator.next());
						goingForward = true;
					} else
						System.out.println("Reached end of playlist");
				}
				break;
			case 4:
				printPlaylist(playlist);
				break;
			case 5:
				System.out.println("Quitting the player");
				quit = true;
				break;
			}
		}
	}

	private void printPlaylist(LinkedList<Song> playlist) {
		// TODO Auto-generated method stub
		System.out.println("===============================");
		Iterator<Song> iterator = playlist.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("===============================");

	}

	private void printMenu() {
		System.out.println("**********************************************");
		System.out.println("Enter 0 to print menu");
		System.out.println("Enter 1 to Skip forward to next song");
		System.out.println("Enter 2 to Skip backward to previous song");
		System.out.println("Enter 3 to Replay the current song");
		System.out.println("Enter 4 to Print songs in playlist");
		System.out.println("Enter 5 to Quit");
		System.out.println("**********************************************");

	}

}
