import java.util.*;
import java.io.*;
class Chnum{
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
			int neg=0,pos=0;
			for(int i:arr){
				if(i<0)
				{
					neg++;
				}
				else{
					pos++;
				}
			}
			if(neg==0 || pos==0){
				System.out.println(n+" "+n);
			}
			else{
				if(neg<pos){
					System.out.println(pos+" "+neg);
				}
				else{

					System.out.println(neg+" "+pos);
				}
			}

		}


	}


}
