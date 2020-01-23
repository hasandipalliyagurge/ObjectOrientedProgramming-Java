import java.util.*;
class Customer{
	private int code;
	private String name;
	Customer(int code, String name){
		this.code=code;
		this.name=name;
	}
	public String toString(){
		return code+"-"+name;
	}
	/*
	public boolean equals(Object obj){
		 return this==obj;
	}
	*/
	public boolean equals(Object obj){
		 //return this.code==obj.code;
		 //Customer c1=obj;
		 Customer c1=(Customer)obj; //Object reference Casting
		 return this.code==c1.code;
	}
}
class Demo{
	public static void main(String args[]) {
		Customer c1=new Customer(1001,"Danapala");
		Customer c2=new Customer(1001,"Danapala");
		Customer c3=new Customer(1002,"Gunapala");
		Customer c4=c1;
		
		System.out.println(c1.equals(c2)); //false
		System.out.println(c1.equals(c3)); //false
		System.out.println(c1.equals(c4)); //true
		
	}
}
