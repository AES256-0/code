import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Gcd{
		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static	int[] readInput(int len) throws IOException{
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
			for(int j=0;j<t;j++){

				int n=Integer.parseInt(bread.readLine());
				int[] arr=readInput(n);
				boolean flag=false;
				for(int i=1;i<=n;i++){
					if(i%arr[i-1]!=0){
						flag=true;
						break;
					}


				}
				if(flag){
					System.out.println("NO");


				}
				else{
					System.out.println("YES");

				}





			}
		


	}


}
