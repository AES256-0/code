import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
class Flavour{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){
			String[] info=bread.readLine().split(" ");
			String s=bread.readLine();
			int[] cake=ret(s,Integer.parseInt(info[0]));
			Integer[] flavor=new Integer[Integer.parseInt(info[1])];
			Integer index[]=new Integer[Integer.parseInt(info[1])];
			Arrays.fill(flavor,0);
			List<Integer> list=Arrays.asList(flavor);
			List<Integer> ll=Arrays.asList(index);
			Arrays.fill(index,0);
			int max=-1,count=0,round=0;
			for(int j=0;j<cake.length;j++){
				flavor[cake[j]-1]++;
				if(list.indexOf(0)==-1){
					int min=min(index);
					count=round-min;
					int d=ll.indexOf(min);
					flavor[d]=0;
					index[d]=0;
				
				}
				index[cake[j]-1]=j+1;
				count++;
				round++;
				if(max<count){
					max=count;

				}
				
			

			}
			System.out.println(max);

		}

	}



	public static int[] ret(String s,int size){
		StringTokenizer ob=new StringTokenizer(s);
		int[] arr=new int[size];
		int i=0;
		while(ob.hasMoreTokens()){
			arr[i++]=Integer.parseInt(ob.nextToken());	
		}
                return arr;

	}
	public static int min(Integer arr[]){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
				if(min>arr[i]&&arr[i]!=0){
					min=arr[i];

				}
			

		}



		return min;



	}

}
