import java.io.*;
import java.util.*;
class Cleanup{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine().trim());
		while(t-->0){
			try{
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int m=Integer.parseInt(in[1]);
			boolean[] jobs=new boolean[n+1];
			if(n==0){
				System.out.println("");
				System.out.println("");
			}
			else{
				if(m!=0){
				String[] done=bread.readLine().split(" ");
			
				for(String s: done){
					jobs[Integer.parseInt(s)]=true;
				}
			}
			String chef="";
			String ast="";
			boolean turn=true;
			for(int i=1;i<=n;i++){
				if(!jobs[i]){
					if(turn){
						chef+=String.valueOf(i)+" ";
						turn=false;
					}
					else{
						ast+=String.valueOf(i)+" ";
						turn=true;
					}	
				}
			}
			System.out.println(chef);
			System.out.println(ast);
			}
			}
			catch(Exception e){
				System.out.println(e);
			}


		}



	}



}
