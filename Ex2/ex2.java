import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ex2 extends GraphicsProgram {
	public void run() {
		GRect reckt = new GRect(500, 100, 400, 200);
		reckt.setFilled(true);
		reckt.setColor(Color.RED);
		add(reckt);
		GOval oval=new GOval(500,100,400,200);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
	}
}
