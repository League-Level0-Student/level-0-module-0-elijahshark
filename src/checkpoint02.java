import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class checkpoint02 {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("what is your favorite TV show" );
	JOptionPane.showMessageDialog(null,name+" Is My Favorite Too!");
	Robot r2d2 = new Robot();
	r2d2.setSpeed(10);
	r2d2.penDown();
	r2d2.setRandomPenColor();
	r2d2.move(90);
	r2d2.turn(90);
	r2d2.move(90);
	r2d2.turn(90);
	r2d2.move(90);
	r2d2.turn(90);
	r2d2.move(90);
	
	r2d2.hide();
}
}
