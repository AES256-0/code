import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
class Chfparty{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			Map<Integer,Integer> map=new LinkedHashMap<>();
			for(int i=0;i<=n;i++){
				map.put(i,0);
			}
			for(int i=0;i<n;i++){
				map.put(arr[i],map.get(arr[i])+1);
			}
			//System.out.println(map);
			if(map.get(0)==0){
				System.out.println("0");
			}
			else{
				int sum=map.get(0);
				Set<Integer> set=map.keySet();
			//	System.out.println(set);
				for(int i:set){
					if(i==0){
						continue;
					}
					else{
						if(i<=sum){
						   sum+=map.get(i);
						}
						else{
							break;
						}
		
					}
				}
				System.out.println(sum);
			}
		}

	}

}
