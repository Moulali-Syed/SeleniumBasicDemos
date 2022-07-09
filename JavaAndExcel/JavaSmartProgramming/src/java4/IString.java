package java4;

public class IString {

	public static void main(String[] args) {
		String a= "Apple";
	}
}
/*

1.String is a non primitive data type
	and size is not fixed

2.String is the sequence of characters [can also say array of characters]

	char[] c ={'a','p','p','l','e'};

	String s = new String(c);

	We have a interface CharSequence - to represent the sequence of characters
3.String is a class , it has so many methods
	public final class String extends Object implements CharSequence,Serializable,Comparable
	{


	}
	Object is parent class of all classes in java , so Object is parent class of String
	and String class implements CharSequence interface ,Serializable , Comparable

	Serializable : interface is used when we need to store a copy of object and send them
	to another process which runs on same system or over the network

	Comparable interface is used to order the objects of class. It has only one method
	CompareTo()

4.String s = new String();
	this will create immutable object
	String is an immutable object

	normal declaration
	String s = "apple";

	What is the difference between String s = new String();  vs String s = "apple";

5.To create String , there are three classes:
	1.String  2.StringBuffer  3.StringBuilder

	to create string we have 4 ways
very important question why String class is marked final in java
*/
//============================String Constant Pool===================================================
/*
upto java 1.6 SCP is in method area
from 1.7 version it is in heap area , so that it can increase or decrease its size
SCP is a special memory location present in heap area which is used to store String literals

String Constant Pool/String Literal pool
is an area in heap memory where java stores String literal values

instance variable - heap memory
static variable - method area
local variable - Stack area
main() - stack area
object - heap area
current running method - stack area


String constant pool is present in heap area
lets create String object
String s1 = new String("Apple");
this creates 2 objects , one in String constant pool[which is inside heap area] for future use
 and other in the heap area

String s2 = "Banana";
this will create only one object and that will be inside String constant pool

The string objects present in SCP are not applicable for garbage collection because a
reference variable internally is maintained in JVM


String s1 = new String("Apple");//creates 2 objects ,1 in SCP [for future reference],1 in heap
String s2 = new String("Grapes");//creates 2 objects ,1 in SCP[for future reference] , 1 in heap
String s3 = new String("Apple");//creates only one object in heap , because before creating
 									object in SCP it will check if its already present or not
 									as its already present it will not create there in SCP , so
 									only one[1] object is created
 String s4 = "hello";//creates 1 object only in SCP
 String s5 = "Apple";//it checks same literal object is present in SCP or not , if found
 					//it will not create any object , but points to it

*/
/*
***********************Why String Object is Immutable in java**************************
Immutable means Unchangeble
Immutability concept is used for String objects i.e is string objects are immutable
It means once string object is created its data or state cant be changed but a new string
object is created

String s = new String("Apple");//this creates 2 objects , 1 in heap ,1 in SCP
if i change the object as
s.concat("Shimla"); //this creates a new object AppleShimla , but it doesnot change the above
created object and also creates a object literal Shimal inside SCP

if now i try to print System.out.println(s);//it prints Apple only

now lets do
s = s.concat("python");
now it will check in SCP , if it is present or not , then creates a literal
python inside SCP , then also creates a new object Applepython , and s will points to Applepython
instead of pointing to Apple

System.out.println(s);//Applepython

Immutability is always related to String objects

Why String Objects are immutable?
String city1 = "Mohali";//creates a object inside SCP [checks before creating]
now city1 points to Mohali

String city2 = "Mohali";//now it will simply points to the one already present in the SCP
String city3 = "Mohali";//points to one already present in SCP

if a person3 changes his city from Mohali to Delhi , if string will be mutable then all
other persons city value changes , to avoid this String is made immutable

city3 = "Delhi";//creates a object in SCP and starts referring to it


Strings are immutable in java because String objects are cached in String pool
Since cached String literals are shared between multiple persons there is always
a risk where one persons action would affect all another persons
for example, if one person changes city from mohali to delhi , all other persons will also
get affected



*/

/*
*******************************Why String is final in java*********************************
final keyword is used with class , method and variable

if we have 2 classes  and i dont want one class cant get inherited in other,then make
class as final , thus no other class can inherit my class

if method is made final , thus we can prevent method override

if variable is made final, its value cant be changed

Important features of String class
1.SCP: a special memory location inside heap area to store string literals
2.Immutable objects: string objects are immutable which means once string object is created
 its data or state cant be changed but a new string object is created
3.+ operator for strings: multiple strings can be concatenated using + operator
4.Security: parameters used for network connections, database connection URLs, usernames/
	passwords, etc are represented in Strings.if it was mutable these parameters could be
	changed easily
5.class loading: string is used as an arguments for class loading.if mutable it can result
	in wrong class being loaded(because mutable objects change their state)
6.Synchronization and Concurrency: making string immutable automatically makes them thread safe
	there by solving synchronization issues
7.Memory management: when compiler optimizes our string objects, it seems that if two objects
	have the same values(a="test" and b="test") and thus we need only one string object
	(for both a and b , these two will point to same object)

Why string class is final?
String class has got special features which is not available to other java classes and making
the string class final prevents subclasses that could break these assumptions

final is keyword used with class,methods and variables but immutability is concept used
for objects in which object state and content cannot be changed

final StringBuffer sb = new StringBuffer("Apple");
sb = sb.append("happy");//this will throw error because sb is made final[cannot reassign]

sb.append("happy");//this is immutablity concept , this creates a new object

*/

/*

Difference between == and .equals() method in java

== operator used for reference comparision(address comparision), means
== operator checks if both objects point to same memory location or not

.equals() method is used for content comparision it means .equals() method is used
to check object value

String s1 = new String("Apple");//creates 2 objects one in heap , one is SCP
s1 refers to heap object

String s2 = new String("Apple");//creates one object in heap
sop(s1==s2);//false

sop(s1.equals(s2));//true

String s3 = "amt";
String s4 = "amt";
s3 s4 points to same object in SCP
sop(s3==s4);//true - reference comparison

.equals() method is method of Object class
class Object
{
	public boolean equals(Object obj){
		return (this==obj);//reference comparison
	}
}

class String extends Object{
	public boolean equals(Object obj){
	//overridden in such a way to check and compare content
		statements//content comparison
	}

}

equals method of Object class - reference comparison
equals method of String class - content comparison
*/