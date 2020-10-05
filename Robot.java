import java.awt.Color ;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import acm. graphics.GRect. * ;

public class Robot extends GraphicsProgram{
	/* Parameters for the drawing*/
	
	private static final int HEAD_WIDTH= 100;
	private static final int HEAD_HEIGHT= 150;
	private static final int EYE_RADIUS= 10;
	private static final int MOUTH_WIDTH= 60;
	private static final int MOUTH_HEIGHT=20;
	
	public void run() {
		
		addFace(getWidth() / 2, getHeight() / 2);
	}
	/*adds the face centered at (cx,cy) */ 
		private void addFace(double cx, double cy) {
			addHead(cx, cy);
			addEye(cx - HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
			addEye(cx + HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
			addMouth(cx, cy + HEAD_HEIGHT / 4);
		}
		
		/*adds the head centered at (cx, cy) */
		private void addHead(double cx, double cy) {
			double x = cx - HEAD_WIDTH / 2;
			double y = cy - HEAD_HEIGHT / 2;
		GRect head =new GRect(x,y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		}
		
		/*adds eyes centered at (cx,cy) */
		private void addEye(double cx, double cy) {
		double x = cx - EYE_RADIUS;
		double y = cy - EYE_RADIUS;
		GOval eye = new GOval (x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		add(eye);
		}
			
			/*adds mouth centered at (cx,cy)*/
				
		private void addMouth(double cx, double cy) {
			double x = cx - MOUTH_WIDTH / 2; 
			double y = cy - MOUTH_HEIGHT / 2;
			GRect mouth = new GRect (x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
			mouth.setFilled(true);
			mouth.setColor(Color.WHITE);
			add(mouth);
		}
	
		
}



