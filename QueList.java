class Queue{
	private Node front;
	
	public void enQueue(int data){
		Node n1=new Node(data);
		if(front==null){
			front=n1;
		}else{
			Node temp=front;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n1;
		}
	}
	public int peek(){
		return front==null ? -1 : front.data;
	}
	public void deQueue(){
		if(front!=null){
			front=front.next;
		}
	}
	public int size(){
		int count=0;
		Node temp=front;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public void printQueue(){
		System.out.print("[");
		Node temp=front;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(front==null ? "empty]":"\b\b]");
			
	}	
	class Node{
		private int data;
		private Node next;
		Node(int data){this.data=data;}
	}
	public void clear(){
		front=null;
	}
	
}
class QueList{
	public static void main(String args[]) {
		Queue q1=new Queue();
		q1.enQueue(100);	
		q1.enQueue(200);	
		q1.enQueue(300);	
		q1.enQueue(400);	
		q1.enQueue(500);	
		q1.printQueue(); //[100,200,300,400,500]
		
		q1.deQueue();
		q1.printQueue(); //[200,300,400,500]
	}
}
