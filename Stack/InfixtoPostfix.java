
public class InfixtoPostfix {

	public static void main(String[] args) {
		String inf="1+2*(3^4-5)^(6+7*8)-9";
		Convert(inf);

	}

	public static void Convert(String inf) {
		// TODO Auto-generated method stub
		int max=inf.length();
		int top=-1;
		char[] stk=new char[max];
		//Stack<Character> stk=new Stack<>();
		String res="";
		for(int i=0;i<inf.length();i++) {
			char c=inf.charAt(i);
			if(Character.isLetterOrDigit(c))
				res+=c;
			else if(c=='(')
				stk[++top]=c;
			else if(c==')') {
				while(top>=0 && stk[top]!='(')
					res+=stk[top--];
				top--;
			}
			else {
				while(top!=-1 && prec(c)<=prec(stk[top]))
					res+=stk[top--];
				stk[++top]=c;
			}
		}
		while(top!=-1)
			res+=stk[top--];
		System.out.println(res);
	}

	public static int prec(char ch) {
		// TODO Auto-generated method stub
		if(ch=='^')  	// assume that '^' indicates power (Ex.a^b)
			return 5;
		else
		if((ch=='*') || (ch=='/') || (ch=='%'))
			return 4;
		else
		if((ch=='+') || (ch=='-'))
			return 3;
		else
		if(ch=='=')		
			return 1;
		else
			return -1;
	}
}
