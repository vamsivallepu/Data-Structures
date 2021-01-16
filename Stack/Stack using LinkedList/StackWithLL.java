package stack;

public class StackWithLL {
	Node top;
	public void push(int data) {
		Node temp=new Node(data);
		if(top==null) {
			top=temp;
		} else {
			temp.next=top;
			top=temp;
		}
	}
	public void pop() {
		if(top==null)
			System.out.println("Stack Underflow");
		else {
			System.out.println("The element deleted is "+top.data);
			top=top.next;
		}
	}
	public int peek() {
		if(top==null)
			return -1;
		else
			return top.data;
	}
	boolean isEmpty() {
		return top==null;
	}
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+"<-");
			temp=temp.next;
		}
		System.out.println();
	}
}
