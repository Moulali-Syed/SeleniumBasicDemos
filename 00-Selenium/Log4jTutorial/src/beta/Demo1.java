package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import alpha.Demo;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("Iam debugging");
		// we have error debug info fatal

		log.info("Info");
		log.error("object not present");
		log.fatal("this is fatal");
	}

}
