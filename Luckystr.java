import java.util.*;
import java.io.*;
class Luckystr{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] in=bread.readLine().split(" ");
		int k=Integer.parseInt(in[0]);
		int n=Integer.parseInt(in[1]);
		String[] d=new String[k];
		int i=0;
		while(i<k){
			d[i++]=bread.readLine();
		}
		while(n-->0){

			String inp=bread.readLine();
			boolean flag=false;
			for(String s:d ){
				if(inp.contains(s)){

					flag=true;
					break;
				}
		
			}
			if(flag || inp.length()>=47){

				System.out.println("Good");
			}
			else{
				System.out.println("Bad");

			}


		}



	}



}
