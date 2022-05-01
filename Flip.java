import java.util.*;
import java.io.*;
class Flip{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String a=bread.readLine();
			String b=bread.readLine();
			ArrayList<Integer> even=new ArrayList<>();
			ArrayList<Integer> odd=new ArrayList<>();
			int last=-1;
		//	int ans=0;
			boolean flag=false;
			Map<Integer,Integer> map=new HashMap<>();
			//11001100
			//10010011
			//101010101
			//111011010
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)!=b.charAt(i)){
					if(i%2==0){
						even.add(i);
					}
					else{
						odd.add(i);
					}

				}
			}
			if(a.equals(b)){
				System.out.println(0);

			}
			else{
				int ans=0;
				if(even.size()>=1){
					ans++;
				}
				for(int i=1;i<even.size();i++){
					if(even.get(i)-even.get(i-1)==2){

					}
					else{
						ans++;
					}
				}
				if(odd.size()>=1){
					ans++;
				}
				for(int i=1;i<odd.size();i++){
					if(odd.get(i)-odd.get(i-1)==2){

					}
					else{
						ans++;
					}
				}
				System.out.println(ans);
			}	


		}


	}

}
