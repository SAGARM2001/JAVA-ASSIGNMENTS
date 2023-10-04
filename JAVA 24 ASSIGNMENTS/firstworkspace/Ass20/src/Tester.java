import java.util.Scanner;

class MyThreads extends Thread{
	private int t1;
	
	public MyThreads(int t1) {
		this.t1=t1;
	}
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Incremented Values:"+t1+i);
	}
}

class Multiply extends Thread{
	private int t2;
	
	public Multiply(int t2) {
		this.t2=t2;
	}
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("Multiplication Table"+t2*i);
	}
}
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.print("Enter a number:");
		no=sc.nextInt();
		
		
		MyThreads in = new MyThreads(no);
		Multiply ml = new Multiply(no);
		
		Thread t1 = new Thread(in);
        Thread t2 = new Thread(ml);

        t1.start();
        t2.start();
		
		
		
	}

}
