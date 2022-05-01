import java.util.*;
import java.io.*;
class Plzlykme{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			long l=Long.parseLong(in[0]);
			long d=Long.parseLong(in[1]);
			long s=Long.parseLong(in[2]);
			long c=Long.parseLong(in[3]);
			long ans=s;
			boolean flag=false;
			for(int i=0;i<d-1;i++){
				s=s+s*c;
				if(s>=l)
				{
					flag=true;
					break;
				}

			}
			if(flag || s>=l){
				System.out.println("ALIVE AND KICKING");
			}
			else{
				System.out.println("DEAD AND ROTTING");
			}

		}


	}

}
