import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Compiler{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){
			String s=bread.readLine();
			int count=0,fcount=0,no=0;
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)=='<'){
					fcount++;
				}
				else{
					if(fcount!=0){
						fcount--;
						no=j+1;

					}
					else{
						break;
					}

				}

	
			}

			System.out.println(no);




		}

	}

}
