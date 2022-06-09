package ytjava2;

public class AWrapperClasses {

	
	public static void main(String[] args) {
		int i=5;
		//int is a primitve datatype , but in OOPs everything should be Object
		//instead of int we Wrapper classes
		Integer num = new Integer(5);
		//now we created num reference variable using Integer wrapper class
		
		//wrapper class - Boxing and UnBoxing
		int a =12;
		Integer a1 = Integer.valueOf(i);//this is called boxing - placing a primitive value into reference datatype
		
		int b1 = a1.intValue(); //Unboxing [changing a reference value to primitive type]
		
		
		System.out.println("******************");
		int n1 =10;
		Integer n = n1;// Auto Boxing
		
		int k = n; //Auto Unboxing
		
		
		//primitive are fast , but we need wrapper class because there are some frameworks in java
		//that only work with Objects , so we need wrapper classes
		
		
		//parsing
		String str = "123";
		int m1 = Integer.parseInt(str);
	}
}
