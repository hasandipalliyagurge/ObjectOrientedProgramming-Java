class Customer{
	private int code;
	private String name;
	Customer(int code, String name){
		this.code=code;
		this.name=name;
	}
	public String toString(){
		return code+"-"+name;
	}
}
class Stack{
	private Node top;
	
	public void push(Customer c1){
		Node n1=new Node(c1);
		n1.next=top;
		top=n1;
	}
	private boolean isEmpty(){
		return top==null;
	}
	public Customer pop(){
		if(isEmpty()){
			return null;
		}else{
			Node temp=top;
			top=top.next;
			return temp.customer;
		}
	}
	public String toString(){
		String list="[";
		Node temp=top;
		while(temp!=null){
			list+=temp.customer+", "; //customer.toString()
			temp=temp.next;
		}		
		return top==null ? "[empty]" : list+"\b\b]";
	}
	class Node{
		Node(Customer customer){
			this.customer=customer;
		}
		private Customer customer;
		private Node next;
	}
}
class Demo{
	public static void main(String args[]) {
		Stack s1=new Stack();
		s1.push(new Customer(1001,"Danapala"));
		s1.push(new Customer(1002,"Gunapala"));
		s1.push(new Customer(1003,"Somapala"));
		s1.push(new Customer(1004,"Siripala"));
		System.out.println(s1); //[1004-Siripala, 1003-Somapala, 1002-Gunapala, 1001-Danapala]
		Customer c1=s1.pop();
		System.out.println("Top Customer : "+c1);//1004-Siripala
	}
}
