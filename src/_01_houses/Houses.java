package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {
	
		rob.setX(5);
rob.setY(500);
rob.setSpeed(100);
		rob.penDown();
		int p=100; 
		
		for (int k = 0; k <11; k++) {
			Random h = new Random();
			int i=h.nextInt(3);
			if (i==0) {
		drawPointyRoof("small",Color.BLUE);
		} else if(i==1) {
			drawPointyRoof("medium",Color.CYAN);
		} else {
	drawFlatRoof("large",Color.gray);	
}
			
		}

	}

	void drawFlatRoof(String height, Color C) {
		int h = 100;
		if (height.equals("small")) {
			h = 60;
		} else if (height.equals("medium")) {
			h = 120;
		} else if (height.equals("large")) {
			h = 250;
		}
		rob.setPenColor(C);
		rob.move(h);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(h);
		rob.turn(270);
		rob.setPenColor(0, 250, 0);
		rob.move(40);
		rob.setPenColor(0, 0, 0);
		rob.turn(270);
	}
void drawPointyRoof(String height, Color C) {
	int h = 100;
	if (height.equals("small")) {
		h = 60;
	} else if (height.equals("medium")) {
		h = 120;
	} else if (height.equals("large")) {
		h = 250;
	}
	rob.setPenColor(C);
	rob.move(h);
	rob.turn(45);
	rob.move(45);
	rob.turn(90);
	rob.move(45);
	rob.turn(45);
	rob.move(h);
	rob.turn(270);
	rob.setPenColor(0, 250, 0);
	rob.move(40);
	rob.setPenColor(0, 0, 0);
	rob.turn(270);
}
	
}
