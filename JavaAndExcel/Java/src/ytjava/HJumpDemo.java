package ytjava;

public class HJumpDemo {
	public static void main(String[] args) {

		
		//break and continue
		
		for(int i=0;i<7;i++) {
			if(i%2==0) {
				continue;//skip current iteration
			}
			System.out.println(i);
		}
		
		for(int i=1;i<10;i++) {
			if(i==3) {
				break;//comes out of loop
			}
		}
	}
}
