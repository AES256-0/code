import java.io.*;
import java.util.*;
class Median{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n+1];
		int i=1;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;
	}

	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		int[] arr=readInput(n);
		faster(arr);
		/*HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=1;i<=n;i++){
			map.put(arr[i],0);
			Set<Integer> set=map.keySet();
			List<Integer>  list=new ArrayList<>(set);
			if(i%2!=0){
				System.out.println(list.get((i+1)/2-1));
			}
			else{
				System.out.println((list.get(i/2-1)+list.get(i/2+1-1))/2);
			}
		}*/
	}

	private static void faster(int[] arr){
		PriorityQueue<Integer> min=new PriorityQueue<>();
		PriorityQueue<Integer> max=new PriorityQueue<>((i,j)->i>j?-1:1);
		for(int i=1;i<arr.length;i++){
			if(max.size()==0){
				max.add(arr[i]);
				System.out.println(arr[i]);
			}
			else{
				int top=max.peek();
				if(top>arr[i]){
					max.add(arr[i]);
					if(Math.abs(max.size()-min.size())>1){
						min.add(max.poll());
					}
					if(i%2==0){
						System.out.println((min.peek()+max.peek())/2);
					}
					else{

						System.out.println(max.peek());
					}
				}
				else{

					min.add(arr[i]);
					if(Math.abs(min.size()-max.size())>1){
						max.add(min.poll());
					}
					if(i%2==0){
						System.out.println((min.peek()+max.peek())/2);
					}
					else{

						System.out.println(min.peek());
					}
				}
				
		
			}
			
		}

	}

	/*public static void perLocateUp(int[] arr,int index){
		int data=
		//6 1 2 ->1 2 6
		while(arr[index/2] >arr[index]){

		}

	}***/
}
