import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Replesx{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static ArrayList<Integer> readInput() throws IOException{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		StringTokenizer st=new StringTokenizer(bread.readLine());
		int i=0;
		while(st.hasMoreTokens()){
			arr.add(Integer.parseInt(st.nextToken()));
		}
		return arr;

	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] s=bread.readLine().split(" ");
			int n=Integer.parseInt(s[0]), x=Integer.parseInt(s[1]), p=Integer.parseInt(s[2]),k=Integer.parseInt(s[3]);
			ArrayList<Integer> arr=readInput();
			int count=0;
			Collections.sort(arr);
			if(!arr.contains(x)){
				arr.remove(k-1);
				arr.add(k-1,x);
				Collections.sort(arr);
				count++;

			}
			int x_index=arr.lastIndexOf(x);
			if(arr.get(p-1)==x){
				x_index=p-1;
			}
			else {
				x_index=x_index+1>p?arr.indexOf(x):arr.lastIndexOf(x);
			}
			x_index++;
			if(x_index<=p && x_index<=k && p<=k || x_index>=k && x_index>=p && p>=k){
				System.out.println(Math.abs(p-x_index)+count);
			}
			else{
				System.out.println("-1");
			}
		}
	}
}
