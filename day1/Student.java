package week1.day1;

public class Student {
	String studentName = "Rithu";
	int rollNo = 12;
	String collegeName = "Sri Sankara college";
	int markScored = 99;
	float cgpa = 99.15f;
	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.studentName);
		System.out.println(obj.rollNo);
		System.out.println(obj.collegeName);
		System.out.println(obj.markScored);
		System.out.println(obj.cgpa);
	}
}
