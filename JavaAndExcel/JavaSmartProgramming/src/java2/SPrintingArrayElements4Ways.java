package java2;

public class SPrintingArrayElements4Ways {
	
	//********Traversing array**********************//
	public static void main(String[] args) {
		
		//1d array
		int[] a = {10,20,30};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
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
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		//3d array
		int[][][] c = {{{10,20},{30,40,50},{60,70,80}},{{60,70,80},{90,100}}};
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				for(int k=0;k<c[i][j].length;k++) {
					System.out.print(c[i][j][k]+" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//4d array
		int[][][][] d = {{{{10,20},{30,40}}}};
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				for(int k=0;k<d[i][j].length;k++) {
					for(int l=0;l<d[i][j][k].length;l++) {
						System.out.print(d[i][j][k][l]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	
}
