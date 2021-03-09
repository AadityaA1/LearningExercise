package exercise.hashcodeequals.student;

public class Student {

	private String rollNo;

	public Student(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public boolean equals(Object o) {
		if (o != null && o instanceof Student) {

			String rollNo = ((Student) o).getRollNo();
			if (rollNo.equals(this.rollNo)) {
				return true;
			}

		}
		return false;
	}

	public int hashCode() {
		System.out.println("In Hash code");
		return this.rollNo.hashCode();
	}
}
