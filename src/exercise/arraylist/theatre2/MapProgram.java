package exercise.arraylist.theatre2;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a compiled high level oops language, platform independent");
		languages.put("python", "an interpreted high level oops language");
		languages.put("Algol", "algrothimic language");
		languages.put("BASIC", "Begineers All purporse symbolic instruction code");
		languages.put("Lisp", "Therin lies madness");

		System.out.println(languages.get("Java"));
		// languages.put("Lisp", "In lies madness");

		System.out.println(languages.get("Lisp"));

		// Print previous value, if not exists, prints null
		System.out.println(languages.put("Lisp", "In lies madness"));
		System.out.println(languages.get("Lisp"));

		for (String key : languages.keySet()) {
			System.out.println(key + ":" + languages.get(key));
		}

		// Remove
		languages.remove("Lisp");

		if (languages.remove("Algol", "algrothimic language"))
			System.out.println("Removed Algol");
		else
			System.out.println("Key value pair not found");

		// Replace

		languages.replace("python", "an interpreted high level oops language", "an oops language");

		System.out.println(languages.replace("python", "an oops language"));

		System.out.println("============");

		for (String key : languages.keySet()) {
			System.out.println(key + ":" + languages.get(key));
		}

	}
}
