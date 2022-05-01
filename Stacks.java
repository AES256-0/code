import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

class Stacks{
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
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i:arr){
				int index=Collections.binarySearch(list,i);
				if(index<0){
					index=Math.abs(index)-1;
				}
				else{
					index=list.lastIndexOf(i)+1;
				
				}
			//	System.out.println(index);
			if(list.size()>=0 && list.size()!=index)
				list.remove(index);
				list.add(index,i);
	//			System.out.println(list);
			}
			System.out.print(list.size()+" ");
			for(Integer j:list){
				System.out.print(j+" ");
			}
			System.out.println();

		}

	}


}
