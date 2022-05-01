import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Notime{
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
		int[] arr=readInput(3);
		int n=arr[0],h=arr[1],x=arr[2];
		int[] meta=readInput(n);
		int max=-1;
		for(int i=0;i<meta.length;i++){
			max=Math.max(max,meta[i]);
		}
		int sum=max+x;
		if(sum>=h){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}

