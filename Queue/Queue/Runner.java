package Queue;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue que=new Queue(5);
		que.enqueue(5);
		que.enqueue(9);
		que.enqueue(3);
		que.display();
		que.dequeue();
		que.display();
	}

}
