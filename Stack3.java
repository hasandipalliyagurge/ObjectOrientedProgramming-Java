class Stack{
	private int[] dataArray;
	private int nextIndex;
	public Stack(int size){
		dataArray=new int[size];
	}
	public void push(int data){
		dataArray[nextIndex++]=data;
	}
}
class Stack3{
	public static void main(String args[]) {
		Stack s1=new Stack(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
	}
}
