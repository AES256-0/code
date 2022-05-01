import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Cnote{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] data=bread.readLine().split(" ");
			int x=Integer.parseInt(data[0]);
			int y=Integer.parseInt(data[1]);
			int k=Integer.parseInt(data[2]);
			int n=Integer.parseInt(data[3]);
			int temp=n;
			int pages_left=x-y;
			boolean flag=false;
			while(temp-->0){
				String[] arr=bread.readLine().split(" ");
				int p=Integer.parseInt(arr[0]);
				int c=Integer.parseInt(arr[1]);
				if(pages_left<=p && c<=k){
					flag=true;
				}
			}
			if(flag){
				System.out.println("LuckyChef");
			}
			else{
				System.out.println("UnluckyChef");
			}



		}
	}

}
