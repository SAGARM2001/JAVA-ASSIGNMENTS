package transposearr;

import java.util.Scanner;

public class Transposearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		int []arr2 = new int[6];
		int arr3[] = new int[7];
		
		int [][]a=new int[3][3];

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements for array:");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int []temp:a) {
			for(int val:temp) {
				System.out.print(val+" ");
			}
			System.out.println();
		}

		
		
//		System.out.println("The Transposed matrix is:");
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++)
//			{
//				b[j][i]=a[i][j];
//			}
//		}
//		for(int []temp:b) {
//			for(int val:temp) {
//				System.out.print(val+" ");
//			}
//			System.out.println();
//		}
		

	}

}
