package java1;

public class NLeapyear {

/*
 * leap year
 * 1.check if divisible by 4
 * 2.check if divisible by 100
 * 3.check if divisible by 400
 *
 */
	public static void leapyear(int year) {
		if(year % 4 ==0) {
			if(year%100==0) {
				if(year % 400 ==0) {
					System.out.println("leap year");
				}else {
					System.out.println("not leap year");
				}
			}
			else {
				System.out.println(" leap year");
			}
		}else {
			System.out.println("not leap year");
		}
	}

	public static void singleCondLeapYear(int year) {
		if((year%400==0)||(year%4==0 && year%100 !=0)) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
	}
	public static void main(String[] args) {
		leapyear(2000);
	}
}
