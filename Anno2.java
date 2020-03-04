abstract class Vehicle{
	abstract public void park();
}
class Car extends Vehicle{
	public void park(){
		System.out.println("Car Parking..");
	}
}
class Anno2{
	public static void main(String args[]){
		Vehicle v1=new Car();
		v1.park();
		
		//---------------------------------------------
		Vehicle v2=new Vehicle(){
			public void park(){
				System.out.println("Car Parking..-Anonymous");
			}		
		};
		v2.park();
	}
}
