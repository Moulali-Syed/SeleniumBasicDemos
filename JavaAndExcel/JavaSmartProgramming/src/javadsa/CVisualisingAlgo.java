package javadsa;

public class CVisualisingAlgo {
	
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=1;i<10000;i++) {
			System.out.println(i);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time: "+(endTime-startTime)+"ms");
		//this above step gives the time taken by algorithm to execute
	}

}

/*

Algorithm which takes a short time to generate a result in all cases  - is best algorithm
then that is suitable algorithm for that case

how to Visualize execution of program?


*/