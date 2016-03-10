package producerConsumer;

public class Producer extends Thread {
	private Box box ;
	
	public Producer (Box ticket){
		this.box = ticket;
	}
	
	public void run () {
		
		System.out.println("I am in the producer run method : " + Thread.currentThread().getName()); 
		String[] messages = {"vijay","raj", "hemanth", "derwin", "deep","duhit"};
		
		for (String message : messages){
			box.put(message);
		}
	box.put("Done");
	}

}
