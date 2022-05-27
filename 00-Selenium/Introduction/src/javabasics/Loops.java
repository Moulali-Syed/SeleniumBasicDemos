package javabasics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays store multiple values
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1]= 2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2 = {1,2,3,4,5,6,7};
		
		
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//while loop
		int j=0;
		while(j <arr2.length) {
			System.out.println(arr2[j]);
			j++;
		}
		
		String[] name = {"apple","banana","mango"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
	}

}
