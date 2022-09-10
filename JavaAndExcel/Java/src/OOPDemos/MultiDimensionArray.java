package OOPDemos;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		for(int a=0;a<arr.length;a++) {
			for(int b=0;b<arr[a].length;b++) {
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}
		
		for(int row=0;row<arr.length;row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}
}
