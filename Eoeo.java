import java.io.*;
import java.util.*;
class Eoeo{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			long ts=Long.parseLong(bread.readLine());
			int shift=0;
			for(int i=0;i<64;i++){
				if((ts & 1<<i) !=0){
					break;
				}
				shift++;
			}
			
			System.out.println((ts>>shift)/2);
		


		}


	}


}
