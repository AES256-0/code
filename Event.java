import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class Event{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static HashMap<String,Integer> map=new HashMap<String,Integer>();
	static{
		String[] arr={"saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday"};
		int i=1;
		for(String st:arr){
			map.put(st,i++);
		}

	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] arr=bread.readLine().split(" ");
			int first=map.get(arr[0]);
			int second=map.get(arr[1]);
			int diff=-1;
			int start=Integer.parseInt(arr[2]);
			int end=Integer.parseInt(arr[3]);
			int duration=end-start+1;
			if(first>second){
				diff=7-first+second+1;
			}
			else{
				diff=second-first+1;
			}
			if(diff>end){
				System.out.println("impossible");

			}
			else{
				if(diff<start){
					int temp=diff;
					while(temp<=start){
						temp=temp+7;
					}
					if(temp>=start && temp<=end){
						//System.out.println("many");
						if(temp+7>end){
							System.out.println(temp);
						}
						else{
							System.out.println("many");
						}
					}
					else if(temp>end){
						System.out.println("impossible");
					}
				}
				else if(diff>=start && diff<=end){
					if(diff+7<=end){
						System.out.println("many");
					}
					else{
						System.out.println(diff);
					}
				}
			}			
		}
	}
}
