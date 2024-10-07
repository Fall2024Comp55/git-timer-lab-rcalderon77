import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import acm.graphics.*;
import acm.program.*;
public class ColorCircleDecomp extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_WIDTH = 800;
	public static final int PROGRAM_HEIGHT = 600;
	public static final int BALL_SIZE = 50;
	public static final int DELAY_MS = 25;
	public GOval ball;
	private double angle = 0;
	private int i = 0;
	
	public void run() {
		ball = new GOval(300,300,BALL_SIZE,BALL_SIZE);
		ball.setColor(Color.red);
		ball.setFilled(true);
		add(ball);
		
		Timer t = new Timer(DELAY_MS, this);
		t.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		++i;
		ball.setColor(new Color(i,50,50));
		ball.movePolar(5, angle);
	    angle = angle + 5;
	    if (angle >= 360) {
	        angle = 0;
	    }
	}
	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
	}
	
	public static void main(String args[]) {
		new ColorCircleDecomp().start();
	}
}
