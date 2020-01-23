class Stack<T>{          //T-any java class
	private Node top;
	
	public void push(T obj){
		Node n1=new Node(obj);
		n1.next=top;
		top=n1;
	}
	private boolean isEmpty(){
		return top==null;
	}
	public T pop(){
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
	public void callPark(int location){
		Node temp=top;
		if(temp==null){
			System.out.println("[Empty]");
		}else{
			while(temp!=null){
				temp.obj.toString(); //Illegal ?  //legal becuase toString is applicable to any object
				temp=temp.next;
			}
		}
	}
	class Node{
		Node(T obj){
			this.obj=obj;
		}
		private T obj;
		private Node next;
	}
}
class Vehicle{
	String id;
	Vehicle(String id){this.id=id;}
	public String toString(){
		return id;
	}
	public void park(){}
}
class Car extends Vehicle{
	Car(String id){super(id);}
	public void park(){
		System.out.println("Car Parking : "+id);
	}
}
class Van extends Vehicle{
	Van(String id){super(id);}	
	public void park(){
		System.out.println("Van Parking : "+id);
	}
}
	
class Bus extends Vehicle{
	Bus(String id){super(id);}	
	public void park(){
		System.out.println("Bus Parking : "+id);
	}
}

class Genaric{
	public static void main(String args[]) {
		Stack <Vehicle>vehicleStack=new Stack<>();
		vehicleStack.push(new Car("C-1111"));
		vehicleStack.push(new Bus("B-2222"));
		vehicleStack.push(new Van("V-3333"));
		vehicleStack.push(new Car("C-1112"));
		vehicleStack.push(new Bus("B-2223"));
		vehicleStack.callPark(9999);
	}
}

