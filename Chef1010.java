import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Chef1010{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			int oc=0;
			int zc=0;
			for(int i=0;i<n;i++){
				if(s.charAt(i)=='1'){
					oc++;
				}
				else if(s.charAt(i)=='0'){
					zc++;
				}
			}
			if(oc==0 || zc==0){
				System.out.println(0);
			}
			else{
				int min=oc>zc?zc:oc;
				System.out.println(min-1);
			}


		}


	}


}
