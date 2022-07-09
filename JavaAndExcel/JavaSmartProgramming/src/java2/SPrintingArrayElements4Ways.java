package java2;

public class SPrintingArrayElements4Ways {

	//********Traversing array**********************//
	public static void main(String[] args) {

		//1d array
		int[] a = {10,20,30};
		for (int element : a) {
			System.out.println(element);
		}

		//for each
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		//while loop
		int m=0;
		while(m<a.length) {
			System.out.print(a[m]+" ");
			m++;
		}
		System.out.println();
		//do while
		int n=0;
		do {
			System.out.print(a[n]+" ");
			n++;
		}while(n<a.length);
		System.out.println();
		//2d array
		int[][] b = {{10,20},{40,50,60}};
		for (int[] element : b) {
			for(int j=0;j<element.length;j++) {
				System.out.print(element[j]+" ");
			}
			System.out.println();
		}

		//3d array
		int[][][] c = {{{10,20},{30,40,50},{60,70,80}},{{60,70,80},{90,100}}};
		for (int[][] element : c) {
			for(int j=0;j<element.length;j++) {
				for(int k=0;k<element[j].length;k++) {
					System.out.print(element[j][k]+" ");

				}
				System.out.println();
			}
			System.out.println();
		}

		//4d array
		int[][][][] d = {{{{10,20},{30,40}}}};
		for (int[][][] element : d) {
			for(int j=0;j<element.length;j++) {
				for(int k=0;k<element[j].length;k++) {
					for(int l=0;l<element[j][k].length;l++) {
						System.out.print(element[j][k][l]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}


}
