package armstrong;

public class Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0, num=371, x, temp;
		temp=num;
		while(num!=0) { 
		x= num%10;
		num=num/10;
		sum=sum+x*x*x;}
		if(temp==sum)
			System.out.println("No is armstrong");
		else
			System.out.println("No is not armstrong");
		
	}

}
