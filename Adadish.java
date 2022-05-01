import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Adadish{
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
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
				int n=Integer.parseInt(bread.readLine());
				
				int[] arr=readInput(n);
				Arrays.sort(arr);
				int first=0;
				int second=0;
				int total_time=0;
				if(n==1){
					System.out.println(arr[0]);
				}
				else if(n==2){
						System.out.println(arr[1]);								}
				else if(n==3){
					//Arrays.sort(arr);
					first=arr[1]+arr[0];
					second=arr[2];
					total_time=0;
					if(first>second){
						total_time=first;
					}
					else{
						total_time=second;
					}
					System.out.println(total_time);
					

				}
				else{
					first=arr[2]+arr[1];
					second=arr[3];
					if(first<=second){
						first=first+arr[0];
		
					}
					else{
						second=second+arr[0];
					}
					if(first>second){
						total_time=first;
					}
					else{

						total_time=second;
					}
					
					
					System.out.println(total_time);

				}


		}


	}







}
