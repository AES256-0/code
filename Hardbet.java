import java.io.*;
class Hardbet{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] arr=bread.readLine().split(" ");
			int index=-1;
			int min=0; 
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			int c=Integer.parseInt(arr[2]);
			min=Math.min(a,b);
			min=Math.min(min,c);
			if(min==a){
				System.out.println("Draw");
			}
			else if(min==b){
				System.out.println("Bob");
			}
			else{
				System.out.println("Alice");
			}


		}
	}

}
