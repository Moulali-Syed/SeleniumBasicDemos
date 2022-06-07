package ytjava;

public class FIteration {
	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");

		System.out.println("******************FOR LOOP*******************");//know start and end
		for (int i = 0; i < 3; i++) {
			System.out.println("hello");
		}
		
		System.out.println("***********WHILE LOOP**************");//donot know how many times to run
		int count =1;
		while(count<=3) {
			System.out.println("hello");
			count++;
		}
		
		System.out.println("*********DO WHILE***************");//runs atleast one , though condition is not specified
		do {
			System.out.println("hello");
			count++;
		}while(count<=3);
	}
}
