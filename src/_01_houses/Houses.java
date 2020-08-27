package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob=new Robot();
	public void run() {
	
		rob.setX(5);
rob.setY(500);
rob.setSpeed(100);
		rob.penDown();
		int p=100; 
		
		for (int i = 0; i < 11; i++) {
			
		house("small");
	p=p+5;
	
		}
		rob.hide();
	}

	void house(String height) {
			int h=100;
		if (height.equals("small")) {
			h=60;
		}else if (height.equals("medium")) {
			h=120;
		}else if (height.equals("large")) {
			h=250;
		}
		rob.move(h);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(h);
		rob.turn(270);
		rob.setPenColor(0, 250, 0);
		rob.move(40);
		rob.setPenColor(0,0,0);
		rob.turn(270);
		}
		
}
