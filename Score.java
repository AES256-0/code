import java.io.BufferedReader;;
import java.io.InputStreamReader;
import java.io.IOException;
class Score{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{ 
		int t=Integer.parseInt(bread.readLine());
		for(int k=0;k<t;k++){
			int n=Integer.parseInt(bread.readLine());
			String s=bread.readLine();
			int i=0,j=1,fwin=0,swin=0,fcount=0,scount=0;
			while(j<2*n){
					if((fwin<swin && !(swin<=fwin+n-fcount)) ||(fwin>swin && !(fwin<=swin+n-scount))   )
					{
						break;
					}



					if(s.charAt(i)=='1'){
						fwin++;

					}
					fcount++;
				
					if((fwin<swin && !(swin<=fwin+n-fcount)) ||(fwin>swin && !(fwin<=swin+n-scount))   )
					{
						break;
					}
					
					if(s.charAt(j)=='1'){
						swin++;

					}
					scount++;
					i=i+2;
					j=j+2;


			}
			System.out.println(fcount+scount);

		}

	}


}
