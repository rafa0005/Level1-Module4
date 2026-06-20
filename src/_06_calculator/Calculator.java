package _06_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JLabel label = new JLabel();
	
	JTextField field1 = new JTextField(20);
	
	JTextField field2 = new JTextField(20);
	
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	
	
	
	public void add(){
		
		frame.add(panel);
		panel.add(label);
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(divide);
		panel.add(multiply);
		panel.add(subtract);
	}
	
	public void subtract(){
		
		
	}

	public void multiply(){
	
	
}

	public void divide(){
	
	
}
}
