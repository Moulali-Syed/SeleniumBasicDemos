package java1;

public class CVariablesDemo {


	int a =10;
	static int b =20;
	public static void main(String[] args) {
		CVariablesDemo  obj = new CVariablesDemo();
		System.out.println(obj.a);//10
		System.out.println(CVariablesDemo.b);//20
		obj.a=1000;
		CVariablesDemo.b = 2000;
		System.out.println(obj.a);//1000
		System.out.println(CVariablesDemo.b);//2000


		CVariablesDemo  obj1 = new CVariablesDemo();
		System.out.println(obj1.a);//10
		System.out.println(CVariablesDemo.b);//2000
	}
}
/*
static variables is not dependent on the instance , they share with all objects
instance variable allocates memory with each object creation
*/