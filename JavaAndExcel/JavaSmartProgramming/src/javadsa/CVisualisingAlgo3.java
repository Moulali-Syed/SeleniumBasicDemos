package javadsa;

public class CVisualisingAlgo3 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		int x = 9999996;
		int n = 10000000;
		int count =0 ;
		boolean isEven = n%2 ==0;
		if(x>=0) {
			if(isEven) {
				for(int i=0;i<n;i=i+2) {
					count++;
					if(i==x) {
						System.out.println("we found value at "+count+" try");
						break;
					}
				}
			}
			else {
				for(int i=1;i<n;i=i+2) {
					count++;
					if(i==x) {
						System.out.println("We found value at "+count+" try");
						break;
					}
				}
			}
		}else {
			System.out.println("we are expecting valid value");
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Time taken : "+(endTime-startTime)+" ms");
	}
}
