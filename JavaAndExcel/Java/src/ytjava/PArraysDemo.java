package ytjava;

public class PArraysDemo {

	public static void main(String[] args) {

		// Array collection of elements
		// every element in array can accessed using index, index starts from 0
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] nums = new int[3];// size is fixed in array once defined

		nums[0] = 10;
		nums[1] = 12;
		nums[2] = 19;

		System.out.println(nums[1]);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		int[][] multiDimensionArr = { { 1, 2, 3 }, { 3, 2, 1 }, { 4, 2, 6 } };

		System.out.println(multiDimensionArr[1][1]);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(multiDimensionArr[i][j] + " ");
			}
			System.out.println();
		}

		// jagged array
		int[][] jaggedArr = { { 1, 2, 3, 4 }, { 2, 1 }, { 4, 2, 6, 1, 5 } };
		for (int i = 0; i < jaggedArr.length; i++) {
			for (int j = 0; j < jaggedArr[i].length; j++) {
				System.out.print(jaggedArr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
