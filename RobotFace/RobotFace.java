import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class RobotFace extends GraphicsProgram{
    public void run(){
    	
    	GRect face=new GRect(400,100,400,600);
    	GOval lefteye=new GOval(490,200,70,70);
    	GOval righteye=new GOval(640,200,70,70);
    	GRect mauth=new GRect(490,500,220,70);
    	face.setFilled(true);
    	lefteye.setFilled(true);
    	righteye.setFilled(true);
    	mauth.setFilled(true);
    	
    	add(face);
    	add(lefteye);
    	add(righteye);
    	add(mauth);
    
    }
    private static final int HEAD_HIGHT=600;
    private static final int HEAD_WAIGHT=600;
    private static final int EYE_RADIOUS=70;
    private static final int HEAD_HIGHT=600;
}
