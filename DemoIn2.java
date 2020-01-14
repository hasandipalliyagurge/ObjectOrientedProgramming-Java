class A{
	int a;
	A(){
		System.out.println("A()");
	}
	A(int i){
		System.out.println("A(int)");
	}
	A(int i, int j){
		System.out.println("A(int,int)");
	}
}
class B extends A{
	int b;
	B(){
		super(); //compiler inserts
		System.out.println("B()");
	}
	B(int i){
		super(); //compiler inserts
		System.out.println("B(int)");
	}
	B(int i, int j){
		super(); //compiler inserts
		System.out.println("B(int,int)");
	}
}
class DemoIn2{
	public static void main(String args[]) {
		new B();
		System.out.println("-------------");
		new B(10);
		System.out.println("-------------");
		new B(10,10);
	}
}
