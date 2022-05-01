import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Crsblk{	
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			int count=0;
			int c_max=arr[n-1];
			for(int i=n-2;i>=1;i--){
				if(c_max<arr[i]){
					c_max=arr[i];
					count++;
				}

			}
			if(c_max>arr[0]){
				System.out.println("-1");
			}
			else{
				System.out.println(count+1);
			}
		}

	}
}
