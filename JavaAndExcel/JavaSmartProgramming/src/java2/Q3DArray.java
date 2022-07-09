package java2;

public class Q3DArray {

	public static void main(String[] args) {
	 	int[][][] a = {{{10,20},{40,50,60},{45,65}}};
	 	System.out.println(a.length);//1
	 	System.out.println(a[0].length);//3
	 	System.out.println(a[0][0].length);//2
//	 	System.out.println(a[0][0][0].length);//compile time error

	 	for (int[][] element : a) {
	 		for(int j=0;j<element.length;j++) {
	 			for(int k=0;k<element[j].length;k++) {
	 				System.out.print(element[j][k]+" ");
	 			}
	 			System.out.println();
	 		}
	 	}
	}

}

/*
 * 3D array
 declaration:
 		int[][][] a; //preferred
 		int[] [][]a;
 		int[] []a[];
 		int [][]a[];
 		int []a[][];

 creation of 3d array
 		a = new int[2][][];
 		a[0] = new int[2][];
 		a[0][0] = new int[3];
 		a[0][1] = new int[2];

 		a[1] = new int[2][];
 		a[1][0] = new int[2];
 		a[1][1] = new int[3];

 		a----> | 0 | 1 |
 				 |
 		a[0][] | 0 | 1 |

 		a[0][0]  |
 				| | | |

 	declare and create in one line
 	int[][][] a = new int[2][3][2];

 	Initialization :
 	a[0][0][0] = 10;
 	a[0][0][1] = 20;
 	a[1][0][0] = 30;


 	int[][][] a = {{{10,20}{40,50,60}{45,65}}};

 	sop(a);//[[[I@_hashcode
 	sop(a[0]); //[[I@_hashcode
 	sop(a[0][0]); //[I@_hashcode
 	sop(a[0][0][0]); //10
	 	int[][][] a = {{{10,20},{40,50,60},{45,65}}};
	 	System.out.println(a.length);//1
	 	System.out.println(a[0].length);//3
	 	System.out.println(a[0][0].length);//2
//	 	System.out.println(a[0][0][0].length);//compile time error


 	 	for(int i=0;i<a.length;i++) {
	 		for(int j=0;j<a[i].length;j++) {
	 			for(int k=0;k<a[i][j].length;k++) {
	 				System.out.print(a[i][j][k]+" ");
	 			}
	 			System.out.println();
	 		}
	 	}
 */
