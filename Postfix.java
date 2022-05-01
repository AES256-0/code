import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Postfix{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder op,ans;
	private static int top=-1;
	public static int precedence(char c){

		switch(c){
			case '+':
				return 0;
		        case '-':
				return 0;
			case '*':
				return 1;
			case '/':
				return 1;
			case '^':
				return 2;
			default:
				return -1;
		}

	}
	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		for(int j=0;j<t;j++){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			ans=new StringBuilder("");
			op=new StringBuilder("");
			top=-1;
			for(int i=0;i<s.length();i++){
				if(65<=s.charAt(i) && s.charAt(i)<=90){
					ans.append(s.charAt(i));

				}
				else{
					if(top==-1){
						op.append(s.charAt(i));
						top++;
					}
					else{
						calculation(s.charAt(i));
					}
				}
			}
			if(op.length()!=0){
				ans.append(op.reverse());

			}
			System.out.println(ans);		
		}
	}
	public static void calculation(char c){
		if(  c=='(' || op.charAt(top)=='('){
			op.append(c);
			top=top+1;
		}
		else if(c==')'){
			int ind=op.lastIndexOf("(");
			ans.append(new StringBuilder(op.substring(ind+1,op.length())).reverse());
			op.delete(ind,op.length());
			top=ind-1;

		}
		else if(precedence(c)<=precedence(op.charAt(top))){
				int l=op.length()-1;
				while(precedence(op.charAt(l))>=precedence(c)){

					ans.append(op.charAt(l--));
					top=l;
					if(l<0){
						break;
					}
				}
				op.delete(top+1,op.length());
				op.append(c);
				++top;

		}
		else if(precedence(c)>precedence(op.charAt(top))){
			op.append(c);
			top=top+1;

		}
		else{}
		}

}
