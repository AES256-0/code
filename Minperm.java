import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Minperm{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int end=0;
			if(n%2==0){
				end=n;
			}
			else{
				end=n-3;
			}
			for(int i=1;i<=end;i++){
				if(i%2!=0){
					System.out.print(i+1+" ");
				}
				else{
					System.out.print(i-1+" ");
				}

			}
			if(end!=n){
				System.out.println((end+2)+" "+(end+3)+" "+(end+1));
			}
			else{
			System.out.println();
			}

	

		}



	}
}
