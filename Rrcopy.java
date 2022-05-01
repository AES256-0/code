import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

class Rrcopy{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(bread.readLine());
		int i=0;
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
			HashSet<Integer> set=new HashSet<>();
			for(Integer x:arr){
				set.add(x);
			}
			System.out.println(set.size());



		}
	}



}
