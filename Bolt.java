import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Bolt{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] arr=bread.readLine().split(" ");
			float k1=Float.parseFloat(arr[0]);
			float k2=Float.parseFloat(arr[1]);
			float k3=Float.parseFloat(arr[2]);
			float v=Float.parseFloat(arr[3]);

			float ans=100/(k1*k2*k3*v);
			float round = (float)Math.round(ans * 100.0f) / 100.0f;
			System.out.println(round);
			if(round>=9.58){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
