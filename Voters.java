import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;

class Voters{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] data=bread.readLine().split(" ");
		int n1=Integer.parseInt(data[0]);
		int n2=Integer.parseInt(data[1]);
		int n3=Integer.parseInt(data[2]);
		int total=n1+n2+n3;
		int[]  first=new int[n1];
		int[] second=new int[n2];
		int[] third=new int[n3];
		int count=0;
		int l=0,j=0,k=0;
		TreeSet<Integer> result=new TreeSet<Integer>();
		while(total-->0){
			int num=Integer.parseInt(bread.readLine());
			if(count<n1){
				first[l++]=num;
			}
			else if(n1<=count && count<n1+n2){

				second[j++]=num;
				if(Arrays.binarySearch(first,num)>=0){
					result.add(num);
				}
			}
			else{
				third[k++]=num;
				if(Arrays.binarySearch(second,num)>=0 || Arrays.binarySearch(first,num)>=0){
					result.add(num);
				}
			}
			count++;
			
		}
	//	System.out.println(first);
	//	System.out.println(second);
	//	System.out.println(third);
		
	//	TreeSet<Integer> result=new TreeSet<Integer>();
	/*	for(Integer i:first){
			if(first.contains(i)&&second.contains(i) || second.contains(i)&&third.contains(i) || third.contains(i)&&first.contains(i)){
				result.add(i);
			}
		}*/
		System.out.println(result.size());
		for(Integer i:result){
			System.out.println(i);
		}	


	}
}
