import java.io.*;
class Equalcoin{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int x=Integer.parseInt(inp[0]);
			int y=Integer.parseInt(inp[1]);
			// x==0 then y %2==0
			// y==0 then x%2==0
			// x==0 and y==0 
			// x%2==0 
			if((x==0 && y==0) ||
			   (x==0 && y%2==0) || (y==0 && x%2==0) || (x%2==0 && x!=0)){
				System.out.println("YES");
		
			}
			else{
				System.out.println("NO");
			}		



		}


	}


}
