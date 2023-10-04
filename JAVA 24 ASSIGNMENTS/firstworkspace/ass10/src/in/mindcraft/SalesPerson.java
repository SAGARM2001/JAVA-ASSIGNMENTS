package in.mindcraft;

public class SalesPerson extends WageEmployees {
	private int sales;
	private int commission;
	
	public SalesPerson() {
		sales=0;
		commission=0;
		
	}
	public SalesPerson(int id,String n,int d, int m, int y, int h, int r,int s,int c) {
		super(id,n,d,m,y,h,r);
		sales = s;
		commission = c;
	}
	public void show() {
		super.show();
		System.out.println("sales:" +sales);
		System.out.println("commission:" +commission);
	}

	public int calsal() {
		return super.calsal() + sales*commission; //make it protected or getter setter or super
	}
	

}
