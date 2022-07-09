package java4;


//StringBuffer class is present in java.lang package
public class QStringBufferClassAndMethods {

	//String , StringBuffer , StringBuilder - 3 ways to create String
	/*
	 * String name = "Apple";
	 * name.concat("Shimla");//creates new object
	 * string objects are immutable
	 * 
	 * 
	 * StringBuffer sb = new StringBuffer("Apple");
	 * sb.append("java");
	 * this will not create new object , it make changes to original object only
	 * StringBuffer creates mutable object
	 * 
	 * When we should use String and StringBuffer?
	 * if data doesnot change or change one or two times only , use String
	 * 
	 * if data is constantly or frequently changing like in calculator,notepad
	 * we should use StringBuffer
	 * 
	 * public class StringBuffer extends AbstractStringBuilder implements
	 * 								java.io.Serializable,CharSequence
	 * {
	 *   4 constructors
	 *   StringBuffer(){}
	 *   StringBuffer(CharSequence ser){}
	 *   StringBuffer(String str){}
	 *   StringBuffer(int capacity){}
	 *   
	 *   methods
	 *   public synchronized int length(){}
	 *   public synchronized int capacity(){}
	 *   public synchronized StringBuffer append(){}
	 *   public synchronized StringBuffer insert(){}
	 *   public synchronized StringBuffer reverse(){}
	 *   public synchronized StringBuffer delete(){}
	 *   public synchronized StringBuffer deleteCharAt(){}
	 *   public synchronized StringBuffer replace(){}
	 *   public synchronized void ensureCapacity(){}
	 *   public synchronized char charAt(){}
	 *   public synchronized int indexOf(){}
	 *   public synchronized int lastIndexOf(){}
	 *   public synchronized String substring(){}
	 *   public synchronized CharSequence subSequence(){}
	 *   public synchronized String toString(){}
	 *   
	 *   }
	 */
	//we can create string using StringBuffer also
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());//can store 16 charcters
		
		StringBuffer sb1 = new StringBuffer("Apple");
		System.out.println(sb1.capacity());//21 = 16+5
		
		StringBuffer sb2 = new StringBuffer(1000);
		System.out.println(sb2.capacity());//1000 -  as capacity is provided 1000
		
		sb.append("hello");
		System.out.println(sb.capacity());//16
		
		sb.append("apple apple ");
		System.out.println(sb.capacity());//34  = 16*2+2 = (oldcapacity*2)+2
	}
}
