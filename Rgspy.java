import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
class Rgspy{

		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		String s=bread.readLine();
		String[] arr=s.split("-");
		String finalstr="";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>=48 && s.charAt(i)<=57){
				sb.append(s.charAt(i));


			}
			else if(s.charAt(i)=='+'){
				int j=s.substring(i).indexOf("-");
				
				String n=s.substring(i+1,i+j);
				finalstr=finalstr+new String(new char[Integer.parseInt(sb.toString())]).replace("\0", n);
				sb=new StringBuilder();
				i=i+j;

			}
			else if(s.charAt(i)!='-'){
				finalstr=finalstr+s.charAt(i);

			}




		}
		if(finalstr.equals(new String(new StringBuilder(finalstr).reverse()))){

			System.out.println("Return");

		}
		else{
			System.out.println("Continue");

		}







	}



}
