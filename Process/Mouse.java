import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.event.InputEvent;

//клас в якому описується робота натискання кнопки на мишці

public class Mouse implements Runnable{
	
	private Robot robot;
	
	@Override
	public void run() {
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen = env.getDefaultScreenDevice(); 
        try {
            robot = new Robot(screen);
        } catch (AWTException ex) { }
        
        
        int l = 0;
        
        if(Memory.k == -1){
        	Memory.k = 1;
        	l = 1;
        }
        
        for(int i = Memory.k; i > 0; i--) {
        	i = i + l;
        	if(Memory.m.equals("L")){
    			robot.mousePress(InputEvent.BUTTON1_MASK);
    			robot.mouseRelease(InputEvent.BUTTON1_MASK);
    		}
    		 
    		else{
    			robot.mousePress(InputEvent.BUTTON3_MASK);
 			    robot.mouseRelease(InputEvent.BUTTON3_MASK);
    		}
            robot.delay(Memory.n * 1000);
            
            if(Memory.bool == true){
            	break;
            }
        } 
	}
}