import org.apache.logging.log4j.Logger;

import com.foo.Bar;


public class MyApp {

	private static final Logger logger = Log.Manager.getLogger(MyApp.class);
	
	public static void main(String args[]){
		
		logger.error("Entering application");
		Bar bar = new Bar();
		if(!bar.doIt()){
			logger.error("Didnt do it");
		}
		logger.error("Exiting aplication");
	}
}
