package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label= new JLabel();
	JPanel panel = new JPanel();
   	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	int count=0;
	public void setup() {
	        	frame.setVisible(true);
	        	panel.add(button);
	        	panel.add(button2);
	        	panel.add(button3);
	        	panel.add(label);
	        	frame.add(panel);
	        	button.addActionListener(this);
	        	button2.addActionListener(this);
	        	button3.addActionListener(this);
	        	frame.pack();
}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			showDucks();
		}
		else if(e.getSource()==button2) {
		showFrog();
		} 
		else {
			showFluffyUnicorns();
		}
	}
}
