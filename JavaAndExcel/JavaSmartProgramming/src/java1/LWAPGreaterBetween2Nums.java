package java1;

public class LWAPGreaterBetween2Nums {


	public static void greater() {
		int a =10,b=20,c=30;
		if(a>b && a>c) {
			System.out.println("a is greater");
		}else if(b>a && b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
	}

	public static void greaterof3() {
		int a =10,b=20,c=30;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}else {
				System.out.println("c is greater");
			}
		}else if(b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
	}

	int x=20,y=40;
	int num = (x>y)?x:y;

	public static void main(String[] args) {
		int a =10,b=20;
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}

		greater();
		greaterof3();
	}
}
