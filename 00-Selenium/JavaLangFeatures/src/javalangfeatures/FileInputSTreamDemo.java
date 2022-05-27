package javalangfeatures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputSTreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Testing\\SeleniumJava\\00-Selenium\\JavaLangFeatures\\src\\resources\\data");

			System.out.println("Data in file is :");

			int i = fis.read();

			// checking for End of File
			while (i != -1) {
				System.out.print((char) i);
				i = fis.read();
			}

			// closing the stream
			fis.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
