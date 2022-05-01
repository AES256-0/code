import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class Town{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static Integer[] readInput(int n) throws IOException{
		Integer arr[]=new Integer[n];
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
			Integer[] arr=readInput(n);
			Arrays.sort(arr,Collections.reverseOrder());
			long p1=0l,p2=0l,tc=0l;
			long odd=0l,even=0l;
			if(n==1){
				System.out.println("first");

			}
			else{
			for(int i=0;i<n;i++){
				if(i%2==0){
					even=even+arr[i];
				}
				else{
						odd=odd+arr[i];
				}
			}

		//	p1=odd-arr[1]+arr[0];
		//	p2=arr[1]+even-arr[0];
		//	System.out.println(odd+" "+even);
			if(odd>even){
				System.out.println("second");
			}
			else if(even>=odd){
				if(n>2){
				p1=odd-arr[1]+arr[0];
				p2=arr[1]+even-arr[0];
				}
				else{

					p1=arr[0];
					p2=arr[1];

				}
		//		System.out.println(p1+" "+p2);
				if(p1>p2){
					System.out.println("first");	

				}
				else if(p1<p2){
					System.out.println("second");
				}
				else if(p1==p2){
					System.out.println("draw");
		
				}

			}
			
			}


			

			


			

		}
	}
}
