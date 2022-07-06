package java2;

/*
1
12
123
1234

1
22
333
4444
 */
public class INumericPattern1 {

	
	public static void main(String[] args) {
		numPattern1();
		numPattern2();
	}

	private static void numPattern1() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	private static void numPattern2() {
		int count=0;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
