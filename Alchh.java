import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
class Alchh{

		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String s=bread.readLine();
		boolean flag=false;
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A' || s.charAt(i)=='I' || s.charAt(i)=='E' || s.charAt(i)=='O' ||s.charAt(i)=='U'){
				String n="";	
				if(i+3<s.length()){
				 n=s.substring(i,i+3);
					}
					else
					{

					 n=s.substring(i,s.length());

					}
					int count=0;
					for(int j=0;j<n.length();j++){


						if(n.charAt(j)=='A' || n.charAt(j)=='I' || n.charAt(j)=='E' || n.charAt(j)=='O' ||n.charAt(j)=='U'){
							count++;
						}

					}
					if(count==3){

						flag=true;

					}
			



			}
			else{
				set.add(s.charAt(i));

			}
		










		}
		if(flag && set.size()>=5){

			System.out.println("GOOD");
			

		}
		else{
			System.out.println("-1");

		}




	}
	

}
