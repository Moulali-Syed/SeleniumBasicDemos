package javabasics;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array size is fixed with normal array declaration
		//but we need dynamic size array in real world, we can dynamically grow size of array using ArrayList
		
		//ArrayList is a class , we can access its methods by creating object
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("Apple");
		System.out.println(a.get(1));
		
		
	}

}
