import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Tree{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static TreeSet<Integer> readInput() throws IOException{
		TreeSet<Integer> set=new TreeSet<Integer>();
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			set.add(Integer.parseInt(s.nextToken()));

		}
		return set;

	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			TreeSet<Integer> set=readInput();
			int last=-1,count=0;
			set.remove(0);
			System.out.println(set.size());
			
		}

	}




}
