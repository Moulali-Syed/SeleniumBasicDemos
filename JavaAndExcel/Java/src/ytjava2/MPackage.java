package ytjava2;

public class MPackage {

	//maintain different packages for better maintenance
}


/*

all IO packages will be inside java.io
BufferedInputSystem
File
PrintWriter

all the networking classes
will be in java.net package

Socket
Url
ServerSocket

all jdbc packages are from java.sql
ResultSet(Interface)
DriverManager
TimeStamp


all these are packages, we must classify all classes and interface as package

if we r creating a package , its name should be unique throughout the world
package name should be mirror of domain name

example:
Domain Name :google.com
PackageName : com.google


suppose we have a company  

we can have hierarchy as
		com
		 |
		Company               
		  |
		 Test
		   |
		   files.. 	


//to access everything inside Company we can use com.Company.*
 *  to access everything inside Test we can use com.Company.Test.* 
 */
