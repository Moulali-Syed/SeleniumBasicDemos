package java3;

public class NMaximumSumSubArrayKadanesAlgorithm {

	// NMaximumSumSubArrayKadanesAlgorithm largest sum continuous sub array
	public static void main(String[] args) {
		int[] a = { 4, -2, -3, 4, -1, -2, 1, 5, -3 };

		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;
		int s = 0;
		int start = 0, end = 0;
		for (int i = 0; i < a.length; i++) {
			maxEndingHere = maxEndingHere + a[i];
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
				start = s;
				end = i;
			}
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
				s = i + 1;
			}
		}
		System.out.println(maxSoFar+" "+start+" "+end);
	}
}
