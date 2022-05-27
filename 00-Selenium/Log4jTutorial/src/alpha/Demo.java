package alpha;

//step2 import stmt
import org.apache.logging.log4j.*;

public class Demo {

	// step1
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
/*
 * Use log. Error() to log when elements are not displayed in the page or if any
 * validations fail
 * 
 * Use Log. Debug()
 * 
 * When each Selenium action is performed like click, SendKeys, getText()
 * 
 * Use log.info()
 * 
 * When operation is successfully completed ex: After loading page, or after any
 * successful validations
 * 
 * It’s just counterpart to log. Error()
 */