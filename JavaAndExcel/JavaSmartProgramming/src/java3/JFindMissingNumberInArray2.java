package java3;

public class JFindMissingNumberInArray2 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6 };

		//using XOR : it is commutative and associative
		//a+b = b+a  |  a*b = b*a

		int xor1 = a[0];
		for(int i=1;i<a.length;i++) {
			xor1 = xor1^a[i];
		}

		int xor2 = 1;
		for(int i=2;i<=(a.length+1);i++) {
			xor2=xor2^i;
		}
		System.out.println("missing element is "+(xor1 ^ xor2));
	}
}
