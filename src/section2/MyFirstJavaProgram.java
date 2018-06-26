package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot CP3O = new Robot();
	CP3O.setSpeed(500);
	CP3O.sparkle();
	CP3O.setPenColor(Color.cyan);
	CP3O.penDown();
for (int i=0;i<5000;i++) {
CP3O.move(1);
CP3O.turn(1);

	}
}
}
