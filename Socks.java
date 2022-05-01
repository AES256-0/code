import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Socks{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] arr=bread.readLine().split(" ");
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		int c=Integer.parseInt(arr[2]);
		if(a==b || a==c || c==b){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}


	}

}
