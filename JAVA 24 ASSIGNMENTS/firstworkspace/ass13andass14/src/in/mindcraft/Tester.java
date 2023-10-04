package in.mindcraft;

class Vehicle implements Cloneable {
	 private String vehicleNumber;
	 private String vehicleName;
	 private int vehiclePrice;

	public Vehicle(String number, String name, int price) {
        vehicleNumber = number;
        vehicleName = name;
        vehiclePrice = price;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Vehicle otherVehicle = (Vehicle) obj;
		return vehicleNumber.equals(otherVehicle.vehicleNumber) && vehicleName.equals(otherVehicle.vehicleName)
				&& vehiclePrice == otherVehicle.vehiclePrice;
	}

	@Override
	public int hashCode() {
		int result = vehicleNumber.hashCode();
		result = 31 * result + vehicleName.hashCode();
		result = 31 * result + vehiclePrice;
		return result;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String show() {
		return "Vnumber: " + vehicleNumber+ " Vname: " + vehicleName + " VPrice: " + vehiclePrice;
	}

}

public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v1 = new Vehicle("100", "TATA", 7500000);
		Vehicle v2 = new Vehicle("101", "MG", 9500000);
		System.out.println(" First vehicle: "+v1.show());
		System.out.println(" Second vehicle: "+v2.show());
				
		System.out.println(v1.equals(v2) ? " First and second Vehicle are equal." : " First and second Vehicle are not equal.");
        System.out.println(" Hash code for First: " + v1.hashCode());
        System.out.println(" Hash code for second: " + v2.hashCode());

		Vehicle v3 = (Vehicle) v1.clone();
		System.out.println(" clone of First is Third: "+v3.show());
	}
}
