package java5;

/*
 * 
 * in Thread class we have 2 sleep methods , which means it is overloaded
 * class Thread{
 * 			//written in other language
 * 		public static native void sleep(long millis) throws InterruptedException{
 * 
 * 
 * 	}
 * 		public void static sleep(long millis,int nano) throws InterruptedException{
 * 
 * 	}
 * 
 * }
 */
public class JsleepMethod {
	public static void main(String[] args)  {
		for(int i=1;i<=5;i++) {
//			Thread.sleep(1000);//sleep method throws exception - throws InterruptedException //1way
			try {//2nd way
				Thread.sleep(1000);
				System.out.println(i);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}

class TestS extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);//Thread-0 is pause
				System.out.println(i);
			}catch(Exception e) {
				System.out.println(e);
			}
		
		}
	}
	public static void main(String[] args) {
		TestS t = new TestS();
		t.start();
	}
}
//Thread.sleep(-1); - IllegalArgumentException
//Thread.sleep(1000,-1); - IllegalArgumentException