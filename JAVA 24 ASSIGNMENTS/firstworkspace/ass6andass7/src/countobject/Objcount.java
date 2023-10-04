package countobject;

class student {
	private int rollno;
	private String name;
	private double percentage;
	private static int count;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		student.count = count;
	}

	public student() {
		rollno = 10;
		name = "sagar";
		percentage = 70.5;
		count++;
	}

	// parameterized constructor
	public student(int rollno, String name, double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		count++;
	}

	@Override
	public String toString() {
		return "Roll No: " + rollno + ", Name: " + name + ", Percentage: " + percentage;
	}

	// show method
	public void show() {
		System.out.println(this.toString());
	}

	public static void showcount() {
		System.out.println("Number of objects:" + count);
	}
}

public class Objcount {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student(20, "hayat", 80.6);
		student s3 = new student();
		s1.show();
		s2.show();
		s3.show();
		student.showcount();

	}

}
