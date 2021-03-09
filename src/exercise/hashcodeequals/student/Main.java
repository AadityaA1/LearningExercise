package exercise.hashcodeequals.student;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("121");
		Student s2 = new Student("121");

		System.out.println(s1.equals(s2));

		Map<Student, ReportCard> studentReportCard = new HashMap<>();

		studentReportCard.put(s1, new ReportCard());
		studentReportCard.put(s2, new ReportCard());

		// determine size
		System.out.println("Determine size");
		System.out.println(studentReportCard.size());

	}
}
