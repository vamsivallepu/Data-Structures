package stackQueue;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack q=new QueueUsingStack();
		q.enQueue(4);
		q.enQueue(2);
		q.enQueue(1);
		q.dequeue();
		q.dequeue();	
		q.dequeue();	
		q.dequeue();	
	}

}
