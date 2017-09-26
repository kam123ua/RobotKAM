import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;

//клас в якому описується робота натискання кнопки на клавіатурі

public class Key implements Runnable{
	
	private Robot robot;
	
	@Override
	public void run() {
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen = env.getDefaultScreenDevice();
        try {
            robot = new Robot(screen);
        }
        catch (AWTException ex) { }
          
        int l = 0;
        
        if(Memory.k == -1){
        	Memory.k = 1;
        	l = 1;
        }
        
        for(int i = Memory.k; i > 0; i--) {
        	i = i + l;
            robot.keyPress(Memory.key);
            robot.keyRelease(Memory.key); 
            robot.delay(Memory.n * 1000);
            if(Memory.bool == true){
            	break;
            }
        }   
        
	}
}