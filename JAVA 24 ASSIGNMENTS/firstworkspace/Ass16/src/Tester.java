import java.util.*;

class Student
{
	private int rollno;
	private String name;
	private double percentage;
	private Set<String> skillset;
	
	public Student(int rollno, String name, double percentage, Set<String> skillset) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.skillset = skillset;
	}
}

class UtilityList
{
	private List<Student> list;

	public UtilityList(List<Student> list) {
		this.list = list;
	}
	public void createlist() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Student:");
		String name=sc.next();
		System.out.println("Enter the Rollno of Student:");
		int rollno=sc.nextInt();
		System.out.println("Enter the Percentage of Student:");
		double percent=sc.nextDouble();
	}
	public void printlist() {
		
	}
	
}
public class Tester {

	public static void main(String[] args) {

	}

}
