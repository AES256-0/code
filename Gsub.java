import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.TreeSet;


class Gsub{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int arr[]=new int[n];
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
			String q[]=bread.readLine().split(" ");
			int n=Integer.parseInt(q[0]);
			int r=Integer.parseInt(q[1]);
			int[] arr=readInput(n);
			//TreeSet<Integer> set=new TreeSet<Integer>();
			
			while(r-->0){
				String[] query=bread.readLine().split(" ");
				int index=Integer.parseInt(query[0])-1;
				TreeSet<Integer> set=new TreeSet<Integer>();
				int value=Integer.parseInt(query[1]);
				arr[index]=value;
				int max=0,count=0,start=0,end=0;
				for(int i=0;i<arr.length-1;i++){
					if(arr[i]==arr[i+1]){
						if(end!=start)
						set.add(end-start+1);
						else
							set.add(0);
						start=i+1;
						end=i+1;
						

						
					}
					else{
						end++;
					}
					
			
				}
				if(end!=start){


				set.add(end-start+1);
				}
				else{
					
					set.add(1);
					
				}
				System.out.println(set.last());


			}	


		}






	}
	
}

