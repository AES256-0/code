import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class Sieve{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static void returnPrimes(int m,int n){
			HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
			for(int i=2;i<=n;i++){
				map.put(i,true);
			}
			for(int i=2;i<=n;i++){
				if(map.get(i)){
					for(int j=i*i;j<=n;j+=i){
						map.put(j,false);
					}

				}

			}
			for(int i=m;i<=n;i++){
				if(map.get(i)){
					System.out.println(i);
			
				}

			}
			System.out.println();


	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] data=bread.readLine().split(" ");
			int m=Integer.parseInt(data[0]);
			int n=Integer.parseInt(data[1]);
			if(m==1){
				m=2;
			}
			returnPrimes(m,n);



		}


	}





}
