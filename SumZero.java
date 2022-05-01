import java.io.*;
import java.util.*;
class SumZero{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{

		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;

	}

	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		int[] prefix=new int[n];
		prefix[0]=arr[0];
		for(int i=1;i<n;i++){
			prefix[i]=prefix[i-1]+arr[i];
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		int max=-1;
		for(int i=0;i<n;i++){
			if(map.containsKey(prefix[i])){
				max=Math.max(max,i-map.get(prefix[i]));
			}
			else{
				map.put(prefix[i],i);
			}
		}
		System.out.println(Arrays.toString(prefix));
		System.out.println(max);

	}

}
