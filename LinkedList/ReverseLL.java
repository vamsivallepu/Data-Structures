import java.util.Scanner;

class Node {
	Node next,tail;
	int data;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
class LinkedList {
	public Node head;
	Node tail;
	public void takeInput() {
		Scanner sc= new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			Node node1= new Node(data);
			if(head==null) {
				head=node1;
				tail=node1;
			}else {
				tail.next=node1;
				tail=node1;
			}
			data = sc.nextInt();
		}
		sc.close();
	}
}
public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.takeInput();
		Node h=reverse(list.head);
		Node temp=h;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static Node reverse(Node head) {
		// TODO Auto-generated method stub
		Node pre=null;
		Node current=head;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		head=pre;
		return head;
	}

}
