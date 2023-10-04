import in.mindcraft.*;
public class test {

	public static void main(String[] args) {

		Employee e1 = new WageEmployees();
		e1.show();
				
		WageEmployees we = new WageEmployees(111,"qbc", 2, 8, 01, 3, 40);
		we.show();
		we.calsal();
		
		SalesPerson sa = new SalesPerson(111,"qbc", 2, 8, 01, 3, 40,100,1000);
		sa.show();
		System.out.println("Salary is:"+sa.calsal());
	}

}
