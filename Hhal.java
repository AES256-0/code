import java.util.*;
import java.io.*;
class Hhal{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			
			String s=bread.readLine();
			boolean pal=true;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)!=s.charAt(s.length()-i-1)){
					pal=false;
					break;

				}
			}
			if(pal){
				System.out.println("1");
			}
			else{
				System.out.println("2");
			}
			
		}



	}

}
