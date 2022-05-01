import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Evenpsum{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] meta=bread.readLine().split(" ");
			long a=Long.parseLong(meta[0]);
			long b=Long.parseLong(meta[1]);
			long pair=0l;
			long f_even=0l,f_odd=0l,s_even=0l,s_odd=0l;
			if(a%2!=0){
				f_even=a/2;
				f_odd=a/2+1;
			}
			else{
				f_even=a/2;
				f_odd=a/2;
			}
			if(b%2!=0){
				s_even=b/2;
				s_odd=b/2+1;
			}
			else{
				s_even=b/2;
				s_odd=b/2;
			}

			pair=f_even*s_even+f_odd*s_odd;
			System.out.println(pair);



		}
	}

}
