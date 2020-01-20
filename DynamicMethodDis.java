class A{
	int a=100;
	public void printA(){
		System.out.println("a : "+a);
	}
	public void mymethod(int x){
		System.out.println("mymethod(int) of A");
	}
}
class B extends A{
	int b=200;
	public void mymethod(int x){ 
		System.out.println("mymethod(int) of B");
	}
	public void printB(){
		System.out.println("b : "+b);
	}
}
class DynamicMethodDis{
	public static void main(String args[]) {
		A a1;
		
		a1=new A();
		a1.mymethod(100); //No dynamic method dispatch
		
		a1=new B();
		a1.mymethod(100); //dynamic method dispatch
		
		B b1=new B();
		b1.mymethod(100);//No dynamic method dispatch
	}
}
