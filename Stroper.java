import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class  Stroper{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String str=bread.readLine();
			HashSet<String> set=new HashSet<String>();
			for (int i = 0; i < str.length(); i++) {
				int cnt=0,even=0,odd=0;
   				for (int j = i; j < str.length(); j++) {
        				 if(str.charAt(j)=='1')
						 cnt++;
					 else{
						if(cnt%2!=0){
							odd++;
						}
						else{
							even++;
						}
		
					 }
					 int len=j-i+1;
					 set.add(len+" "+even+" "+odd);

   				}	
 			 }
			System.out.println(set.size());
		
	
		}


	}


}
