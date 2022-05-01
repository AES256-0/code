import java.util.*;
import java.io.*;
class Rowcolop{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] in=bread.readLine().split(" ");
		int n=Integer.parseInt(in[0]);
		int q=Integer.parseInt(in[1]);
	//	long[][] arr=new long[n+1][n+1];
		long[] row=new long[n+1];
		long[] col=new long[n+1];
		while(q-->0){
			String[] query=bread.readLine().split(" ");
			String qtype=query[0];
			int a=Integer.parseInt(query[1]);
			int b=Integer.parseInt(query[2]);
			if(qtype.equals("RowAdd")){
				row[a]+=b;
			}
			else{
				col[a]+=b;
			}
			
		}
		long rowm=-1;
		long colm=-1;
		for(int i=1;i<=n;i++){
			rowm=Math.max(rowm,row[i]);
			colm=Math.max(colm,col[i]);
		}		
	
		System.out.println(rowm+colm);
	}



}
