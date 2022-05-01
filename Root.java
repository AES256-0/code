import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Gcd{
		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

/*	private static	int[] readInput(int len) throws IOException{
		int[][] arr=new int[len][len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		
		}
		return arr;
	}*/
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){

			int n=Integer.parseInt(bread.readLine());
			int[][] arr=new int[n][n];
			int[] count=new int[n];
			int max=-1,index=-1;
			for(int j=0;j<n-1;j++){
				String[] s=bread.readLine().split(" ");
				int first=Integer.parseInt(s[0]),second=Integer.parseInt(s[1]);
				count[first-1]++;
				arr[first-1][second-1]=1;
				if(max<count[first-1]){
					max=count[first-1];
					index=first-1;

				}


			}
			System.out.println(max+" "+index);








		}





	}
}
