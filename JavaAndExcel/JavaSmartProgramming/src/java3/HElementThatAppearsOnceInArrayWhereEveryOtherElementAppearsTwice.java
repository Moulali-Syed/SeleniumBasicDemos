package java3;

public class HElementThatAppearsOnceInArrayWhereEveryOtherElementAppearsTwice {

	public static void main(String[] args) {
		int[] a = {5,3,4,5,2,3,4};
		
		// we can solve using HashMap or XOR[^-bitwise]
		
		//commutative law: this law says we can swap numbers over and still get same answer
		//ex: a+b = b+a ; a*b = b*a;
		
		//associative law: this say that it doesnot matter how we group numbers (i.e which we calculate first)
//		for ex: (a+b)+c = a+(b+c) ;  (a*b)*c = a*(b*c)
		/*
		 0 0 - 0
		 0 1 - 1
		 1 0 - 1
		 1 1 - 0
		 */
		int res = a[0];
		for(int i=1;i<a.length;i++) {
			res = res^a[i];
		}
		System.out.println("single element is "+res);
		
//		6302175830
	}
}
