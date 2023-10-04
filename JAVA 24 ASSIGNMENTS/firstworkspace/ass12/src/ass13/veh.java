package ass13;

class Vehicle implements Cloneable{
	private String vehNumber;
	private String vehName;
	private double vehPrice;
	
	public Vehicle() {
		
	}

	public Vehicle(String vehNumber, String vehName, double vehPrice) {
		this.vehNumber = vehNumber;
		this.vehName = vehName;
		this.vehPrice = vehPrice;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public void show() {
		System.out.println(vehNumber+" "+vehName+" "+vehPrice);
	}
}

public class veh {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle("MH05AB2244","Sagar",50000);
		Vehicle v1 = (Vehicle)vehicle.clone();
		vehicle.show();
		v1.show();

	}

}
