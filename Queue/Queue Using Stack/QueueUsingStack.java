package stackQueue;

public class QueueUsingStack {
	int top1;
	int top2;
	int s1[];
	int s2[];

	public QueueUsingStack() {
		top1 = -1;
		top2 = -1;
		s1 = new int[25];
		s2 = new int[25];
	}

	void push1(int e) {
		s1[++top1] = e;
	}

	void push2(int e) {
		s2[++top2] = e;
	}

	int pop1() {
		return s1[top1--];
	}

	int pop2() {
		return s2[top2--];
	}

	void enQueue(int e) {
		push1(e);
	}

	void dequeue() {
		if (top1 == -1 && top2 == -1) {
			System.out.println("Queue Underflow");
		} else if (top2 == -1) {
			while (top1 != -1)
				push2(pop1());
			System.out.println("The element deleted is " + pop2());
		} else {
			System.out.println("The element deleted is " + pop2());
		}
	}

}
