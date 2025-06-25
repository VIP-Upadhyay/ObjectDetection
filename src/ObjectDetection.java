import java.io.IOException;

import org.opencv.core.Core;

public class ObjectDetection {
	static {
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME); 
        } catch (UnsatisfiedLinkError e) {
            
        }
    }
	
	   public static void main(String args[]) throws IOException, InterruptedException {
		   GraphicalUserInterface graphicalUserInterface = new GraphicalUserInterface();
			graphicalUserInterface.init();
	   }
	    
}
