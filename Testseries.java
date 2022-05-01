import java.io.*;
class Testseries{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int[] arr=new int[5];
			int i=0;
			for(String s:inp){
				arr[i++]=Integer.parseInt(s);
			}
			int[] count=new int[3];
			for(int j:arr){
				count[j]++;
			}
			if(count[1]==count[2]){
				System.out.println("DRAW");
			}
			else if(count[1]>count[2]){
				System.out.println("INDIA");
			}
			else if(count[2]>count[1]){
				System.out.println("ENGLAND");
			}
		}
	}
}
