import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Vaccine2{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int infected=0;
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;

		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>=80 || arr[i]<=9){
				infected++;
			}

		}
		return arr;



	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] meta=bread.readLine().split(" ");
			int n=Integer.parseInt(meta[0]);
			int d=Integer.parseInt(meta[1]);
			infected=0;
			int[] arr=readInput(n);
			int total=infected/d;
			if(infected%d!=0){
				total++;
			}
			int left=n-infected;
			int div=left/d;
			int rem=left%d;
			total+=div;
			if(rem!=0){
				total++;
			}
			System.out.println(total);
			
			


		}
	}

}

