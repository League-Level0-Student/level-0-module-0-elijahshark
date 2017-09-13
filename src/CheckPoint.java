import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "What is your favortie color");
	JOptionPane.showInputDialog(null, "");
	JOptionPane.showMessageDialog(null, "Mine to");
	Robot R2D2 = new Robot();
R2D2.setSpeed(10);
R2D2.penDown();
R2D2.setRandomPenColor();	

	
	
	
	

}
}
