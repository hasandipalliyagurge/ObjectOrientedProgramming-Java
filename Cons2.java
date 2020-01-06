class A{
	int a;
	A(int a){this.a=a;}
	public void printA(){
		System.out.println("a : "+a);
	}
	public int getA(){
		return a;
	}
	public A getCopy(){
		return new A(a+10);
	}
}
class Cons2{
	public static void main(String args[]) {
		A a1=new A(100);
		A a2=a1.getCopy();
		A a3=new A(200).getCopy();
		a1.printA();
		a2.printA();
		a3.printA();
		System.out.println(new A(300));
		System.out.println(new A(300).getCopy());
		System.out.println(new A(300).getCopy().getA());
	}
}
