package in.mindcraft;

public class Employee {
	private int empid;
	private String name;
	private Date dob;   //employee class is having object of date class
	
	public Employee() {
		empid=101;
		name="sagar";
		dob=new Date();   //default values jya Date class file madhe default constructor madhe ahe
	}
	
	public Employee(int id, String n, int d, int m, int y) {
		empid=id;
		name=n;
		dob=new Date(d,m,y);
	}
	
	public void show() {
		System.out.println("empid:"+empid);
		System.out.println("name:"+name);
		dob.show();
	}
	}

