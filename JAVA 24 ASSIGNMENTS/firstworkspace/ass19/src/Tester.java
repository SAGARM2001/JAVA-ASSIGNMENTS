class Account
{
	private int balance;
	
	public Account(int b) {  //parameterized constructor
		balance=b;
	}
	public void deposit(int amount) {  //deposit method
		balance=balance+amount;
	}
	public void withdraw(int amount) throws Exception {   //withdraw method
		if(amount>balance)
			throw new Exception("Insufficient balance");
		else if(amount>15000)
			throw new Exception("Overlimit");
		balance=balance-amount;
	}
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(35000);
		try {
			ac.withdraw(85000);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
