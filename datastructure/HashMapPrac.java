import java.util.*;
import java.io.*;
class HashMapPrac{
	 private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	 private static int maxFrequency(int[] arr){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}
			else{
				map.put(i,1);
			}
		}
		int max=-1;
		int ans=-1;
		Set<Integer> set=map.keySet();
		for(int j:set){
			if(map.get(j)>max){
				max=map.get(j);
				ans=j;
			}
		}	
		
		return ans;

	 }

	 public static void main(String[] args) throws IOException{
		String[] arr=bread.readLine().split(" ");
		int[] array=new int[arr.length];
		for(int i=0 ;i<arr.length;i++){
			array[i]=Integer.parseInt(arr[i]);
		}
		System.out.println(maxFrequency(array));

	 }

}
