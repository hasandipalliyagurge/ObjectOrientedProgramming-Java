import javax.swing.*;
class Calculator extends JFrame{
	public void setSize(int width, int height){
		if(width>=height){
			super.setSize(width,width);
		}else{
			super.setSize(height,height);
		}
			
	}
}
class Ex{
	public static void main(String args[]) {
		Calculator c1=new Calculator();
		c1.setSize(300,30);
		c1.setVisible(true); 
		Calculator c2=new Calculator();
		c2.setSize(10,500);
		c2.setVisible(true);
	}
}

