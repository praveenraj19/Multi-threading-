
public class MyThread  {

	public static void main(String[] args) {
		Thread[] pool = new Thread [16];
		
		
	for (int i=1 ; i<6 ; i++){
			Thread t = new Thread (new HelloThread(i));
			t.start();
			pool[i] = t ;
		}
		

	}

}


