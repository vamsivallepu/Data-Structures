package polynomial;

import java.util.Scanner;

public class Polynomial {
	Scanner sc = new Scanner(System.in);
	Node head;
	Node last;

	public void create(int n) {
		int coe, exp;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter coefficient and exponent of " + (i + 1) + "th term :");
			coe = sc.nextInt();
			exp = sc.nextInt();
			insert(coe, exp);
		}
	}

	public void insert(int coe, int exp) {
		Node node1 = new Node();
		node1.coe = coe;
		node1.exp = exp;
		if (head == null) {
			head = node1;
			last = node1;
		} else {
			last.next = node1;
			last = node1;
		}
	}

	public void add(Polynomial p1, Polynomial p2) {
		Node temp1 = p1.head;
		Node temp2 = p2.head;
		Node temp3;
		while (temp1 != null && temp2 != null) {
			temp3 = new Node();
			if (temp1.exp == temp2.exp) {
				temp3.coe = temp1.coe + temp2.coe;
				temp3.exp = temp1.exp;
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else if (temp1.exp > temp2.exp) {
				temp3.coe = temp1.coe;
				temp3.exp = temp1.exp;
				temp1 = temp1.next;
			} else {
				temp3.coe = temp2.coe;
				temp3.exp = temp2.exp;
				temp2 = temp2.next;
			}
			if (head == null) {
				head = temp3;
				last = temp3;
			} else {
				last.next = temp3;
				last = temp3;
			}
		}
		while (temp1 != null) {
			temp3 = new Node();
			temp3.coe = temp1.coe;
			temp3.exp = temp1.exp;
			last.next = temp3;
			last = temp3;
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			temp3 = new Node();
			temp3.coe = temp2.coe;
			temp3.exp = temp2.exp;
			last.next = temp3;
			last = temp3;
			temp2 = temp2.next;
		}
	}

	public void subtract(Polynomial p1, Polynomial p2) {
		Node temp1 = p1.head;
		Node temp2 = p2.head;
		Node temp3;
		while (temp1 != null && temp2 != null) {
			temp3 = new Node();
			if (temp1.exp == temp2.exp) {
				temp3.coe = temp1.coe - temp2.coe;
				temp3.exp = temp1.exp;
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else if (temp1.exp > temp2.exp) {
				temp3.coe = temp1.coe;
				temp3.exp = temp1.exp;
				temp1 = temp1.next;
			} else {
				temp3.coe = temp2.coe;
				temp3.exp = temp2.exp;
				temp2 = temp2.next;
			}
			if (head == null) {
				head = temp3;
				last = temp3;
			} else {
				last.next = temp3;
				last = temp3;
			}
		}
		while (temp1 != null) {
			temp3 = new Node();
			temp3.coe = temp1.coe;
			temp3.exp = temp1.exp;
			last.next = temp3;
			last = temp3;
			temp1 = temp1.next;
		}
		while (temp2 != null) {
			temp3 = new Node();
			temp3.coe = temp2.coe;
			temp3.exp = temp2.exp;
			last.next = temp3;
			last = temp3;
			temp2 = temp2.next;
		}

	}

	public void multiply(Polynomial p1, Polynomial p2) {
		Node temp1 = p1.head;
		Node temp2;
		Node temp3;
		while (temp1 != null) {
			temp2 = p2.head;
			while (temp2 != null) {
				temp3 = new Node();
				temp3.coe = temp1.coe * temp2.coe;
				temp3.exp = temp1.exp + temp2.exp;
				temp3.next = null;
				if (head == null) {
					head = temp3;
					last = temp3;
				} else {
					last.next = temp3;
					last = temp3;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		temp1 = head;
		while (temp1 != null) {
			temp2 = temp1;
			temp3 = temp1.next;
			while (temp3 != null) {
				if (temp1.exp == temp3.exp) {
					temp1.coe = temp1.coe + temp3.coe;
					temp2.next = temp3.next;
					temp3 = temp2.next;
				} else {
					temp2 = temp3;
					temp3 = temp3.next;
				}
			}
			temp1 = temp1.next;
		}
	}

	public void display() {
		for (Node temp = head; temp != null; temp = temp.next) {
			if (temp.next != null)
				System.out.print("(" + temp.coe + ")" + "x^" + temp.exp + " + ");
			else
				System.out.println("(" + temp.coe + ")" + "x^" + temp.exp);
		}
	}
}
