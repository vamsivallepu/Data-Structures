package Queue;

public class Queue {
	int front;
	int rear;
	int capacity;
	int size;
	int[] queue;
	public Queue(int cap) {
		front=-1;
		rear=-1;
		this.capacity=cap;
		queue=new int[cap];
	}
	public boolean isFull() {
		return rear==capacity-1;
	}
	public void enqueue(int data) {
		if(!isFull()) {
			queue[++rear]=data;
			if(front==-1)
				front++;
			
		}else {
			System.out.println("Queue is full!");
		}
	}
	public boolean isEmpty() {
		return front==-1;
	}
	public int dequeue() {
		if(!isEmpty()) {
			int k= queue[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else
				front++;
			return k;
		}
		else {
			System.out.println("Queue is empty");
			return -1;
		}
	}
	public void display() {
		if(!isEmpty()) {
			for(int i=front;i<=rear;i++)
				System.out.print(queue[i]+"<=");
		}
		else 
			System.out.println("Queue is empty");
		System.out.println();
	}

}
