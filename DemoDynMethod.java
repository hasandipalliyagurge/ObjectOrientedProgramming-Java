class A{
	public void mymethod(int x){
		System.out.println("mymethod(int) of A");
	}
	public void callMethods(int i){
		mymethod(i);
	}
}
class B extends A{
	public void mymethod(int x){ 
		System.out.println("mymethod(int) of B");
	}
}
class DemoDynMethod{
	public static void main(String args[]) {
		A a1=new A();
		a1.mymethod(100);
		a1.callMethods(100);
		
		A a2=new B();
		a2.mymethod(200);
		a2.callMethods(200); 
		
		B b1=new B();
		b1.mymethod(100);
		b1.callMethods(200);
	}
}
