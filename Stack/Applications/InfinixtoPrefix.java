
public class InfinixtoPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inf="A+B*C/(E-F)";
		convert(inf);
	}

	public static void convert(String inf) {
		// TODO Auto-generated method stub
		int top=-1;
		int max=inf.length();
		char stk[]=new char[max];
		String res="";
		for(int i=max-1;i>=0;i--) {
			char c=inf.charAt(i);
			if(Character.isLetterOrDigit(c))
				res+=c;
			else if(c==')')
				stk[++top]=c;
			else if(c=='(') {
				while(top!=-1 && stk[top]!=')')
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
		char[] result=res.toCharArray();
		for(int i=result.length-1;i>=0;i--)
			System.out.print(result[i]);
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
