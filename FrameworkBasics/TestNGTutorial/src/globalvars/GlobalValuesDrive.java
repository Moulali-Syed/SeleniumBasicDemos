package globalvars;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Testing\\SeleniumJava\\FrameworkBasics\\TestNGTutorial\\src\\data.properties");

		prop.load(fis);
		System.out.println(prop.getProperty("browser"));

		// to update values
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));

		FileOutputStream fos = new FileOutputStream(
				"C:\\Testing\\SeleniumJava\\FrameworkBasics\\TestNGTutorial\\src\\data.properties");

		prop.store(fos, null);
	}
}
