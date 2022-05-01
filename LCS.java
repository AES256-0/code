import java.util.*;
import java.io.*;

class LCS{
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
	
	private static void lcs(int[] arr){
		HashSet<Integer> set=new HashSet<>();
		for(int i:arr){
			set.add(i);
		}
		int count=0;
		int start=0,end=0;
		for(int j:arr){
			if(!set.contains(j-1)){
				int k=j;
				while(set.contains(k))
					k++;

				if(count<k-j){
					start=j;
					end=k;
					count=k-j;
				}

			}	
	
		}
		System.out.println(count+" "+start+" "+end);

	}

	private static void pairDiff(int[] arr,int k){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i :arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}
			else{
				map.put(i,1);
			}

		}
		System.out.println(map);
		int count=0;
		Set<Integer> set=map.keySet();
		for(int j:set){
			int diff=j-k;
			if(map.containsKey(diff)){
				if(diff==j){
					int v=map.get(j);
					count+=v*(v-1)/2;
				}
				else{
					count+=map.get(diff)*map.get(j);
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
	//	lcs(arr);
		int k=Integer.parseInt(bread.readLine());
		pairDiff(arr,k);
	/*	Map<Integer,Integer> map=new HashMap<>();
		for(int i : arr){
			map.put(i,0);
		}
		List<Integer> list=new ArrayList<>(map.keySet());
		System.out.println(list);
		int max=-1;
		int start=-1;
		int end=-1;
		int count=0;
		int lstart=-1;
		int lend=-1;
		for(int i=0;i<list.size()-2;i++){
			if(list.get(i+1)-list.get(i)==1){
				if(count==0){
					lstart=list.get(i);
				}
				count++;	
			}
			else{
				lend=list.get(i);
				if(max<count){
					max=count;
					start=lstart;
					end=lend;
				}
				count=0;
			}
		}
		System.out.println(max+" "+start+" "+end);
*/
	}
	
}
