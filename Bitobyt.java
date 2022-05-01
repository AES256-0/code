import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bitobyt{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int d=n/26;
			int r=n%26;
			double bit=0;
			double nibble=0;
			double byt=0;
			if(r==0){
				
				byt=Math.pow(2,d-1);
			}
			else{
			if(0<r && r<=2){
				bit=Math.pow(2,d);
			}
			else if(2<r && r<=10){
				nibble=Math.pow(2,d);
			}
			else if(10<r && r<=26){

				byt=Math.pow(2,d);
			}
			}
			System.out.println((long)bit+" "+(long)nibble+" "+(long)byt);
		

		}
	}
}
