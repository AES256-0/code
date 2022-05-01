import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Groups{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			String[] arr=s.split("0");
			int count=0;
			boolean flag=true;
			/*for(int i=0;i<arr.length;i++){
				if(!arr[i].equals("")){
					count++;
				}
			}*/
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='1' && flag){
					count++;
					flag=false;
				}
				else if(s.charAt(i)=='0'){
					flag=true;
				}
			}
			System.out.println(count);
		}
	}
}

