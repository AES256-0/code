import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Sscript{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] arr=bread.readLine().split(" ");
			int k=Integer.parseInt(arr[1]);
			String s=bread.readLine();
			int count=0;
			boolean flag=false;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='*'){
					count++;

					if(count>=k){
						flag=true;
						break;
					}
				}
				else{
					if(count>=k){
						flag=true;
						break;
					}
					count=0;
				}
			}
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}
	

}

