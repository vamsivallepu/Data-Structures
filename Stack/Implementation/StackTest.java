import stack.*;
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk=new Stack(5);
//		System.out.println(stk.isEmpty());
		stk.push(5);
		stk.push(4);
		stk.push(3);
		stk.push(2);
		stk.push(1);
		stk.pop();
		System.out.println(stk.isFull());
		System.out.println(stk.isEmpty());
		System.out.println(stk.peek());
	}

}
