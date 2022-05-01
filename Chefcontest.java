import java.io.*;
class Chefcontest{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int x=Integer.parseInt(inp[0]);
			int y=Integer.parseInt(inp[1]);
			int p=Integer.parseInt(inp[2]);
			int q=Integer.parseInt(inp[3]);
			int chef=x+p*10;
			int chefena=y+q*10;
			if(chef<chefena){
				System.out.println("Chef");
			}
			else if(chef>chefena){
				System.out.println("Chefina");
			}
			else{
				System.out.println("Draw");
			}


		}



	}

}
