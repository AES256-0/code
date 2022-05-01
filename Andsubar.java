import java.io.*;
class Andsubar{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			//01 10 11 100 101 110 111 1000 100
			int max=0;
			int j=0;
			while(j<32){
				if((n&(1<<j))>0){
					max=j;
				}
				j++;
			}
			int f=(1<<max)-(1<<(max-1));
			int s=n-(1<<(max))+1;
			System.out.println(f<s?s:f);

		}


	}

}
