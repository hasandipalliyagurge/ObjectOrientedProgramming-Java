import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
	JButton setTitleButton;
	JTextField textFiled;
	JLabel textLabel;
	MyFrame(){
		setSize(300,300);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		textLabel=new JLabel("empty");
		textLabel.setFont(new Font("",1,20)); 
		add(textLabel);
		
		textFiled=new JTextField(12);
		textFiled.setFont(new Font("",1,20)); 
		add(textFiled);
				
		setTitleButton=new JButton("Set Title");
		setTitleButton.setFont(new Font("",1,20)); 
		//----------------------------Start Anonymous Inner Class---------------------
		/*class SetButtonAction implements ActionListener{
			public void actionPerformed(ActionEvent evt){
				String text=textFiled.getText();
				textLabel.setText(text);
				setTitle(text);
			}	
		}*/
		ActionListener ob=new ActionListener(){
			int a;
			void mA(){
				
			}
			public void actionPerformed(ActionEvent evt){
				String text=textFiled.getText();
				textLabel.setText(text);
				setTitle(text);
			}
		};
		//------------------------------------------------------------------
		setTitleButton.addActionListener(ob);
		add(setTitleButton);
	}
}
class Anno{
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}
