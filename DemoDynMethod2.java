class A{
	public void mymethod(int x){
		System.out.println("mymethod(int) of A");
	}
	A(){
		mymethod(100);
	}
}
class B extends A{
	public void mymethod(int x){ 
		System.out.println("mymethod(int) of B");
	}
}
class DemoDynMethod2{
	public static void main(String args[]) {
		B b1=new B();
	}
}
