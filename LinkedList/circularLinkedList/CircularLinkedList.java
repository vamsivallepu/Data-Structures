package circularLinkedList;

public class CircularLinkedList {
	Node head;
	Node last;
	public void insert(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=temp;
			last=temp;
			last.next=head;
		} else {
			last.next=temp;
			last=temp;
			last.next=head;
		}
	}
	public void display() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
}
