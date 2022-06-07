package ytjava;

class Emp {

	int eid;
	int salary;
	static String ceo;// ceo is common to all employees , so if we want to declare variables which is not object specific mark it as
	//static

	
	//constructor : we can provide default values for instance variables
	//constructor when u create object
	Emp(){
		eid = 10;
		salary = 100000;
		System.out.println("In constructor");
		
		//we dont specify static variables here because everytime object is created constructor will run
		//but static is class variable , so to initialize with some default value use static block
	}
	
	//when u load a class
	static {
		ceo="Jerry";//executes only once irrespective of number of objects created
		System.out.println("In static");
		//only static variables can be called inside static block and static methods
	}
	public void show() {
		System.out.println(eid + " " + salary + " " + ceo);
	}
}

public class MStaticKeyword {

	public static void main(String[] args) {
		Emp ravi = new Emp();
		ravi.eid = 8;
		ravi.salary = 1000000;
//		ravi.ceo = "Jerry";
		Emp.ceo = "Jerry";

		Emp tom = new Emp();
		tom.eid = 9;
		tom.salary = 10000000;
//		tom.ceo = "Jerry";
		Emp.ceo = "Jerry";
		ravi.show();
		tom.show();
	}
}
