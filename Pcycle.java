import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

class Pcycle{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		String a="1234512345";
		System.out.println(a.matches('\d{10}'));
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		List<List<Integer>> all=new ArrayList<>();
		TreeSet<Integer> set=new TreeSet<>();
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int i=1;i<=n;i++){
			set.add(i);
			map.put(i,false);
		}
		List<Integer> list=new ArrayList<>();
		int a=set.pollFirst();
		list.add(a);
 		map.put(a,true);
		int i=0;
		while(true){		 	
			if(!map.get(arr[i])){
				list.add(arr[i]);
				//System.out.println("remove"+arr[i]);
				set.remove(new Integer(arr[i]));
				i=arr[i]-1;				
			}
			else{
				list.add(arr[i]);
				all.add(list);
				list=new ArrayList<>();
				if(set.size()==0)
					break;
				a=set.pollFirst();
				map.put(a,true);
				//System.out.println("a"+a);
				i=a-1;
				list.add(a);
				
			}		
		}
		System.out.println(all.size());
		for(List<Integer> l:all){
			for(int j:l)
			System.out.print(j+" ");
			System.out.println();
		}

	}

}
