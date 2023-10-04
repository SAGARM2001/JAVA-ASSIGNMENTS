package varargsdemo;

public class Varargs {

	//N numbers add karaych asel tr varargs use karaych
	//Varargs should be the last parameter in the list of parameters
	
	/*public static int add(int ...a, String s) this will give error, 
	write string first i.e (String s, int ...a)*/
	
	public static int add(int ...a) { 
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2,3,4,5,6,7,8,9));

	}

}
