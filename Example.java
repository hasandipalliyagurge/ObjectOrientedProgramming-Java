import java.util.*;
class Example {
	public static void increment(int a, int b, int c){
		a++;
		b++;
		c++;
		
	}
	public static void increment(int[] ar){
		for (int i = 0; i < ar.length; i++){
			ar[i]++;
		}
	}
    public static void main(String args[]) {
		int[] x={100,200,300};
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
		
		increment(x[0], x[1], x[2]); //Method call by values
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
		
		increment(x); //method call by reference
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
	}
}
