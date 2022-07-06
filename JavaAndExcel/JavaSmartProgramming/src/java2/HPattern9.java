package java2;

public class HPattern9 {

	public static void main(String[] args) {
	pattern14();	
	}

	private static void pattern14() {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(i>=2 && j>=2 && i<=4 && j<=4 ) {
					
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
}
