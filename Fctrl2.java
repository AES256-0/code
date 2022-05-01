import java.io.*;
class Fctrl2{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		long fact[]=new long[101];
		fact[1]=1;
		fact[2]=2;
		for(int i=3;i<=100;i++){
			fact[i]=fact[i-1]*i;
		}
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			System.out.println(fact[n]);
		}

	}



}
