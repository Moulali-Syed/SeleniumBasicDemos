package javadsa;

public class CVisualisingAlgo2 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		int x= 9999996;
		int n = 10000000;
		int count = 0;
		for(int i=0;i<n;i++) {
			count++;
			if(i==x) {
				System.out.println("we found the value at "+count+" try");
				break;
			}
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Total time : "+(endTime-startTime)+" ms");

		//execution time will be different on concurrent runs also depending on machines
	}
}
