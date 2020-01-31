import javax.swing.*;
interface Vehicle{
	// String number;
	// Vehicle(String number){this.number=number;}
	 public void park();
}
class Car extends JFrame implements Vehicle{
	private JTextField textField;
	Car(){
		setSize(300,300);
		setTitle("Car");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		textField=new JTextField();
		add("North", textField);
		setVisible(true);
		
	}
	Car(String number){
		super(number);
	}
		
	public void park(){
		textField.setText("Car Parking...");
	}
}
class Van extends JFrame implements Vehicle{
	private JTextField textField;
	Van(){
		setSize(300,300);
		setTitle("Car");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		textField=new JTextField();
		add("North", textField);
		setVisible(true);
		
	}

		
	public void park(){
		textField.setText("Car Parking...");
	}
}
class Bus extends JFrame implements Vehicle{
	//Bus(String number){super(number);}
	private JTextField textField;
	Bus(){
		setSize(300,300);
		setTitle("Car");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		textField=new JTextField();
		add("North", textField);
		setVisible(true);
		
	}
	
	public void park(){
		textField.setText("Car Parking...");
	}
}
class Abs2{
	public static void main(String args[]) {
		Vehicle[] vehicles={
					new Car(),
					new Bus(),
					new Bus(),
					new Car(),
					new Car(),
					new Van(),
					new Van(),
		};
		for(Vehicle v1 : vehicles){
			v1.park(); //single interface
		}
	}
}
