package exercise.comparable;

public class Student implements Comparable<Student> {

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

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}
