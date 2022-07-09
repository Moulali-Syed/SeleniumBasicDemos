package java1;

public class ZArmstrongNumber {

	/*
	 * armstrong number
	 *  1 = 1^1
	 *
	 *  12 = 1^2+2^2
	 *
	 *  123 = 1^3+2^3+3^3
	 *
	 *  0,1 , 153,370, 371,407,1634 are armstrong numbers
	 *
	 *  armstrong: find length , then apply reverse a number logic
	 *
	 *
	 *
	 */
	public static void main(String[] args) {
		armstrong();
	}

	private static void armstrong() {

		int num = 153;
		int t1 = num;
		int leng =0;
		while(t1!=0) {
			leng = leng+1;
			t1 = t1/10;
		}

		int t2 = num;
		int rem;
		int arm = 0;
		while(t2!=0) {
			rem = t2%10;
			int mul=1;
			for(int i=1;i<=leng;i++) {
				mul = mul*rem;
			}
			arm = arm+mul;
			t2=t2/10;
		}

		if(num==arm) {
			System.out.println("armstrong");
		}else {
			System.out.println("Not armstrong");
		}
	}
}
