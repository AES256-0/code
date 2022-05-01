import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;
class Subset{
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
	public static void main(String[] args) throws Exception{
		CopyOnWriteArrayList<Integer> arr=new CopyOnWriteArrayList<Integer>();
		int[] array={1,2,3,4};
		for(int i:array){
			arr.add(i);
		}
		CopyOnWriteArrayList<CopyOnWriteArrayList> list=new CopyOnWriteArrayList<CopyOnWriteArrayList>();
		subset(arr,list);
		for(CopyOnWriteArrayList i:list){
			System.out.println(i);

		}

	}
	private static void subset(CopyOnWriteArrayList<Integer> arr,CopyOnWriteArrayList<CopyOnWriteArrayList> list) throws Exception{
		if(arr.size()==1){
			CopyOnWriteArrayList<Integer> l=new CopyOnWriteArrayList<Integer>();
			l.add(arr.get(0));
			list.add(l);
			list.add(new CopyOnWriteArrayList());
			return ;
		}
		Integer element=arr.get(0);
		arr.remove(0);
		subset(arr,list);
		for(CopyOnWriteArrayList<Integer> cl:list){
			CopyOnWriteArrayList<Integer> nl=new CopyOnWriteArrayList<Integer>(cl);
			nl.add(element);
			list.add(nl);
		}

 

	}
	
}

