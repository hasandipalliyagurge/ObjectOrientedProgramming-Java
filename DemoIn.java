import javax.swing.*;
class Calculator extends JFrame{
	Calculator(){
		setSize(300,300); //Legal ?
		setTitle("Calculator"); //Legal 
		setDefaultCloseOperation(EXIT_ON_CLOSE); //EXIT_ON_CLOSE legal ?
		setLocationRelativeTo(null);
	}
}
class DemoIn{
	public static void main(String args[]) {
		new Calculator().setVisible(true); 
	}

}
