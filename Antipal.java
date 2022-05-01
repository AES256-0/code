import java.io.*;
class Antipal{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			if(n%2!=0){
				System.out.println("-1");
			}
			else{
				StringBuilder st=new StringBuilder();
				for(int i=0;i<n;i++){
					if(i%2==0){
						st.append("1");
					}
					else{
						st.append("0");
					}
				}
				System.out.println(st.toString());
			}	
		}
	}
}


