import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cathief{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] data=bread.readLine().split(" ");
			int x=Integer.parseInt(data[0]);
			int y=Integer.parseInt(data[1]);
			int k=Integer.parseInt(data[2]);
			int n=Integer.parseInt(data[3]);
			int s=-1,l=-1;
			if(x<y){

				s=x;
				l=y;
			}
			else{
				s=y;
				l=x;
			}
			boolean flag=true;
			while(true){
				if(s>l){
					break;
				}
				s+=k;
				l-=k;
				if(s==l){
					System.out.println("Yes");
					flag=false;
					break;
				}	

			}
			if(flag){
				System.out.println("No");
			}

		}




	}

}
