package java2;

public class OTypesOfArray {

	public static void main(String[] args) {
//		int[] a =  new int[0];//compiles and runs successfully

//		int[] b = new int[-3];//Exception in thread "main" java.lang.NegativeArraySizeException: -3
		int[] a = new int[3];
		a[0] = 9;
		a[1]=  8;
		a[2] =12;
		int[] c = {10,20,30};

		for (int element : a) {
			System.out.println(element);
		}

		for(int num : c) {
			System.out.println(num);
		}

	}
}
/*
Types of array:

	single dimensional 1D


	Multi Dimensional - 2d or 3d


	1D Array:
	declaration - simple variables are decalred as int a;
		int[] a;  ------>preferred
		int []a;
		int a[];
		int[]a;

		String[] a;
		String []a;
		String a[];
		String[]a;

		we dont specify size at time of declaration

		int[] a,b;---> a,b are array
		int []a,b;  ---> a,b are array
		int a[],b ;------> a is array, b is simple int type variable

	creation -
		int[] a;
		a = new int[3];//creation
		Array is object , so we use new keyword to create array

		At the time of creation , we must give size it is compulsory

		int[] a = new int[3]; //declare and creation in single line

		int[] a = new int[0];//compiles and runs successfully
		int[] a = new int[-3]; //compiles successfully and run time it gives NegativeArraySizeException

	Initialization:
		int[] a;
		a = new int[3];

		default values will be initialized , int so 0

		we can set values
		a[0]  = 10;
		a[1] = 20;
		a[2] =30;

		if we give a[3]=40;--->ArrayIndexOutOfBoundException

		int[] a = {10,20,30}; //declare,create,initialization

		int[] a = new int[]{10,20,30};//declare,create,initialization

	retrieve:
		int[] a = {10,20,30};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

		for(int i : a){
			System.out.println(i);
		}

*/