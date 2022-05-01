
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Kprime{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	
	
	private static int[] arr=new int[100001];

	static{

		sieve(100000);
	}
	public static void sieve(int n){
		boolean prime[]=new boolean[n+1];
		for(int i=1;i<=n;i++)
			prime[i]=true;
		prime[1]=false;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(prime[i]){
				int j=2,index=i*2;
				arr[i]+=1;
				while(index<=n){
					prime[index]=false;
					arr[index]+=1;
					index=i*++j;
				}
			}
		}
	}
	/*public static void calculatePrime(){
		for(int i=2;i<=arr.length/2;i++){
			if(arr[i]==0){
				
				long t=i;
				while(t<=100000){
					System.out.println("t is:"+t);
					arr[(int)t]+=1;
					t=t*i;
				}

			}

		}
	}*/
	
	
	
	
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] data=bread.readLine().split(" ");
			int a=Integer.parseInt(data[0]);
			int b=Integer.parseInt(data[1]);
			int k=Integer.parseInt(data[2]);
			int count=0;
			for(int i=a;i<=b;i++){
				if(arr[i]==k)
					count++;
				//System.out.println(arr[i]);
			}
			System.out.println(count);

		}


	}


}
