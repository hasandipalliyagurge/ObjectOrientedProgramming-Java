import javax.swing.*;
class Calc extends JFrame{
	Calc(String title){
		super(title);//compiler inserts "super()"
	}
}
class DemoCal{
	public static void main(String args[]) {
		Calc c1=new Calc("Calc");
		c1.setSize(300,300);
		c1.setVisible(true);
	}

}
