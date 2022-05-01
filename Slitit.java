import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Slitit{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){

			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			char ch=s.charAt(s.length()-1);
			boolean flag=false;
			for(int i=0;i<n-1;i++){
				if(s.charAt(i)==ch){
					flag=true;
					break;
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
