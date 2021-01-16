package stack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithLL stk=new StackWithLL();
		stk.push(5);
		stk.push(4);
		stk.push(3);
		stk.push(6);
		stk.push(3);
		stk.pop();
		stk.display();
		System.out.println(stk.isEmpty());

	}

}
