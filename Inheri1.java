class A{
	int a=100;
	public void printA(){
		System.out.println("a : "+a);
	}
}
class B extends A{
	int b=200;
	
	public void printB(){
		System.out.println("b : "+b);
	}
	public void printAB(){
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	public void callPrint(){
		printA();
		printB();
	}
}
class  inherit1{
	public static void main(String args[]) {
		B b1=new B();
		b1.printAB();
		b1.callPrint();
	}
}
