package singlyLinkedList;
import java.util.Scanner;

public class LinkedList {
	Node<Integer> head;
	Node<Integer> tail;
	public void takeInput() {
		Scanner sc= new Scanner(System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			Node<Integer> node1= new Node<>(data);
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

	public void insert(int data) {
		Node<Integer> n = new Node<Integer>(data);
		if (head == null)
			head = n;
		else {
			Node<Integer> t = head;
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
	}

	public void insertAtFirst(int data) {
		Node<Integer> n = new Node<Integer>(data);
		Node<Integer> temp = head;
		head = n;
		n.next = temp;
	}

	public void insertAt(int pos, int data) {
		if(pos>=this.size()) {
			System.out.print("Out of range for position "+pos);
			System.out.println();
			return;
		}
		else if (pos == 0)
			insertAtFirst(data);
		else {
			Node<Integer> n = new Node<Integer>(data);
			Node<Integer> temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}

	public void search(int data) {
		Node<Integer> temp = head;
		int p = 0;
		while (temp != null) {
			if (temp.data == data) {
				System.out.println(data + " is found at index " + p);
				return;
			}
			p++;
			temp = temp.next;
		}
		System.out.println("element not found");
	}

	public void removeAtFirst() {
		head = head.next;
	}

	public void removeAt(int pos) {
		if (pos == 0)
			removeAtFirst();
		else {
			Node<Integer> temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.next;
			}
			Node<Integer> rem = temp.next;
			temp.next = rem.next;
		}
	}

	public void sort() {
		Node<Integer> x, y;
		for (x = head; x != null; x = x.next) {
			for (y = x.next; y != null; y = y.next) {
				if (x.data > y.data) {
					int temp = x.data;
					x.data = y.data;
					y.data = temp;
				}
			}
		}
	}

	public int size() {
		int c = 0;
		Node<Integer> temp = head;
		while (temp != null) {
			c++;
			temp = temp.next;
		}
		return c;
	}

	public void show() {
		Node<Integer> n = head;
		while (n.next != null) {
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print(n.data);
	}
}
