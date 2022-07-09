package java3;

import java.util.ArrayList;

public class ISumAndCountofEvenOddNumbersInArray {

	public static void main(String[] args) {
		//find number of even , odd numbers  , and sum of even  numbers


		int[] a = {8,5,10,12,3,1,4};
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		for (int element : a) {
			if(element%2 == 0) {
				al1.add(element);
			}else {
				al2.add(element);
			}
		}

		for(int num:al1) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("Number of even numbers is "+al1.size());

		for(int num:al2) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("number of odd numbers is "+al2.size());


		int sum=0;
		for(int num:al1) {
			sum+=num;
		}
		System.out.println("Sum of even Numbers "+sum);

		int sum1=0;
		for(int num:al2) {
			sum1+=num;
		}
		System.out.println("Sum of odd Numbers "+sum1);
	}
}
