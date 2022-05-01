import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
class Cvdrun{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] arr=bread.readLine().split(" ");
			HashSet<Integer> set=new HashSet<Integer>();
			boolean flag=false;
			int element=Integer.parseInt(arr[2]);
			while(true){
				element=(element+Integer.parseInt(arr[1]))%Integer.parseInt(arr[0]);
				if(element==Integer.parseInt(arr[3])){
					flag=true;
					break;
				}
				if(!set.add(element)){
					break;
				}

			}
			if(flag){
				System.out.println("YES");

			}
			else{
				System.out.println("NO");
			
			}


		}


	}




}
