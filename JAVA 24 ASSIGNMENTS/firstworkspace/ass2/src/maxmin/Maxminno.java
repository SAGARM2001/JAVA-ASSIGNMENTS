//write a program to find out the max and min values from an integer array without sorting
package maxmin;

import java.util.Scanner;

public class Maxminno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five integers:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("max value:"+max);
		
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("min value:"+min);
	}

}
