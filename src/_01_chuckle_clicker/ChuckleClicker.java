package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	public static void main(String[] args) {
		
		ChuckleClicker cc = new ChuckleClicker();
			cc.makeButtons();
		}
	
	public void makeButtons() {
		System.out.println("Make Buttons");
		JFrame window = new JFrame();
		JPanel solar = new JPanel();
		window.setVisible(true);
		window.add(solar);
		solar.add(b2);
		solar.add(b1);
		b2.setText("joke");
		b1.setText("Punchline");
		b2.addActionListener(this);
		b1.addActionListener(this);
		
		window.pack();
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		if(e.getSource() == b2 ) {
		JOptionPane.showMessageDialog(null, "How did palpatine return?");
		}
			if(e.getSource() == b1){
				JOptionPane.showMessageDialog(null, "Somehow");
			}
			
		}
	}
	

