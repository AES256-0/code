import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Posprefs{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int infected=0;
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;

		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>=80 || arr[i]<=9){
				infected++;
			}

		}
		return arr;



	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] meta=bread.readLine().split(" ");
			int n=Integer.parseInt(meta[0]);
			int k=Integer.parseInt(meta[1]);
			
			if(n==k){
				for(int i=1;i<=k;i++){
					System.out.print(i+" ");
				}
			}
			else{
				
				int diff=n-k;
				int nc=0;
				if(k==n/2){
				for(int i=1;i<=n;i++){
					if(i%2==0){
						System.out.print(i+" ");
					}
					else{
						System.out.print(-1*i+" ");
					}
				}
				}
				else if(k>n/2){
					for(int i=1;i<=n;i++){
						if(i<=2*diff){		
					if(i%2==0){
						System.out.print(i+" ");
					}
					else{
						System.out.print(-1*i+" ");
					}
						}
						else{
							System.out.print(i+" ");
						}
					}
				}
				else{
				
					for(int i=1;i<=n;i++){
						if(i<=2*k){
							
							if(i%2==0){
								System.out.print(i+" ");
							}
							else{
							System.out.print(-1*i+" ");
							}
						}
						else{

							System.out.print(-1*i+" ");
						}
						

					}
					
				}

			}
		System.out.println();	
	}

}
}
