import javax.swing.*;
enum Colour{
	RED, GREEN, BLUE, BLACK;
}
class MyFrame extends JFrame{
	private JComboBox customerBox;
	
	MyFrame(){
		setSize(300,300);
		setDefaultCloseOperation(3);
		customerBox=new JComboBox(Colour.values());
		add("North",customerBox);
	}
}
class Enum2{
	public static void main(String args[]) {
		new MyFrame().setVisible(true);
	}
}
