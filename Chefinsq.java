import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;
class Chefinsq{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
        private static Integer[] readInput(int n) throws IOException{
		Integer[] arr=new Integer[n];
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
			String[] arg=bread.readLine().split(" ");
			int n=Integer.parseInt(arg[0]);
			int k=Integer.parseInt(arg[1]);
			Integer[] arr=readInput(n);
			Arrays.sort(arr,Collections.reverseOrder());
			int sum=0;
			boolean flag=true;
			int min=-1,count=0;
			for(int i=0;i<n;i++){
				sum=0;
				if(i+k<=n){
				for(int j=i;j<k+i;j++){
					sum=sum+arr[j];
				}
				if(flag){
					min=sum;
					flag=false;
				}
				if(min==sum){
					count++;
			

				}				
			
				}
			}
			System.out.println(count);
		}

	}



}
