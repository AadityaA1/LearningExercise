package exercise.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(105, "Ram", 16));
		students.add(new Student(107, "Sabu", 12));
		students.add(new Student(102, "Saritha", 19));

		Collections.sort(students, new AgeComparator());

		for (Student st : students) {
			System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
		}

		Collections.sort(students, new NameComparator());

		for (Student st : students) {
			System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
		}

	}
}
