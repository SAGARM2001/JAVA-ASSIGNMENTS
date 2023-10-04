package ass5;

import java.util.Scanner;

class AccountHolder{
	private int accountno;
	private String accholder;
	private double accbal;
	
	public AccountHolder() {
		accountno=101;
		accholder="sagar";
		accbal=2000.15;
	}
	
	public AccountHolder(int accountno, String accholder, double accbal) {
		this.accountno=accountno;
		this.accholder=accholder;
		this.accbal=accbal;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getAccholder() {
		return accholder;
	}

	public void setAccholder(String accholder) {
		this.accholder = accholder;
	}

	public double getAccbal() {
		return accbal;
	}

	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	
	public void show() {
		System.out.println(accountno+" "+accholder+" "+accbal);
	}
	
	public void deposit(double amt) {
		accbal+=amt;
	}
	
	public void withdraw(double amt) {
		accbal-=amt;
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder []accounholder = new AccountHolder[5];
		int choice,count=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your choice:");
			System.out.println("1.Add record for account holder");
			System.out.println("2. Display details of all account holders.");
			System.out.println("3. Deposite an amount into particular account");
			System.out.println("4. Withdraw an amount from particular account");
			System.out.println("5. Exit");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				if(choice==1) {
					System.out.println("Enter your account number:");
					int accountnum = sc.nextInt();
			
					System.out.println("Enter account holder name:");
					String accuholder = sc.next();
					
					System.out.println("Enter the account balance:");
					double accbal = sc.nextDouble();
					
					accounholder[count++]=new AccountHolder(accountnum,accuholder,accbal);
					System.out.println("Details added successfully");
					}
				else {
					System.out.println("enter valid choice:");}
				break;
			case 2:
				if(choice==2) {
					for(int i=0;i<count;i++)
						accounholder[i].show();
				}
				break;
			case 3:
				System.out.println("Enter the Account no:");
				int acno=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(accounholder[i].getAccountno()==acno) {
						System.out.println("Enter amt to be deposited:");
						accounholder[i].deposit(sc.nextDouble());					
						}
				}
				break;
			case 4:
				System.out.println("Enter account no:");
				int accno=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(accounholder[i].getAccountno()==accno) {
						System.out.println("Enter amt to be withdrawn:");
						accounholder[i].withdraw(sc.nextDouble());					
						}
				}
				break;
			case 5:
				System.exit(0);
			}
			
		}
			

	}

}
