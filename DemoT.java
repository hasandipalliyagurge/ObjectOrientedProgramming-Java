class Test{
	int a;
	public void myMethod(){
		System.out.println(this);
	}
}
class DemoT{
	public static void main(String args[]){
		Test t1=new Test(); //object is test
		Test t2=new Test();
		
		System.out.println(t1);
		t1.myMethod();

		System.out.println(t2);
		t2.myMethod();
	}
}
