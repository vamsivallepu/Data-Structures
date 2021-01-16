package stack;

public class Stack {
	private int max;
	private int top;
	private int[] arr;
	public Stack(int max) {
		top=-1;
		this.max=max;
		arr=new int[max];
	}
	public boolean isEmpty() {
		return top<0;
	}
	public boolean isFull() {
		return top==max-1;
	}
	public void push(int num) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		else {
			arr[++top]=num;
			//System.out.println(num+" is pushed into stack.");
		}
	}
	public int pop() {
		if(isEmpty()){
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			int x=arr[top--];
			return x;
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack Underflow");
			return -1;
		}
		else {
			return arr[top];
		}
	}
	
}
