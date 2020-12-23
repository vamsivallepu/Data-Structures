
public class PrefixtoPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="*-A/BC-/AKL";
		convert(exp);
	}

	public static void convert(String exp) {
		// TODO Auto-generated method stub
		int top=-1;
		int max=exp.length();
		String[] stk=new String[max];
		for(int i=max-1;i>=0;i--) {
			char ch=exp.charAt(i);
			if(Character.isLetterOrDigit(ch))
				stk[++top]=ch+"";
			else {
				String a=stk[top--];
				String b=stk[top--];
				stk[++top]=a+b+ch;
			}
		}
		System.out.println(stk[top]);
	}

}
