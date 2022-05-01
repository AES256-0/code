import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Npairs{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			long ans=0;
			for(int i=0;i<n;i++){
				for(int j=i+1;j<=i+9;j++){
					if(j<n){
						ans+=Math.abs(Integer.parseInt(String.valueOf(s.charAt(i)))-Integer.parseInt(String.valueOf(s.charAt(j))))==j-i?1:0;
					}
				}
			}
			System.out.println(ans);


		}


	}
}
