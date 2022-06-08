package ytjava;

public class QEnhancedForLoop {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		for (int i : a) {
			System.out.println(i);
		}

		int[][] multiDimensionArr = { { 1, 2, 3 }, { 3, 2, 1 }, { 4, 2, 6 } };

		for (int[] i : multiDimensionArr) {
			for (int k : i) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
