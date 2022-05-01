import java.io.*;
class Mxch{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int n=Integer.parseInt(inp[0]);
			int k=Integer.parseInt(inp[1]);
			StringBuilder st=new StringBuilder();
			for(int i=n-k;i<=n;i++){
				st.append(i+" ");
			}
			for(int i=1;i<n-k;i++){
				st.append(i+" ");
			}
			System.out.println(st);

		}


	}


}
