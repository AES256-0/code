import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Attendu{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	final static int workdays=120;
	final static double pass=(double)workdays*3/4;
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			int diff=120-s.length();
			int count=0;
			for(int i=0;i<n;i++){
				if(s.charAt(i)=='1'){
					count++;
				}
			}
			//System.out.println("count is"+pass);
			if(pass<=count+diff){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}


		}

	}


}
