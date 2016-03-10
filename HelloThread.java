public class HelloThread implements Runnable{
	private int n;
	
	
	public HelloThread(int n) {
		this.n = n;
		
	}

	 public void  run() {
		System.out.println("Hello World" + n );
	}
}