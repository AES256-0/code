import java.util.*;
import java.io.*;
class Bus{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int m=Integer.parseInt(in[1]);
			int q=Integer.parseInt(in[2]);
			String ans="Consistent";
			HashSet<Integer> set=new HashSet<>();
			while(q-->0){
				String[] qu=bread.readLine().split(" ");
				if(!ans.equals("Inconsistent")){
					if(qu[0].equals("+")){
						if(set.size()>=m || set.contains(Integer.parseInt(qu[1])) ){
							ans="Inconsistent";
						}
						else{
							set.add(Integer.parseInt(qu[1]));
						}
					}
					else{
						if(set.size()==0|| !set.contains(Integer.parseInt(qu[1]))){
							ans="Inconsistent";
						}
						else{
							set.remove(Integer.parseInt(qu[1]));
						}
					}
				}

			}
			System.out.println(ans);
			

		}


	}

}
