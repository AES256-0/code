import java.io.*;
import java.util.*;
class Probdiff{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] arr=bread.readLine().split(" ");
			HashSet<Integer> set=new HashSet<>();
			for(String s: arr){
				set.add(Integer.parseInt(s));
			}
			if(set.size()==1){
				System.out.println("0");
			}
			else if(set.size()==2){
				System.out.println("");
			}
		}	

	}
}
