package java4;

//video 88 to 104
public class AAOOPS_Concepts{}
/*
 



OOP is a programming paradigm /methodology

OOPs main concepts in java

Class
Object and methods
Encapsulation
Abstraction
Polymorphism
Inheritance
______________________________________________________________________________________________________________________________
Smalltalk is purely object oriented programming 
______________________________________________________________________________________________________________________________

Class:
Animal - dog , cat are objects
Birds - peacock ,sparrow
______________________________________________________________________________________________________________________________
method is any task that we perform
animal eat
birds fly
______________________________________________________________________________________________________________________________
class is a collection of objects
Class is not a real world entity, it is just a blueprint
Class doesnot occupy memory

syntax:

accessmodifier ClassName{

	//we can have methods , constructors, fields , blocks , nested class
}

by default accessmodifier is default if not specified'
______________________________________________________________________________________________________________________________

method:
a set of codes which perform particular task
advantages:
code reusability and code reuse

syntax:
access-modifier returnType methodName(listOfParameters){

}

by default access-modifer is default
______________________________________________________________________________________________________________________________

Object:
Object is an instance of class
Object is real world entity
Object occupies memory

Object consists of :
Idenity: name
state/attribute: color,breed , age
behaviour: methods [eat,run]

how to create an object
we can create using 
new keyword
newInstance() method
clone method
deserialization
factory methods

ClassName objName = new ClassName()

//calling behaviour of method
objName.methodName();
objName.color;

package oop;

class Animal {

	public void eat() {
		System.out.println("Eating");
	}

	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.eat();
		dog.run();
		
		Birds sparrow = new Birds();
		sparrow.fly();
	}

}

class Birds{
	public void fly() {
		System.out.println("flying");
	}
}

______________________________________________________________________________________________________________________________

Initializing object:
By reference variable
Animal dog = new Animal();


By method
package oop;

public class InitializeObject {

	String color;
	int age;

	public void initObj(String c, int a) {
		color = c;
		age = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeObject obj1 = new InitializeObject();
		obj1.initObj("Apple", 1);
	}

}

using constructor:


_______________________________________________________________________________________________________________________________________________________________________
Constructor:
 is similar to method has same name as className
it doesnot have any return type
only modifiers that can be used with constructor public , private , protected , default
it executes automatically when object is created

constructor is used for initializing an object


TYpes of constructor
default constrcutor: created by compiler

NoArgumentConstructor:
class Test{
	Test(){
		
	}
}

parameterized constructor:

package oop;

public class Employee {

	String name;
	int empid;

	public Employee(String name, int empid) {
		this.name = name;
		this.empid = empid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("apple", 101);
		Employee emp2 = new Employee("Mango", 102);
		
		
		Test t = new Test();
	}

}


_____________________________________________________________________________________________________________________________________________

Types of inheritance:
inheriting properties of parent class to child class

package oop;

class Animal1{
	public void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal1{
	public static void main(String[] args) { 
		Dog d1 = new Dog();
		d1.eat();
	}
}

//Dog is a animal
//inheritance - IS-A relationship

main advantage - code reusability

we can achieve method overriding [polymorphism] using inheritance

disadvantage : tightly coupled , if we chnage in one class , it will chnage in all other classes


Types of inheritance:
1.Single Inheritance

one class properties inherited from other class

A -> B

2.Multi level inheritance

A-> B -> C

3.Heirarchical inheritance
				A
             /	   \
            B       C

4.Multiple inheritance : not present in java because of ambiguity
			A    B
	         \   /		
                   C

5.Hybrid inheritance : not there in java , diamond problem
			A
	      /   \
	     B     C
	     \     /
			D	

java only supports single , multilevel , heirarchical inheritance only

SingleInheritance:
package oop;

 class A {
public void show() {
	System.out.println("Hello");
}
}

 class B extends A{
	 public void hi() {
		 System.out.println("hi");
	 }
	 public static void main(String[] args) {
		 B obj = new B();
		 obj.show();
		 obj.hi();
		 
		 //as we are referncing the class A we cant call methods that are only from class B
		 A obj1 = new B();
		 obj1.show();
//		 obj1.hi();
	 }
 }

Multilevel Inheritance:
package oop;

class A{
	public void show() {
		System.out.println("hellp");
	}
}

class B  extends A{
	public void hello() {
		System.out.println("hello");
	}
	
}

class C extends B{
	public void hi() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		C obj = new C();
		obj.show();
		obj.hello();
		obj.hi();
	}
}

private members , methods and constructor will not be inherited

Object is parent class of all classes
_______________________________________________________________________________________________________________________________________________________________________Types of relationships:

Inheritance -  [IS-A ]
Association - HAS-A , has 2 forms Aggregation and composition

main advantage:
code reusablility
cost cutting
reduce redunduncy

Inheritance[IS-A] 
one class properties inherited into another class
we achieve this using extends keyword

Car is a vehicle


Association - [HAS-A]
class Student{

String name;
int roll_no;

}

Student has a name
Student has a roll_no


package oop;

class Engine {
	public void eng() {
		System.out.println("This is engine");
	}

}

class Car {
	public static void main(String[] args) {
		Engine e = new Engine();
		e.eng();

	}
}

//loosely coupled , association  has-a relationship

//assoication - aggregation and composition

//aggregation is weak bonding and composition is strong bonding


//car has a music player - aggregation
//car has engine - composition

college - professor weak bonding because college and professor can exist individually ,aggregation
college - branches[cS,IT,EE] strong bonding composition
_______________________________________________________________________________________________________________________________________________________________________
Polymorphism:

Poly means many , forms

water - solid, liquid, gas
shapes - circle , rectangle
sounds - bark , roaring

polymorphism 2 types

static - complie time polymorphism  - method overloading   handled by complier
dynamic - run time polymorphism  - method overriding   handled by JVM

Method overloading:
same class , same name , different arguments

Method overriding:
different class,same name same arguments and inheritance [is-a relationship]

package oop;

public class Test1 {

	
	public void show() {
		System.out.println("hellpo");
	}

	public void show(int a) {
		System.out.println("hi"+ a);
	}
	
	
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.show();
		obj.show(1);
	}
}


//Method overloading : same name ,same class , different parameters


Can we achieve method overloading by chnaging only return type?
method overloading is not possible in java by changing only the return type, because of ambiguity

Can we overload main method in java?
Yes we can overload main method , JVM only looks for the main method that has String arguments

in method overloading we have automatic promotion , that is if the matching method argument is not found then it will change 
to corresponding datatype whichever it can be converted

Object is parent class of all classes in java

Method overriding:
different class,same name same arguments and inheritance [is-a relationship]
package oop;

class Y {
	public void show() {
		System.out.println("y");
	}
}

public class X extends Y {
	public void show() {
		System.out.println("X");
	}
	
	public static void main(String[] args) {
		X obj = new X();
		obj.show();//X
		
		Y obj1 = new Y();
		obj1.show();//y
	}
}

Do overridinfg methods must have same return type?
after java 5 we can provide different return type

Inheritance , polymorphism , Association are focus on Code reusability
__________________________________________________________________________________________________________________
Abstraction:
Abstraction , data hiding , encapsulation , tightly coupled classes ===> these focus on security

Abstraction is hiding internal implementation and just highlighting the setup services that we are offering

Abstraction can be achieved in 2 ways : by using abstract method , by using interface


what is abstract class and abstract methods?
1.A method without body(no implementation) is known as abstract method
2.A method must always be declared in an abstract class or we can say that if a class has abstract method , it should be declared abstarct as well
3.if a regular class extends an abstract class , then the class must have to implement all the abstract methods of the abstract parent class or it has 
to be declared abstract as well
4.abstract methods in abstract classes must be overridden in derived concrete classes otherwise compile-time error will be thrown
5.abstract classes cannot be instantiated , means we cannot create an object of abstract class

abstract class can contain concrete and abstract methods

package oop;

abstract public class Vehicle {

	abstract void start();
}


class Car1 extends Vehicle{
	void start() {
		System.out.println("hello");
	}
}

class Scooter extends Vehicle{
	void start() {
		System.out.println("happy");
	}
	
	public static void main(String[] args) {
		Car1 c = new Car1();
		Scooter s1 = new Scooter();
		c.start();
		s1.start();
	}
}

package java4;

//abstract demo
public class AbstractDemo extends Test{

	public void sayHi() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemo();
		obj.sayHello();
		obj.sayHi();
	}
}

abstract class Test{
	abstract void sayHi();
	public void sayHello() {
		System.out.println("hello there");
	}
}
_______________________________________________________________________________________________________________________________________________________________________
Interface in java: used to achieve abstraction
interface can only contain abstract methods

Interfaces are blueprint of class, it specify what a class must do and not how
interface supports multiple inheritance
it can be used to achieve loose coupling

loose coupling  is a design goal that seeks to reduce the inter dependencies between components of a system with the goal of reducing
the risk that changes in one component will require chnages in other components.Loose coupling  is much more generic concept intended to increase
flexibility of system make it more maintainable and makes the entire framework more stable

syntax:
interface Interfacename{
	//methods must be abstract and public only , complier will use automatically if not defined
	//fields must be public static final variables

	//from java8 we can  define concrete method with default access modifier and also static methods can be created
	//from java9 private methods can also be defined
}


interface I1{
	public static final int i=10;
	public void show();
	default void display(){
	//default method can be created
	}

	static void display(){
	//static method can be created
	}
}

class Test implements I1{

	//access modifier of method must be same as the interface abstract method
	public void show(){
		s.o.p(1);
	}

	public static void main(String[] args){
		Test obj = new Test();
		obj.show();
	}
}


//we cannot create object for interface

interface Demo
package oops;

interface InterfaceDemo{
	public void eat();
	public void run();
	default void hey(){
		System.out.println("hey");
	}
	static void display(){
		System.out.println("look");
	}
	int a = 10;
}

public class Test1 implements InterfaceDemo{
	public static void main(String[] args){
		Test1 obj = new Test1();
		obj.eat();
		obj.run();
		System.out.println(InterfaceDemo.a);
		System.out.println(Test1.a);
		System.out.println(a);
		obj.hey();
		InterfaceDemo.display();
		//obj.hi();
	}
	
	public void hi(){
		System.out.println("hi");
	}
	public void eat(){
		System.out.println("Apple");
	}
	public void run(){
		System.out.println("Horse");
	}
}
_______________________________________________________________________________________________________________________________________________________________________Encapsulation: is mechanism of wrapping data(variables) and code acting on the data(methods) together as a single unit
Data Hiding
Steps to achieve encapsulation:
decalre variables of class as private
provide public setter and getter methods to modify and view variables values

class Employee{
	private int emp_id; //data hiding

	public void setEmpId(int emp_id){
		this.emp_id = emp_id;
	}
	public int getEmpId(){
		return emp_id;
	}
}

//encapsulation Demo
package oops;
public class EncapsulationDemo{
	private int num =10;
	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num = num;
	}
	
	public static void main(String[] args){
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setNum(100);
		System.out.println(obj.getNum());
	}

}
_______________________________________________________________________________________________________________________________________________________________________
this keyword:
this keyword is a reference variable that refers to the current object
_______________________________________________________________________________________________________________________________________________________________________superkeyword

super is also reference variable
this refers to current class Object ,super refers to parent class object


_______________________________________________________________________________________________________________________________________________________________________final keyword:
if variable is final it will become constant
if method is final , it cannot be overridden
if class is final , it cannot be extended
_______________________________________________________________________________________________________________________________________________________________________
static:
variable at class level but not a local variable  - classname.variableName
static block
static methods
inner class(nested class) but not outer class

static variable belongs to class
static variable is used for memory management

for suppose we have employee and all employees need to have same company name we can declare it as static thus whenever new object created all will be pointing to same
memeory allocated only once at time of class loading

static method belongs to class
static void display(){

}
className.display();


static block : from jdk version 1.6 we must have main method ,so that static method get executed

 */

	