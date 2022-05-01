import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Csub{
	private static long count=0l;
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			char[] ch=s.toCharArray();
			count=0;
		//	divideArray(ch,0,s.length()-1);
			long c=0;
			
			for(int i=0;i<s.length();i++){
				if(ch[i]=='1'){
					c++;
				}
			}
			count=c*(c+1)/2;
			System.out.println(count);
		}

	}
	private static void divideArray(char[] ch,int s,int l){
		if(s<l){
			int m=s+(l-s)/2;
			divideArray(ch,s,m);
			divideArray(ch,m+1,l);
			compare(ch,s,m,l);
		}
	}
	private static void compare(char[] ch,int s,int m,int l){
		int n1=m-s+1;
		int n2=l-m;
		char[] left=new char[n1];
		char[] right=new char[n2];
		int lc=0;
		int rc=0;
		for(int i=0;i<n1;i++){
			left[i]=ch[s+i];
			if(left[i]=='1'){
				lc++;
			}
		}
		for(int i=0;i<n2;i++){
			right[i]=ch[m+1+i];
			if(right[i]=='1'){
				rc++;
			}
		}
		count=count+lc*rc;
	}
}
