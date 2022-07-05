package java1;

public class OSwapwithNwithoutThirdVariable {
	
	public static void swap() {
		int a=10,b=20;
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+ b);
		
	}
	
	public static void swapWithoutTemp() {
		int a =10,b=30;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
	}

	public static void main(String[] args) {
		swap();
		swapWithoutTemp();
	}
}
