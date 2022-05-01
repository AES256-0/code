import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Sedarr{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int readInput(int n) throws IOException{
		int sum=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			sum+=Integer.parseInt(st.nextToken());
		}
		return sum;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] temp=bread.readLine().split(" ");
			int n=Integer.parseInt(temp[0]);
			int k=Integer.parseInt(temp[1]);
			int sum=readInput(n);
			if(sum%k==0){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
		}


	}


}
