package producerConsumer;

public class Box {
	public String message;
	private boolean empty = true;
	
public synchronized String take(){
	System.out.println("I am consumer and in the take method : " + Thread.currentThread().getName());
	while(empty){
	try{
		System.out.println("I am cosumer and waiting : " + Thread.currentThread().getName());
		wait();
	}
	catch(InterruptedException e){
	}
}
	empty = true;
	notifyAll();
	return message;
}

public  synchronized void put(String message){
	System.out.println("I am producer and in the put method : " + Thread.currentThread().getName());
	while(!empty){
	try{
		System.out.println("I am producer and waiting : " + Thread.currentThread().getName());
		wait();
	}
	catch(InterruptedException e){
	}
}
	empty = false;
	this.message = message;
	notifyAll();
	return;
}
	
}






