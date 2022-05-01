import java.util.*;
import java.io.*;
class Cortsent{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			boolean ans=true;
			for(int i=1;i<in.length;i++){
				String s=in[i];
				char c=s.charAt(0);
				boolean f=97<=c && c<=109?true:false;
				if(s.length()==1){
					if(f){

						if(!(97<=s.charAt(0) && s.charAt(0)<=109)){
							ans=false;
							
						}
					}
					else{
						
						if(!(78<=s.charAt(0) && s.charAt(0)<=90)){
							ans=false;
						
						}
					}	
				}
				for(int j=1;j<s.length();j++){
					if(f){
						if(!(97<=s.charAt(j) && s.charAt(j)<=109)){
							ans=false;
							break;
						}

					}
					else{
						
						if(!(78<=s.charAt(j) && s.charAt(j)<=90)){
							ans=false;
							break;
						}
					}	
				}
				if(!ans)
					break;

			}
			if(!ans){
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}

		}


	}
	public static boolean check(int i,boolean f){
		
					if(f){

						if(!(97<=s.charAt(i) && s.charAt(i)<=109)){
							ans=false;
							
						}
					}
					else{
						
						if(!(78<=s.charAt(i) && s.charAt(i)<=90)){
							ans=false;
						
						}
	}

}
