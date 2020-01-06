class A{
	int a;
	A(int a){this.a=a;}
	public void printA(){
		System.out.println("a : "+a);
	}
}
class Cons{
	public static void m(A ob){
		ob.printA();
	}
	public static int myMethod(){return 1;}
	public static void main(String args[]) {
		A a1=new A(100);
		a1.printA();
		//A a2=new A(300);
		System.out.println(new A(200));
		A a3=new A(200);
		//System.out.println(a3.printA());
		System.out.println(myMethod());
	}
}
