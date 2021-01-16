package circularQueue;
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue que=new CircularQueue(5);
		que.enQueue(5);
		que.enQueue(4);
		que.enQueue(3);
		que.enQueue(2);
		que.enQueue(1);
		System.out.println(que.size);
		que.deQueue();
		que.deQueue();
		System.out.println(que.size);
		que.enQueue(7);
		que.enQueue(6);
		System.out.println(que.size);
		que.deQueue();
		que.viewQueue();
	}

}
