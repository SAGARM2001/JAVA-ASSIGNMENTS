package ass11;

//Employee class
class Employee{
	private int empid;
	private String name;
	private double basicsal;
	
	public Employee() {

	}
	public Employee(int empid, String name, double basicsal) {
		this.empid = empid;
		this.name = name;
		this.basicsal = basicsal;
	}	
	public double getBasicSalary() {
	        return basicsal;
	    }
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public double getBasicsal() {
		return basicsal;
	}
	public void display() {
		System.out.println(empid+" "+name+" "+basicsal);
	}
	 
}

//Manager class
class Manager extends Employee{
	private double petrolAllowance;
    private double foodAllowance;
    private double otherAllowance;
    
    public Manager() {
    	
	}
	public Manager(int empid, String name, double basicsal) {
        super(empid, name, basicsal);
        calculateAllowances();
    }
    private void calculateAllowances() {
        petrolAllowance = 0.08 * getBasicSalary();
        foodAllowance = 0.12 * getBasicSalary();
        otherAllowance = 0.04 * getBasicSalary();
    }
	public double getPetrolAllowance() {
		return petrolAllowance;
	}
	public double getFoodAllowance() {
		return foodAllowance;
	}
	public double getOtherAllowance() {
		return otherAllowance;
	}
	public void display() {
		System.out.println(petrolAllowance+" "+foodAllowance+" "+otherAllowance);
	}
	public double calculateGrossSalary () {
		return getBasicsal() + petrolAllowance + foodAllowance + otherAllowance;
	}
	public double calculateNetSalary() {
		double pf = 0.125 * getBasicsal();
		return calculateGrossSalary() - pf;
	}
}

//MarketingExecutive class
class MarketingExecutive  extends Employee{
	private double kilometersTravelled;
    private double tourAllowance;
    private double telephoneAllowance=2000;

    public MarketingExecutive(int empid, String name, double basicsal, double kilometersTravelled) {
        super(empid, name, basicsal);
        this.kilometersTravelled = kilometersTravelled;
        calculateAllowances();
    }
    private void calculateAllowances() {
        tourAllowance = 5 * kilometersTravelled;
    }
	public double getKilometersTravelled() {
		return kilometersTravelled;
	}
	public double getTourAllowance() {
		return tourAllowance;
	}
	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}
	public void display() {
		System.out.println(kilometersTravelled+" "+tourAllowance+" "+telephoneAllowance);
	}
	public double calculateGrossSalary () {
		return getBasicsal() + tourAllowance + telephoneAllowance;
	}
	public double calculateNetSalary() {
		double pf = 0.125 * getBasicsal();
		return calculateGrossSalary() - pf;
	}
}
public class employe {
	public static void printobj(Employee e) {
		e.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(100,"Abc",20000);
		Manager ma = new Manager(101, "Saggy", 50000);
        MarketingExecutive me = new MarketingExecutive(102, "Sagar", 45000, 100);

        printobj(e);
        e.display();
        System.out.println(" ");
        // getter use kele values print sathi
        System.out.println("Manager Name: " + ma.getName());
        System.out.println("Petrol Allowance: " + ma.getPetrolAllowance());
        System.out.println("Food Allowance: " + ma.getFoodAllowance());
        System.out.println("Other Allowance: " + ma.getOtherAllowance());
        System.out.println("Gross Salary is:"+ma.calculateGrossSalary());
        System.out.println("Net Salary is:"+ma.calculateNetSalary());

        System.out.println("   ");
        
        System.out.println("Marketing Executive Name: " + me.getName());
        System.out.println("KiloMeters Travelled:"+me.getKilometersTravelled());
        System.out.println("Tour Allowance: " + me.getTourAllowance());
        System.out.println("Telephone Allowance: " + me.getTelephoneAllowance());
        System.out.println("Gross Salary is:"+me.calculateGrossSalary());
        System.out.println("Net Salary is:"+me.calculateNetSalary());

	}

}
