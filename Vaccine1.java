import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Vaccine1{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] meta=bread.readLine().split(" ");
		int x=Integer.parseInt(meta[0]);
		int y=Integer.parseInt(meta[1]);
		int m=Integer.parseInt(meta[2]);
		int n=Integer.parseInt(meta[3]);
		int p=Integer.parseInt(meta[4]);
		if(x==m){
			int per_day=y+n;
			if(per_day>=p){
				System.out.println(1+x-1);
			}
			else{
				System.out.println((int)Math.ceil((double)p/per_day)+x-1);
			}
		}
		else{
			int min=Math.min(x,m);
			int max=(x==min?m:x);
			int start=-1;
			if(min==x){
				start=y;
			}
			else{
				start=n;
			}
			int day=min-1;
			int diff=max-min;
			int i=0;
			int total=0;
			boolean flag=false;
			while(i<diff){
				day++;
				total+=start;
				if(total>=p){
					flag=true;
					break;

				}
				i++;
				
			}
			if(flag){
				System.out.println(day);
			}
			else{
				int rem=p-total;
				int t=y+n;
				System.out.println((int)Math.ceil((double)rem/t)+day);
			}

			
			

		}


	}

}
