package ytjava2;

public class SExceptionHandlingUserDefined {

	public static void main(String[] args) {
		int i, j;
		i = 8;
		j = 9;
		try {

			int k = i / j;
			
			//suppose my k value is 0 , then i want to throw a exception
			if(k==0) {
				throw new SUserDefiningException("This is not possible value");
			}
			System.out.println(k);
		} catch (SUserDefiningException e) {
			System.out.println("error "+e.getMessage());
		}
	}
}


/*

to define user define execption
step1:

where ever u need exception , use 

	throw new SomeName("Some ErrorDescription");
	
Step2:
create a class with same name as the SomeName we have given in step1

Step3:
The class must extend the Exception class

Step4:
define a constructor with a parameter , and pass message to Exception class using super
public SUserDefiningException(String s) {
		super(s);
	}

*/