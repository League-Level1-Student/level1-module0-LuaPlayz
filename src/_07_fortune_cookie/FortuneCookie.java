package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

    public void showButton() {
        System.out.println("Button clicked");
JFrame frame = new JFrame();
frame.setVisible(true);
JButton button = new JButton();
frame.add(button);
frame.pack();
button.addActionListener(this);
   }

    
	@Override
	public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "Woohoo");
	
	 int rand = new Random().nextInt(5);
	 if (rand==1) {
		 System.out.println("You will win the lottery");
	 }
	 
	 if (rand==2) {
		 System.out.println("You will eat fruit tomorrow");
	 }
	 
	 if (rand==3) {
		 System.out.println("You will get a pet");
	 }
	 
	 if (rand==4) {
		 System.out.println("You will eat meat today");
	 }
	 
	 if (rand==5) {
		 System.out.println("You will get slapped soon");
	 }
	 
	 }
   
}
