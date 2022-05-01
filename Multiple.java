import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Mulitple{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){
			String[] arr=bread.readLine().split(" ");
			long k=Long.parseLong(arr[0]);
			int d1=Integer.parseInt(arr[1]);
			int d2=Integer.parseInt(arr[2]);
			long sum=d1+d2;
			int digit=-1,count=0;
			for(long j=1;j<=k-2l;j++){
				digit=(int)(sum%10);
				count++;
				if(digit==6 || digit==0){
					sum=sum+digit;
					break;

				}
				sum=sum+digit;
			}
			if(digit==6){
				
				long len=k-count-2,d=len/4;
				int r=(int)(len%4),res[]={0,2,6,14};
				sum=sum+20*d+res[r];
			}
			System.out.println(sum%3==0?"YES":"NO");
	
		}

	}

}
