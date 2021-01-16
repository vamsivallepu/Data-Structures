import java.util.*;
public class IsBalanced {
	public static boolean isBalanced(String exp) {
		if(exp.length()==0)
				return true;
		int top=-1;
		int max=exp.length();
		char stk[]=new char[max];
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(c=='(' || c=='[' || c=='{')
				stk[++top]=c;
			if (c == '}' || c == ')' || c == ']'){
				if (top==-1)
					return false;
				char last = stk[top];
				if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
					--top;
				else 
					return false;
			}
		}
		return top==-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any Expression :");
		Scanner inp=new Scanner(System.in);
		String exp=inp.nextLine();
		if(isBalanced(exp))
			System.out.println("Given expression is balanced");
		else
			System.out.println("Given expression is not balanced");
		inp.close();
	}

}
