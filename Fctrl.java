import java.util.*;
import java.io.*;
class Fctrl{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			long sum=0;
			int m=5;
			int div=0;
			while(true){
				div=n/m;
				if(div<1){
					break;
				}
				sum+=div;
				m*=5;
			}
			System.out.println(sum);

		}


	}

}
