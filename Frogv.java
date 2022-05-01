import java.io.*;
import java.util.*;
class Frogv{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int[] readInput(int n) throws IOException{

		int arr[]=new int[n+1];
		int i=1;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());

		}
		return arr;

	}

	public static void main(String[] args) throws IOException{
		String[] inp=bread.readLine().split(" ");
		int n=Integer.parseInt(inp[0]);
		int k=Integer.parseInt(inp[1]);
		int p=Integer.parseInt(inp[2]);
		int[] arr=readInput(n);
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=n;i++){
			list.add(arr[i]);
		}
		Collections.sort(list,Collections.reverseOrder());
		int[] max=new int[n];
		max[0]=list.get(0)+k;
		for(int i=1;i<n;i++){
			max[i]=list.get(i-1)-list.get(i)<=k?max[i-1]:list.get(i)+k;
		}

		while(p-->0){
			String[] in=bread.readLine().split(" ");
			int a=Integer.parseInt(in[0]);
			int b=Integer.parseInt(in[1]);
			int x=Collections.binarySearch(list,arr[a],Collections.reverseOrder());
			int y=Collections.binarySearch(list,arr[b],Collections.reverseOrder());
			if(max[x]==max[y]){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}

		}


	}

}
