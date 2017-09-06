import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
	Robot batman = new Robot();
	batman.penDown();
	batman.setSpeed(10);	
	batman.move(200);         
	batman.turn(90);
	
	}
}