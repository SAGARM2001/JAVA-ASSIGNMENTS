import java.util.ArrayList;
import java.util.Scanner;


class Employee{
	private int empid;
	private String empname;
	private double salary;
	
	public Employee() {    //default constructor
		
	}
	public Employee(int empid, String empname, double salary) {    //parameterized constructor
		this.setEmpid(empid);
		this.empname = empname;
		this.salary = salary;
	}
	public void accept() {               //accept input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
		setEmpid(sc.nextInt());
		
		System.out.print("Enter Employee NAME: ");
		empname = sc.next();
		
		System.out.print("Enter Employee SALARY: ");
		salary = sc.nextDouble();
	}
	public void display() {         //display method of employee data
		System.out.println("Employee ID:"+getEmpid());
		System.out.println("Employee NAME:"+empname);
		System.out.println("Employee SALARY:"+salary);
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}

public class Assignemnt15 {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.println("--------------------------");
            System.out.println("1. Add record");
            System.out.println("2. Update");
            System.out.println("3. Display Records");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            System.out.println("--------------------------");

            switch (choice) {
                case 1:
                    Employee e = new Employee();
                    e.accept();
                    list.add(e); 
                    break;
                case 2:
                	System.out.print("Enter Employee ID to update information: ");
                    int empIdToUpdate = sc.nextInt();
                    boolean found = false;
                    for (Employee emp : list) {
                        if (emp.getEmpid() == empIdToUpdate) {
                            emp.accept();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + empIdToUpdate + " not found.");
                    }
                case 3:
                    if (choice == 3) {
                        for (Employee emp : list) {
                            emp.display();
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}