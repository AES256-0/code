import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Swap10hg{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int l=Integer.parseInt(bread.readLine());
			String a=bread.readLine();
			String b=bread.readLine();
			if(count(a)!=count(b)){
				System.out.println("No");
			}
			else{
				int count_a=0;
				int count_b=0;
				boolean flag=false;
				for(int i=0;i<l;i++){
					if(a.charAt(i)=='1')
						count_a++;
					if(b.charAt(i)=='0')
						count_b++;
					if(count_a<count_b){
						flag=true;
						break;
					}

				}
				if(flag){
					System.out.println("No");
				}
				else{
					System.out.println("Yes");
				}
			}	
		}
	}
	private static int count(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1'){
				count++;
			}	
		}
		return count;
	}
	

}
