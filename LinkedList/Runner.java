
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(7);
		list.insert(6);
		list.insertAtFirst(9);
		list.insertAtFirst(1);
		list.insertAt(0, 0);
		list.insertAt(1, 2);
		/*
		 * list.sort();
		 * list.search(4);
		 * list.removeAtFirst();
		 * list.removeAt(5);
		 * list.show();
		 * System.out.println("no. of nodes in list = " + list.count());
		 */
		list.show();
	}

}
