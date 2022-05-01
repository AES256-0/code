import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Decrem{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String arr[]=bread.readLine().split(" ");
				int c=Integer.parseInt(arr[0]);
				int total=c+(c-1);
				if(total>=Integer.parseInt(arr[1])){
				System.out.println(Integer.parseInt(arr[1]));
				}
				else{
					System.out.println("-1");

				}
			
		}	

	}

}
