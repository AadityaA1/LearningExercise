package exercise.comparator;

public class Student {

	private String name;
	private int age;
	private int rollNo;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRollNo() {
		return rollNo;
	}

}
