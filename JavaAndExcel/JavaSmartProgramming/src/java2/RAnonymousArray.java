package java2;

public class RAnonymousArray {

	public static void main(String[] args) {
		//only single time use
		RAnonymousArray.sum(new int[] {10,20});
		RAnonymousArray.sum1(new int[][] {{10,20,30},{40,50}});
	}

	static void sum(int[] num) {
		int total = 0;
		for(int i:num) {
			total=total+i;
		}
		System.out.println(total);
	}
	static void sum1(int[][] num) {
		int total = 0;
		for(int[] i:num) {
			for(int j:i) {
				total=total+j;
			}
		}
		System.out.println(total);
	}

}
/*
 this is 1d array
 int[] a = new int[]{10,20};

 if we remove int[] a = and declare array

 new int[]{10,20}; // this will become anonymous array - no name

 say we go to new town , we just ask address we need , he tells address to us
 we need not know his name , address - only instant access we need

 similarly when we need to access single time any array we can use anonymous array
 anonymous array are created in single line only , initialize and creation in one line only
 anoymous array can be single and multi dimensional array


 public static void main(String[] args) {
		//only single time use
		RAnonymousArray.sum(new int[] {10,20});
	}

	static void sum(int[] num) {
		int total = 0;
		for(int i:num) {
			total=total+i;
		}
		System.out.println(total);
	}


	anonymous array
	array without name
	created initialized in one line
	used only once
	can be 1d and multi d
	can be used as an argument in method
 */

