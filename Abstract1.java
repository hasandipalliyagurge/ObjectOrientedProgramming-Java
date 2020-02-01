/*
 class Vehicle{
	String number;
	Vehicle(String number){this.number=number;}
	public void park(){
		//empty..
	}
}
class Car extends Vehicle{
	Car(String number){super(number);}
	public void park(){
		System.out.println("Car-"+number);
	}
}
class Van extends Vehicle{
	Van(String number){super(number);}
	public void park(){
		System.out.println("Van-"+number);
	}m
}
class Bus extends Vehicle{
	Bus(String number){super(number);}
	public void park(){
		System.out.println("Bus-"+number);
	}	
}
class Demo{
	public static void main(String args[]) {
		Vehicle[] vehicles={
					new Car("C-1001"),
					new Bus("B-2001"),
					new Bus("B-2002"),
					new Car("C-1002"),
					new Car("C-1003"),
					new Van("V-3001"),
					new Van("V-3002"),
		};
		for(Vehicle v1 : vehicles){
			v1.park(); //single interface
		}
 
 */



















abstract class Vehicle{
	String number;
	Vehicle(String number){this.number=number;}
	abstract public void park();
	 
}
class Car extends Vehicle{
	Car(String number){super(number);}
	public void park(){
		System.out.println("Car-"+number);
	}
}
class Van extends Vehicle{
	Van(String number){super(number);}
	public void park(){
		System.out.println("Van-"+number);
	}
}
class Bus extends Vehicle{
	Bus(String number){super(number);}
	public void park(){
		System.out.println("Bus-"+number);
	}	
}
class Abstract1{
	public static void main(String args[]) {
		Vehicle[] vehicles={
					new Car("C-1001"),
					new Bus("B-2001"),
					new Bus("B-2002"),
					new Car("C-1002"),
					new Car("C-1003"),
					new Van("V-3001"),
					new Van("V-3002"),
		};
		for(Vehicle v1 : vehicles){
			v1.park(); //single interface
		}
	}
}
