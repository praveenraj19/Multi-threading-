package producerConsumer;

public class ProducerConsumer {

	public static void main(String[] args) {
		Box t = new Box();
		Producer p = new Producer(t);
		consumer c = new consumer(t);
		Producer p1 = new Producer(t);
		consumer c1 = new consumer(t);
		
		p.start();
		c.start();
		p1.start();
		c1.start();
		
		
try{
	c.join();
	
}catch (InterruptedException e ) {
	e.printStackTrace();
}
System.out.println("FINISHED");
	}
	

}
