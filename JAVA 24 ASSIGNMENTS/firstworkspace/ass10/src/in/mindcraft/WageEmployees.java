package in.mindcraft;

public class WageEmployees extends Employee{
	private int hours;
	private int rate;
	public WageEmployees() {
		hours=0;
		rate=0;
		
	}
	public WageEmployees(int id,String n,int d, int m, int y, int h, int r) {
		super(id,n,d,m,y);
		hours = h;
		rate = r;
	}
	public void show() {
		super.show();
		System.out.println("hours:" +hours);
		System.out.println("rate:" +rate);
	}
	public int calsal() {
		return hours*rate;
	}
	
	
}
