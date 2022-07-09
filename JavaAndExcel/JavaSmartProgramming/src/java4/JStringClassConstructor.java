/*package java4;

public class JStringClassConstructor {

	public static void main(String[] args) {

		String s1 = "Apple";//1 object


		//No argument constructor
		String s2 = new String();//creates empty String object
		System.out.println(s2.length());//0 - means it is empty object

		//String literal constructor
		String s3 = new String("abc");//creates 2 objects[1 in heap,1 in SCP]

		StringBuffer sb = new StringBuffer("Mango");
		System.out.println(sb);//mutable

		//we can also pass sb in literal constructor
		String s4 = new String(sb);//immutable
		System.out.println(s4);

		//StringBuffer and StringBuilder creates mutable object , but String creates immutable object
		StringBuilder sb2 = new StringBuilder("Banana");
		System.out.println(sb2);//mutable

		String s5 = new String(sb2);
		System.out.println(s5);//immmutable

		//bytearray can be passed to String constructor
		byte[] b= {101,102,103};
		System.out.println(b);//[B@cac736f
		String s6 = new String(b);
		System.out.println(s6);//efg

		//char Array can be passed to String constructor
		char[] c = {'a','b','c'};
		String s7 = new String(c);
		System.out.println(s7+" "+c);//abc [C@5e265ba4

		//**********why character array is preferred over string for storing passwords************
		/*
		 1.String Objects are immutable in java and therefore if a password is stored as
		 plain text it will be available in memory until garbage collector clears it , but
		 string objects are stored in string literal pool for reusability and garbage collection
		 is not applicable in scp, which is a security threat

		 with an array , you can ecplicitly wipe the data after you're done with it.u can
		 overwrite the array with anything u like , and the password wont be present
		 anywhere in system even before garbage collection

		 2.char[] c = {'a','b','c'};
		String s7 = new String(c);
		System.out.println(s7+" "+c);//abc [C@5e265ba4

		see we cannot directly print what is value inside the char array , but if stored in
		string it prints directly

		So it is very useful to store password in char array than in String
		 */
//	}
//
//
//}
/*
String class Constructor:

public final class String implements Serailizable,...{

	//has so many construtors, lets see some
	//no argument constructor
	 public String(){

	   //......
	  }
	 public String(String s){


	 }
	public String(StringBuffer sb){}
	public String(StringBuilder sb){}
	public String(char[] ch){}
	public String(byte[] b){}


	}

*/