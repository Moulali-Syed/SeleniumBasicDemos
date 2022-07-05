package java1;

import java.util.Scanner;

public class TFactorialUsingRecursion {
	
	//method calling itself again and again
	int fact =1;
	public int calFact(int num) {
		if(num>1) {
			fact = fact*num;
			calFact(num-1);
		}
		return fact;
		
	}

	public static void main(String[] args) {
		TFactorialUsingRecursion obj = new TFactorialUsingRecursion();
		
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		int res = obj.calFact(num);
		System.out.println("factorial of number is "+res);
		
	}
}
