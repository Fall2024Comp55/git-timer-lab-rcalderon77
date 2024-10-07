import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes = 0;
    private Timer t;
	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);

        t = new Timer(1000, this);
        t.setInitialDelay(3000);
        t.start();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		numTimes = numTimes + 1;		
		myLabel.move(5,0);
		myLabel.setLabel("times called? " + numTimes);
		
		if(numTimes == 10) {
			t.stop();
		}
		
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
		
	}
}