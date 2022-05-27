package javabasics;

public class EnhancedforLoopConditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"apple","banana","mango"};
		//enhanced for loop
		for(String s:name) {
			System.out.println(s);
		}
		
		int[] arr2 = {1,2,3,3,4,4,5,5,5,89,6,3,5,2};
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2 ==0) {
				System.out.println(arr2[i]);
			}
			else {
				System.out.println(arr2[i]+ " is not muitiple of 2");
			}
		}

	}

}
