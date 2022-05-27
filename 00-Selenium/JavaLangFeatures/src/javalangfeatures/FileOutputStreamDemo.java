package javalangfeatures;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		try {
			//if we give just filename as Data.dat file will be created under project folder
			//if we give path of file then it will use that file
			FileOutputStream fos = new FileOutputStream("Data.dat");
//			FileOutputStream fos = new FileOutputStream("C:\\Testing\\SeleniumJava\\00-Selenium\\JavaLangFeatures\\src\\resources\\data");
			String value = "Java is Fun to Learn loving it";

			byte[] val = value.getBytes();

			try {
				fos.write(val);
				fos.write(val[0]);
			} catch (IOException e) {

				e.printStackTrace();
			} finally {

				fos.close();
			}

		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("Data written Successfully");
	}

}
