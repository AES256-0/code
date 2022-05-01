import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;


class Stocks{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int arr[]=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int t=n;
		int[][] arr=new int[n][2];
		int max_beta=-1;
		
			for(int i=0;i<n;i++){
				String[] ar=bread.readLine().split(" ");
				arr[i][0]=Integer.parseInt(ar[0]);
				if(max_beta<arr[i][0]){
					max_beta=arr[i][0];
				}
				arr[i][1]=Integer.parseInt(ar[1]);
			}
	
		t=n;
		ArrayList<String[]> list=new ArrayList<String[]>();
		while(t-->0){
			String[] l=bread.readLine().split(" ");
			list.add(l);
		}
	//	System.out.println("m here:"+max_beta);
		int left=0;
		int beta=0;
		int j=0;
		int max_left=-1;
		int right=0;
		int S=-1;
		while(j<max_beta){
		for(int i=0;i<n;i++){
			left=left+j*arr[i][1];
			for(int j=i;j<n;j++){
				right=right+j*j*Integer.parseInt(list.get(i)[j]);

			}
			int diff=left-right;
			if(S<diff){
				S=diff;
			}	

		}
		if(max_left<left){
			max_left=left;
		}
	//	System.out.println("hhhhhhhhh");
		left=0;

		j++;
		}
		System.out.println(max_left);




	}
}
