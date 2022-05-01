import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Bal01{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			char[] ch=s.toCharArray();
			int oc=0,zc=0;
			for(int i=0;i<n;i++){
				if(s.charAt(i)=='0'){
					zc++;
				}
				else if(s.charAt(i)=='1'){
					oc++;
				}
			}
			for(int i=0;i<n;i++){
				if(ch[i]=='?'){
					ch[i]=oc>=zc?'0':'1';
					if(ch[i]=='1'){
						oc++;
					}
					else{
						zc++;
					}
				/*	if(oc>zc){
						ch[i]='0';
						zc++;
					}
					else if(zc>oc){
						ch[i]='1';
						oc++;
					}
					else{
						ch[i]='1';
						oc++;
					}*/	
				}	

			}
			System.out.println(new String(ch));
		}

	}


}
