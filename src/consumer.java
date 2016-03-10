package producerConsumer;

public class consumer extends Thread{
	private Box ticket;
	
	public consumer (Box ticket){
		this.ticket = ticket;
	}
	public void run(){
		
		System.out.println("I am in the consumer run method : " + Thread.currentThread().getName());
		for(String message = ticket.take(); !message.equals("Done"); message= ticket.take()){
			System.out.println(message);
		}
	}
}
