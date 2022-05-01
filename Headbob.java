import java.io.*;
class Headbob{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			int nc=0,yc=0,ic=0;
			for(int i=0;i<n;i++){
				if(s.charAt(i)=='N'){
					nc++;
				}
				else if(s.charAt(i)=='Y'){
					yc++;
				}
				else{
					ic++;
				}
			}
			// not sure yc!=0 && ic!=0 or nc==n
			// indian ic==n || ic!=0 &&nc!=0 &&yc==0
			// not indian yc==n || yc!=0 &&nc!=0 &&ic==0
			if((yc!=0 && ic!=0) || nc==n){
				System.out.println("NOT SURE");
			}
			else if(ic==n || (ic!=0 && nc!=0 &&yc==0)){
				System.out.println("INDIAN");
			}
			else{
				System.out.println("NOT INDIAN");
			}


		}


	}

}
