class A{
	int a=100;
	
}
class B extends A{
	int a=200;
	public void print(){
		int a=300;
		System.out.println("a of local : "+a); //300
		System.out.println("a of B     : "+this.a); //200
		System.out.println("a of A     : "+super.a); //100
	}	
}
class DemoAttri{
	public static void main(String args[]) {
		B b1=new B();
		b1.print();
		
		
	}
}
