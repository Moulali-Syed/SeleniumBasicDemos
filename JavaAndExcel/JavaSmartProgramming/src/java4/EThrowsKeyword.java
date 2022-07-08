package java4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//video 114
//throws keyword is used along with method name , where as throw is used inside
//throws keyword tells the calling object to provide exception handling code , as it has not handled
//throws keyword must be used with checkedException(compile time exception) and never used with unchecked exception
public class EThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandle fh = new FileHandle();
		try {
			fh.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			fh.writeFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class FileHandle {
	// when an object is created for class and this readFile or writeFile is called
	// then it must implement try catch block
	// for exception handling
	public void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:/abc.txt");
	}

	public void writeFile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:/abc.txt");
	}

}
