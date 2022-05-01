import java.util.*;
import java.io.*;
class Xorored{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());

		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			boolean[] b=new boolean[32];
			for(int i=0;i<32;i++){
				int count=0;
				for(int j=0;j<n;j++){
					if((arr[j]&1<<i)!=0){
						count++;
					}
				}
				if(count==n)
					b[i]=true;
			}
			long num=0;
			for(int i=31;i>=0;i--)
			{
				if(b[i]){
					num+=1<<i;	
				}

			}
			if(num==0)
				num=0;
			long xor=0;
			for(int i=0;i<n;i++){
				xor=xor | (arr[i]^num);
			}
			System.out.println(num+" "+xor);

		}


	}

}
