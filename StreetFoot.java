import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class StreetFoot{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(bread.readLine());
			int max=-1;
			for(int j=0;j<n;j++){
				String[] arr=bread.readLine().split(" ");
				max=Math.max(max,(Integer.parseInt(arr[1])/(Integer.parseInt(arr[0])+1))*Integer.parseInt(arr[2]));
			}
	  		System.out.println(max);
	}

  }
	
}
