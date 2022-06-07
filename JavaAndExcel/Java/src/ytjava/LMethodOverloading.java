package ytjava;


class Casio{
	int num1;
	int num2;
	String operation;
	
	
	//constrcutor overloading
	public Casio() {
		num1=0;
		num2=0;
		operation="Nothing";
	}
	
	public Casio(int i) {
		num1=1;
		num2=0;
		operation="Nothing";
	}
	
	public Casio(int i,int j) {
		num1=i;
		num2=j;
		operation="Nothing";
	}
	//same method name but different parameters is called method overloading
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
}

public class LMethodOverloading {
public static void main(String[] args) {
	Casio obj = new Casio();
	obj.add(20, 10);
	
	obj.add(1, 2,3);
}
}
