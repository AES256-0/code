import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Kol16b{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		int c=1;
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=new int[n];
			int i=0;
			while(i<n){
				arr[i++]=Integer.parseInt(bread.readLine());
			}
			int A[]=new int[n];
			int B[]=new int[n];
			for(int j=0;j<n;j++){
				B[j]=arr[j]>>16;
				A[j]=arr[j]-(B[j]<<16);
				
			}
		        System.out.println("Case "+c+":");
			printFunc(A);
			printFunc(B);
			c++;
		}
	}
	private static void printFunc(int[] arr){
	//	System.out.println("Case "+n+":");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");

		}
		System.out.println();


	}

}
