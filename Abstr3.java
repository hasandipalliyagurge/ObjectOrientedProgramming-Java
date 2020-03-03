interface Vehicle{ 
	public void park();
}
class Car implements Vehicle{
	public void park(){
		System.out.println("Car parking..");
	}
}

class Demo{
	public static void main(String args[]) {
		Vehicle v1=null; 
		v1=new Car();
		v1.park(); 
	}
}
