import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

class Redone{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private final static long mod=(long)(1e9+7);
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		long arr[]=new long[(int)(1e6)+1];
		arr[1]=1;
		for(int i=2;i<=1000000;i++){
			arr[i]=(arr[i-1]+i+(long)(arr[i-1]*i))%mod;

		}
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			/*int i=1;
			long last=n;
			while(i!=n){
				long temp=i+last+last*i;
				last=temp%1000000007;
				i++;
			}*/
			System.out.println(arr[n]);
		}
	}
}
