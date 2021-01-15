package doublyLinkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(1);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insertAt(2, 0);
		list.removeAt(2);
		list.search(9);
		list.show();
	}
}
