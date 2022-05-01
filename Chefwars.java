import java.io.*;
class Chefwars{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] inp=bread.readLine().split(" ");
			int h=Integer.parseInt(inp[0]);
			int p=Integer.parseInt(inp[1]);
			int ans=1;
			for(int i=31;i>=0;i--){
				h=h-p;
				if(h>0){
					p=p>>1;
					if(p<=0){
						ans=0;
					}
				}

			}
		/*	int half=(int)Math.ceil((double)h/2);
			if(p>half){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}*/
			System.out.println(ans);


		}


	}


}
