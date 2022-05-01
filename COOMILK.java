import java.io.*;
class COOMILK{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String[] st=bread.readLine().split(" ");
			if(st[n-1].equals("cookie")){
				System.out.println("NO");
			}
			else{
				String ans="YES";
				for(int i=0;i<n-1;i++){
					if(st[i].equals("cookie") && st[i].equals(st[i+1])){
						ans="NO";
					}
				}
				System.out.println(ans);
			}
		
		}


	}


}
