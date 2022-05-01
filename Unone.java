import java.io.*;
import java.util.*;
class Unone{
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
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			ArrayList<String> even=new ArrayList<>();
			ArrayList<String> odd=new ArrayList<>();
			for(int i:arr){
				if(i%2==0){
					even.add(String.valueOf(i));
				}
				else{
					odd.add(String.valueOf(i));
				}
			}
			String e=String.join(" ",even);
			String o=String.join(" ",odd);
			System.out.println(e+" "+o);


		}



	}
}
