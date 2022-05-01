import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

class Lebombs{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			Set<Integer> set=new HashSet<>();
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1'){
					if(i==0){
						set.add(i);
						if(i+1<s.length())
						set.add(i+1);
					
					}
					else if(i==s.length()-1){
						set.add(i);
						set.add(i-1);
					}
					else{
						set.add(i);
						set.add(i-1);
						set.add(i+1);
						
					}
				}

			}
			System.out.println(s.length()-set.size());

		}
	}


}
