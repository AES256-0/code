import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
class Anubtg{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[]  readInput(int n) throws IOException{
		int[] arr=new int[n];
		StringTokenizer ob=new StringTokenizer(bread.readLine());
		int i=0;
		while(ob.hasMoreTokens()){
			arr[i++]=Integer.parseInt(ob.nextToken());			
		}
		return arr;
	}


	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			Arrays.sort(arr);
			int count=0;
			int sum=0;
			boolean flag=true;
			for(int i=n-1;i>=0;i--){
				if(count<2&&flag){
				sum=arr[i]+sum;
				count++;
				}
				else{
				 	count--;
					flag=false;
					if(count==0){
						flag=true;
					}
				}
				

			}
			System.out.println(sum);

		}

	}
}

