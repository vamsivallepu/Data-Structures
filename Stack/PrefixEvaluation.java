
public class PrefixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="-+8/632";
		evaluate(test);
	}

	public static void evaluate(String test) {
		// TODO Auto-generated method stub
		int top=-1;
		int max=test.length();
		double[] stk=new double[max];
		for(int i=max-1;i>=0;i--) {
			char c=test.charAt(i);
			if(Character.isDigit(c))
				stk[++top]=c-'0';
			else {
				double a=stk[top--];
				double b=stk[top--];
				if(c=='+')
					stk[++top]=a+b;
				else if(c=='-')
					stk[++top]=(a-b);
				else if(c=='*')
					stk[++top]=(a*b);
				else
					stk[++top]=(a/b);
			}
		}
		System.out.println(stk[top]);
	}

}
