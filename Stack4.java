class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class Stack{
	Node top;
	public void push(int data){
		Node n1=new Node(data);
		n1.next=top;
		top=n1;
	}
	
public int size(){
        int count=0;
        Node temp=top;
       // System.out.println(" [ ");
        while(temp!=null){
			//System.out.print(temp.data+" , ");
				temp=temp.next;
				count++;
			}
		return count;	
		}	
	
public void clear(){
		top=null;
}	

public int peek(){
	if(top!=null){
		return top.data;
	}
	else
		return -1;
}	
	
	
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public void printStack(){
		System.out.print("[");
		Node temp=top;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(top==null ? "empty]":"\b\b]");
    }

}
class Stack4{
	public static void main(String args[]) {
		Stack s1=new Stack();
		s1.printStack(); //[empty]
		System.out.println("Size of the stack : "+s1.size()); //0
		
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.push(500);
		s1.printStack(); //[500, 400, 300, 200, 100]
		System.out.println("Size of the stack : "+s1.size());//5
		System.out.println("Top element of the stack : "+s1.peek()); //500
		
		s1.pop();
		s1.printStack(); //[400, 300, 200, 100]
		System.out.println("Size of the stack : "+s1.size());//5
		
		s1.clear();
		s1.printStack(); //[empty]
		System.out.println("Size of the stack : "+s1.size());//0
	}
}
