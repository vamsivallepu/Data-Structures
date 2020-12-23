
public class LinkedList {
	Node head;

	public void insert(int data) {
		Node n = new Node(data);
		if (head == null)
			head = n;
		else {
			Node t = head;
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
	}

	public void insertAtFirst(int data) {
		Node n = new Node(data);
		Node temp = head;
		head = n;
		n.next = temp;
	}

	public void insertAt(int pos, int data) {
		if (pos == 0)
			insertAtFirst(data);
		else {
			Node n = new Node(data);
			Node temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}

	public void search(int data) {
		Node temp = head;
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
			Node temp = head;
			for (int i = 1; i < pos; i++) {
				temp = temp.next;
			}
			Node rem = temp.next;
			temp.next = rem.next;
		}
	}

	public void sort() {
		Node x, y;
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

	public int count() {
		int c = 0;
		Node temp = head;
		while (temp != null) {
			c++;
			temp = temp.next;
		}
		return c;
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.print(n.data);
	}
}
