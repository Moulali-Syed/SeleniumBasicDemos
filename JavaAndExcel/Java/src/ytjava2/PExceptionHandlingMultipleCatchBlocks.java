package ytjava2;

public class PExceptionHandlingMultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int a[] = new int[6];
			a[4] = 8;

			int i = 7;
			int j = 2;
			int k = i / j;
			System.out.println(k);

			// what if by mistake i have written a[6]
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in limit");
		}catch(Exception e) {
			
			System.out.println(e);
			//last exception block we can use Exception
		}
			finally {
		}

		

	}
}


/*
 * 
 * 
 *
  catch (ArithmeticException e) {
			System.out.println("error");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
		
		instead of multiple catch blocks we can have 
		multiple exceptions in one catch block
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		} 
 */
