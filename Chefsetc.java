import java.util.*;
import java.io.*;
class Chefsetc{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int[] arr=new int[4];
			for(int i=0;i<4;i++){
				arr[i]=Integer.parseInt(in[i]);
			}
			boolean flag=false;
			for(int i=0;i<(1<<4);i++){
				int sum=0;
				for(int j=0;j<4;j++)
				{
						if(i!=0){
							if((i&(1<<j))!=0){
								sum+=arr[j];			
							}
						}
		
				}
				if(sum==0 && i!=0){
					flag=true;
					break;
	
				}

			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
		
	}


}

