class Stack{
	private int[] dataArray;
	private int nextIndex;
	public Stack(int size){
		dataArray=new int[size];
	}
	public int size(){
		return nextIndex;
	}
	
	public void push(int data){
		dataArray[nextIndex++]=data;
	}
	public void printStack(){
		System.out.print("[");
		for (int i = nextIndex-1; i >=0; i--){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(nextIndex==0 ? "empty]": "\b\b]");
	}
	public void pop(){
		if(nextIndex>0){
			nextIndex--;
		}
	}
	public int peek(){
		return (dataArray[nextIndex-1]);
	}
}
class DemoStack2{
	public static void main(String args[]) {
		Stack s1=new Stack(10);
		s1.printStack(); //[empty]
		System.out.println("Size of the stack : "+s1.size());//0
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack();//[50, 40, 30, 20, 10]
		System.out.println("Size of the stack : "+s1.size());//5
		int data=s1.peek();	
		System.out.println("First element of the stack : "+data); //50
		s1.printStack();//[50, 40, 30, 20, 10]
		
		s1.pop();
		s1.printStack();//[40, 30, 20, 10]
	}
}
