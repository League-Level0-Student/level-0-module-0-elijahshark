import javax.swing.plaf.FontUIResource;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {

	


Robot r = new Robot();
r.penDown();
r.setSpeed(10);
for (int i = 0; i < 4; i++) {	
r.move(200);         
r.turn(90);
}
    }
}
