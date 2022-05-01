import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Irstxor{
	
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	
	public static int getMsb(int c){
		int n=2;
		while(n<c){
			n=n*2;
		}
		return n;
	}

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int c=Integer.parseInt(bread.readLine());
			long ans=0l;
			StringBuilder a=new StringBuilder();
			StringBuilder b=new StringBuilder();
			String s=Integer.toBinaryString(c);
			System.out.println(s);
			boolean flag=false;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='0'){
					a=a.append('1');
					b=b.append('1');
				}
				else{
					if(flag){
						a=a.append('0');
						b=b.append('1');	
					}
					else{
						a=a.append('1');
						b=b.append('0');
						flag=true;
					}
				}
			}
			long x=Long.parseLong(a.toString(),2);
			long y=Long.parseLong(b.toString(),2);
			System.out.println(a+" "+b);
			ans=x*y;
			System.out.println(ans);


		}
	}

}

