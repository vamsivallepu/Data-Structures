public class PostfixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="231*+9-";
		evaluate(test);

	}

	public static void evaluate(String test) {
		// TODO Auto-generated method stub
		int top=-1;
		double[] stk=new double[test.length()];
		for(int i=0;i<test.length();i++) {
			char c=test.charAt(i);
			if(Character.isDigit(c)) {
				stk[++top]=c-'0';	
			}
			else {
				double a=stk[top--];
				//System.out.println(a);
				double b=stk[top--];
				//System.out.println(b);
				if(c=='+')
					stk[++top]=a+b;
				else if(c=='-')
					stk[++top]=(b-a);
				else if(c=='*')
					stk[++top]=(a*b);
				else
					stk[++top]=(b/a);
			}
		}
		System.out.println(stk[top]);
	}

}
