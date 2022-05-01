import java.io.*;
import java.util.*;
class Resq{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int min=Integer.MAX_VALUE;
			//a*b=n so factorization problem
			for(int i=1;i<=Math.sqrt(n);i++){
				if(n%i==0){
					int j=n/i;
					min=Math.min(min,j-i);

				}

			}
			System.out.println(min);


		}


	}

}
