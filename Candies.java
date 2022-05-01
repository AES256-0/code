import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Candies{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int i=0;
		int[] arr=new int[n];
		while(i<n){
			arr[i++]=Integer.parseInt(bread.readLine());
		}
		System.out.println(candies(n,arr));
	}
	private static long candies(int n,int[] arr){
		long last=-1l;
		if(arr[0]>arr[1]){
			last=2;
		}
		else{
			last=1;
		}
		long sum=last;
		for(int i=1;i<n-1;i++){
			if(arr[i]>arr[i-1]){
				last++;
			}
			else if(arr[i]==arr[i-1]){
				if(arr[i]<arr[i+1]){
					last=1;
				}
				else if(arr[]){
					
				}

			

			}
			else{
				if(arr[i]<=arr[i+1]){
					last=1;
				}
				else if(arr[i]>arr[i+1]){
					last=2;
				}
				else{

				}
			}
			System.out.println("arr:"+arr[i]+" last:"+last);
			sum=sum+last;

		
		}
		if(arr[n-1]>arr[n-2]){
			last++;
		}
		else if(arr[n-1]<=arr[n-2]){
			last=1;
			
		}
		return sum+last;
	}

}
