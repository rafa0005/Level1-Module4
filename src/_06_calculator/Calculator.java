package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JLabel label = new JLabel();
	
	JTextField field1 = new JTextField(20);
	
	JTextField field2 = new JTextField(20);
	
	JButton plus = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	
	
	
	public void createUI(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		panel.add(field1);
		panel.add(field2);
		panel.add(plus);
		panel.add(divide);
		panel.add(multiply);
		panel.add(subtract);
		plus.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		
	}
	
	public void subtract(){
		
		
	}

	public void multiply(){
	
	
}

	public void divide(){
	
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
