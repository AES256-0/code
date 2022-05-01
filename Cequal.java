import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;
class Cequal{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static HashSet<Integer> readInput() throws IOException{
		HashSet<Integer> set=new HashSet<Integer>();
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			set.add(Integer.parseInt(st.nextToken()));

		}
		return set;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			HashSet<Integer> set=readInput();
			if(n!=set.size()){
				System.out.println("YES");

			}
			else{
				System.out.println("NO");

			}


		}
	}
}
