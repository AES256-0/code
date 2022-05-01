import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Cpairs{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static long count;
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
		count=0;
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		countEurons(arr,0,n-1);
		System.out.println(count);
		}
	}
	private static void countEurons(int[] arr,int p,int q){
		if(p<q){
			int r=p+(q-p)/2;
			countEurons(arr,p,r);
			countEurons(arr,r+1,q);
			combine(arr,p,r,q);
		}
	
	}
	private static void combine(int arr[],int p,int r,int q){
		int n1=r-p+1;
		int n2=q-r;
		int[] left=new int[n1];
		int[] right=new int[n2];
		for(int i=0;i<n1;i++){
			left[i]=arr[p+i];
		}
		for(int j=0;j<n2;j++){
			right[j]=arr[r+j+1];
		}
	
		int k=p;
		int i=0;
		int j=0;
		int even=0;
		int odd=0;
		while(i<n1){
			if(left[i]%2==0){
				even++;

			}
			i++;

		}
		while(j<n2){
			if(right[j]%2!=0){
				odd++;
			}
			j++;
		}
		count=count+even*odd;
	/*	while(i<n1 && j<n2){
			
			if(left[i]%2==0 &&right[j]%2!=0){
				count++;
			}
			if(left[i]<=right[j]){
				arr[k]=left[i++];

			}
			else if(left[i]>right[j]){
				arr[k]=right[j++];
			}
			k++;


		}
	
		while(i<n1){
			arr[k++]=left[i++];
		}
		while(j<n2){
			arr[k++]=right[j++];
  		}*/
	}
}
