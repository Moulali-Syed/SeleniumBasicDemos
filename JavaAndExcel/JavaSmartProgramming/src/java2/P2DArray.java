package java2;

public class P2DArray {

	public static void main(String[] args) {
		int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
		System.out.println(a);// output: [[I@515f550a
		System.out.println(a[0]);//output [I@cac736f
		System.out.println(a[0][0]);//10
		
		System.out.println(a.length);//3
		System.out.println(a[0].length);//4
	//System.out.println(a[0][0].length);//compile time error length cannot be resolved or is not a field
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/*
 *2d array:
 *declaration - 
 			int[][] a;
 			int[] []a;
 			int a[][];
  			int[] a[];
  			
  			
  			int[] a,b;//a,b are 1D arrays
  			int a[],b; // a is 1D array , b is int variable
  			
  			 int[][] a,b; //a,b are 2D arrays
  			 int[] a[],b; // a is 2d array , b is 1D array
  			 int[] a[],b[]; //a , b are 2D arrays
  			 int[][] a,b[]; //a is 2D , b is 3D arrays
  			 int[][] a,[]b; //a is 2D array , but for 2nd varibale b we cannot provide
  			 				//dimension before , it results in compile time error
  			 		
  			 		
  	int[][] a;//declaration
  	a = new int[2][3]; //creation
  	
  	if number of columns are equal , then it is called matrix array
  	
  	
  	Jagged array:
  	int[][] b = new int[2][];
  	declaring 2nd dimension size is optional
  		b[0] = new int[3];	
  		b[1] = new int[2];
  		
  	Initialization:
  			int[][] a;//declare
  			a = new int[2][3];//creation
  			a[0][0] = 10;
  			a[0][1] = 20;
  			a[1][0] = 40;
  			
  	int[][] a = new int[2][3];
  	
  	int[][] a = {{10,20,30},{40,50,60}};//matrix array
  	
  	
  	in case of jagged array
  	int[][] a ;
  	a = new int[2][];
  	a[0] = new int[4];
  	a[1] = new int[3];
  	
  	a[0,1] = 20;
  	a[1][2] = 50;
  	
  	int[][] a = new int[2][];
  	a[0] = new int[4];
  	a[1] = new int[3];
  	
  	int[][] a = {{10,20,30,40},{50,60,70}};
  	
  	int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
  	
  	System.out.println(a);//  [[I@_someHashCode
  	I means int type array
  	
  	System.out.println(a[0]); //[I@_someHashCode
  	System.out.println(a[0][0]); //10
  	
  	System.out.println(a.length);//3
  	System.out.println(a[0].length);//4
  	System.out.println(a[0][0].length);//error because it is not pointing to any array
  
    
    
    int[][] a = new int[2][];
    sop(a); ..[[I@_hashcode..
    sop(a[0]); //null
    sop(a[0][0]);//runtime exception
    sop(a.length);//2
    sop(a[0].length);//error
    
    print all array elements using for loop
    int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
 */
