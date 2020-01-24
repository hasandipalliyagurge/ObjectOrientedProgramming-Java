class Vehicle{
	public void park(){
	}
}

class Car extends Vehicle{
	public void park(){
		System.out.println("car parking");
	}
}

class Van extends Vehicle{
	public void park(){
		System.out.println("van parking");
	}
}
class Bus extends Vehicle{
	public void park(){
		System.out.println("bus parking");
	}
}
class Poly1{
	
	public static void main(String args[]) {
		Vehicle v1;
		v1=null;
		v1=new Car();
		v1.park(); //Car Parking..
		
		v1=new Van(); 
		v1.park(); //Van Parking
		
		v1=new Bus();
		v1.park(); //Bus Parking
	}
}
