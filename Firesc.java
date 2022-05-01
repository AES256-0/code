import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class Firesc{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int mod=1000000007;
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] data=bread.readLine().split(" ");
			int n=Integer.parseInt(data[0]);
			int m=Integer.parseInt(data[1]);
			int parent[]=new int[n+1];
			Map<Integer,Boolean> map=new HashMap<>();
			for(int i=1;i<=n;i++){
				parent[i]=i;
				map.put(i,false);
			}
			while(m-->0){
				String[] tmp=bread.readLine().split(" ");
				int a=Integer.parseInt(tmp[0]);
				int b=Integer.parseInt(tmp[1]);
				if(map.get(a)||map.get(b)){
					if(map.get(a)){
						parent[b]=parent[a];
						map.put(b,true);
					}
					else{
						parent[a]=parent[b];
						map.put(a,true);
					}
				}
				else{
					map.put(a,true);
					map.put(b,true);
					parent[a]=parent[b];
					
				}
			}
			Map<Integer,ArrayList<Integer>> ans=new HashMap<>();
			ArrayList<Integer> list=new ArrayList<>();
			for(int i=1;i<=n;i++){
				if(ans.containsKey(parent[i])){
					ans.get(parent[i]).add(i);
				}
				else{
					list=new ArrayList<>();
					list.add(i);
					ans.put(parent[i],list);
				}
			}
			Set<Integer> set=ans.keySet();
			long mult=1l;
			for(Integer s:set){
				mult=((mult)%mod*(ans.get(s).size())%mod)%mod;
			}
			System.out.println(set.size()+" "+mult);
		}

	}

}

