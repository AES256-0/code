import java.io.*;
import java.util.*;
class Directi{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		Map<String,String> map=new HashMap<>();
		map.put("Begin Left","Right");
		map.put("Begin Right","Left");
		map.put("Left Left","Right");
		map.put("Left Right","Left");
		map.put("Right Left","Right");
		map.put("Right Right","Left");
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			String[] sb=new String[n];
			for(int i=0;i<n;i++)
			{
				sb[i]=bread.readLine();
			}
			for(int i=0;i<n-1;i++){
				String[] a=sb[i].split(" ");
				String[] b=sb[i+1].split(" ");
				sb[i]=sb[i].replace(a[0],map.get(a[0]+" "+b[0]));			
			}
			sb[n-1]=sb[n-1].replace(sb[n-1].split(" ")[0],"Begin");
			for(int i=n-1;i>=0;i--){
				System.out.println(sb[i]);
			}
			

		}



	}




}
