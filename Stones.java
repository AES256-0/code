import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

class Stones{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			HashSet<Character> set=new HashSet<Character>();
			String j=bread.readLine();
			String s=bread.readLine();
			int count=0;
			for(int i=0;i<s.length();i++){
				char ch=s.charAt(i);
				
				if(j.indexOf(s.charAt(i))!=-1){
					count++;
				}
				

			}

			System.out.println(count);
		}	

	}
}
