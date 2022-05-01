//
//
// 7 10 12 14
//
//
// 14%4 2
//
//
// 43%4
// 3
//
//
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Watermelon{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(bread.readLine());
			String[] num=bread.readLine().split(" ");
			int sum=0;
			for(int j=0;j<n;j++){
				sum=sum+Integer.parseInt(num[j]);
			}
			if(sum>=0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
	




		}

	}




}
