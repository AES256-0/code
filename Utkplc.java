import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Utkplc{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] app=bread.readLine().split(" ");
			String[] off=bread.readLine().split(" ");
			for(int i=0;i<app.length;i++){
				if(app[i].equals(off[0]) || app[i].equals(off[1])){
					System.out.println(app[i]);
					break;
				}		
			}
		}
	}
}
