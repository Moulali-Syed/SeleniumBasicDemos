package java3;

public class JFindMissingNumberInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6 };

		int expectedElements = a.length + 1;
		int total_sum = (expectedElements * (expectedElements + 1)) / 2;

		int sum = 0;
		for (int num : a) {
			sum += num;
		}

		int missingNumber = total_sum - sum;
		System.out.println(missingNumber);
	}
}
