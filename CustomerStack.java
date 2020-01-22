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
	
	public void push(Object obj){
		Node n1=new Node(obj);
		n1.next=top;
		top=n1;
	}
	private boolean isEmpty(){
		return top==null;
	}
	public Object pop(){
		if(isEmpty()){
			return null;
		}else{
			Node temp=top;
			top=top.next;
			return temp.obj;
		}
	}
	public String toString(){
		String list="[";
		Node temp=top;
		while(temp!=null){
			list+=temp.obj+", "; 
			temp=temp.next;
		}		
		return top==null ? "[empty]" : list+"\b\b]";
	}
	class Node{
		Node(Object obj){
			this.obj=obj;
		}
		private Object obj;
		private Node next;
	}
}
class Item{
	private String code;
	Item(String code){this.code=code;}
	public String toString(){
		return code;
	}
}
class CustomerStack{
	public static void main(String args[]) {
		Stack customerStack=new Stack();
		customerStack.push(new Customer(1001,"Danapala"));
		customerStack.push(new Customer(1002,"Gunapala"));
		customerStack.push(new Customer(1003,"Somapala"));
		customerStack.push(new Customer(1004,"Siripala"));
		System.out.println(customerStack); //[1004-Siripala, 1003-Somapala, 1002-Gunapala, 1001-Danapala]
		
		Stack itemStack=new Stack();
		itemStack.push(new Item("P001"));
		itemStack.push(new Item("P002"));
		itemStack.push(new Item("P003"));
		itemStack.push(new Item("P004"));
		System.out.println(itemStack); //[P004, P003, P002, P001]
	}
}
