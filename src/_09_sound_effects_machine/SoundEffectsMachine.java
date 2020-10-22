package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label= new JLabel();
	JPanel panel = new JPanel();
	int count=0;
	public void setup() {
	        	frame.setVisible(true);
	        	JButton button = new JButton();
	        	JButton button2 = new JButton();
	        	panel.add(button);
	        	panel.add(button2);
	        	panel.add(label);
	        	frame.add(panel);
	        	button.addActionListener(this);
	        	button2.addActionListener(this);
	        	frame.pack();
}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("clicked");
	playSound("sawing-wood-daniel_simon.wav");
	}
}
