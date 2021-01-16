package circularQueue;

public class CircularQueue {
	public int front;
	public int rear;
	public int size;
	public int capacity;
	int queue[];
	public CircularQueue(int cap) {
		capacity=cap;
		queue=new int[capacity];
	}
	public void enQueue(int num) {
		if(!isFull()) {
			queue[rear]=num;
			rear=(rear+1)%capacity;
			size++;
		}
		else
			System.out.println("queue overflow");
	}
	public boolean isFull() {
		// TODO Auto-generated method stub
		return size==capacity;
	}
	public int deQueue() {
		if(!isEmpty()) {
			int data=queue[front];
			front=(front+1)%capacity;
			size--;
			return data;
		}
		else
			System.out.println("queue underflow");
		return -1;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
	public void viewQueue() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%capacity]+" ");
		}
	}
	
}
