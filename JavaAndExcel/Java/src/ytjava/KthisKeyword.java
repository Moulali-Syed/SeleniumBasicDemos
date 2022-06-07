package ytjava;

public class KthisKeyword {

	int num1;
	int num2;
	KthisKeyword(int n1,int n2){
		
		//this specifies that it is not local variable - but instance variable
		//this refers to current object
		this.num1 =n1;
		this.num2=n2;
	}
	
	public static void main(String[] args) {
		
	}
}
