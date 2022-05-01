import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Trickydl{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			long cp=0;
			long sp=0;
			long profit=0;
			int i=1,index=0;;
			long max=Long.MIN_VALUE;
			while(profit>=0){
				cp+=n;
				sp+=Math.pow(2,i-1);
				profit=cp-sp;
				if(profit>max){
					max=profit;
					index=i;
				}
				if(profit>=0)
				i++;
			}
			System.out.println(i-1+" "+index);
// 1 2 4 8 16 32
// 5 10 15 20 25
// 1 3  7  15 31 63
// 8 16 24 32 40 48
// 9 18 27 36 45 54

		}


	}

}
