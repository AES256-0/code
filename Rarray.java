import java.io.*;
import java.util.*;
class Rarray{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens())
		{
			arr[i++]=Integer.parseInt(st.nextToken());
	
		}	
		return arr;
	}
	private static boolean check(int[] arr,int l,int r){
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=l-1;i<=r-1;i++){
			if(l<=arr[i] && arr[i]<=r){

				list.add(arr[i]);
			}
		}
		if(list.size()==0)
			return true;
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i)>list.get(i+1))
				return false;
		}
		return true;

	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			long ans=0;
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					if(check(arr,i+1,j+1)){
						ans++;
					}
				}
			}
			System.out.println(ans);

		}



	}

}
