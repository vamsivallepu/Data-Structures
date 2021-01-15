package doublyLinkedList;

public class DoublyLinkedList {
	Node head, tail;

	public void insert(int data) {
		Node node1 = new Node(data);
		if (head == null) {
			head = node1;
			tail = node1;
		} else {
			tail.next = node1;
			node1.pre = tail;
			tail = node1;
		}
	}

	public void reverse() {
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.pre;
		}
	}
	public void insertAt(int pos, int data) {
		Node node1=new Node(data);
		Node temp=head;
		if(pos<0 || pos>=this.size()) {
			System.out.println("Index out of Range. Please enter a valid number.");
		}
		else if(pos==0) {
			head=node1;
			head.next=temp;
			temp.pre=node1;
		} else if(pos==this.size()){
			Node temp1=tail;
			tail=node1;
			temp1.next=tail;
			tail.pre=temp1;
			
		}else {
			for(int i=1;i<pos;i++) {
				temp=temp.next;
			}
			Node n=temp.next;
			node1.next=temp.next;
			temp.next=node1;
			node1.pre=temp;
			n.pre=node1;
		}
	}
	
	public void removeAt(int pos) {
		if(pos<0 || pos>=this.size()) {
			System.out.println("Index out of Range. Please enter a valid number.");
		}
		else if(pos==0) {
			head=head.next;
			head.pre=null;
		} else if(pos==this.size()-1) {
			tail=tail.pre;
			tail.next=null;
		} else {
			Node temp=head;
			for(int i=1; i<=pos; i++) {
				temp=temp.next;
			}
//			System.out.println(temp.data);
			temp.next.pre=temp.pre;
			temp.pre.next=temp.next;
		}
	}
	
	public void search(int n) {
		Node temp=head;
		int index=0;
		while(temp!=null) {
			if(temp.data==n) {
				System.out.println(n+" found at position "+index);
				return;
			}
			temp=temp.next;
			index+=1;
		}
		System.out.println("Given element not found!");
	}
	
	public void show() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
		System.out.println();
	}
	public int size() {
		Node temp= head;
		int c=0;
		while(temp!=null) {
			temp=temp.next;
			c++;
		}
		return c;
	}
}
