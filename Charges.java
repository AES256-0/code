import java.io.*;
import java.util.*;
class Charges{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens())
		{
			arr[i++]=Integer.parseInt(st.nextToken());
	
		}	
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			String s=bread.readLine();
			int[] arr=readInput(k);
			char[] ch=s.toCharArray();
			int ans=0;
			for(int i=0;i<ch.length-1;i++){
				if(ch[i]==ch[i+1]){
					ans+=2;	
				}
				else{
					ans+=1;
				}
			}
			
			for(int i:arr){
			if(n==1){
			}
			else if(i==1){
					int minus=ch[i-1]==ch[i]?2:1;
					ans-=minus;
					ch[i-1]=ch[i-1]=='0'?'1':'0';
					ans+=ch[i-1]==ch[i]?2:1;					
				}
				else if(i==n){
					int min=ch[i-1]==ch[i-2]?2:1;
					ans-=min;
					ch[i-1]=ch[i-1]=='0'?'1':'0';
					ans+=ch[i-2]==ch[i-1]?2:1;
				}
				else{
					int m1=ch[i-1]==ch[i-2]?2:1;
					ans-=m1;
					m1=ch[i-1]==ch[i]?2:1;
					ans-=m1;
					ch[i-1]=ch[i-1]=='0'?'1':'0';
					ans+=ch[i-2]==ch[i-1]?2:1;
					ans+=ch[i-1]==ch[i]?2:1;

				}
				System.out.println(ans);
			}
		}

	}
}
