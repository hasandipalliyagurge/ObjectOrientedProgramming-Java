class Queue{
	private int[] dataArray;
	private int nextIndex;
	//
	public Queue(int size){
		dataArray=new int[size];
	}
	
	public void enQueue(int data){
		if (nextIndex>=dataArray.length)
		{
			System.out.println("Queue is full..");
		}
		else
			dataArray[nextIndex++]=data;
	}
	public void printQueue(){
		System.out.print("[");
		for (int i = 0; i<nextIndex; i++){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(nextIndex==0 ? "empty]": "\b\b]");
	}
	public void deQueue(){
		if(nextIndex>= dataArray.length){
			System.out.println("Que is empty..");
		}
		for (int i = 0; i <= nextIndex; i++)
		{
			dataArray[i]=dataArray[i+1];
		}
		
	}
}
class Queue1{
	public static void main(String args[]) {
		Queue q1=new Queue(10);
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.printQueue(); //[10,20,30,40,50]
		
		q1.deQueue();
		q1.printQueue(); //[20,30,40,50]
	}
}
