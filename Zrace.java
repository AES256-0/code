import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Zrace{

		
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		}
		return arr;
	}


	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int i=0;i<t;i++){
			int[] array=readInput(5);
			int win=array[0];
			int max=-1;
			for(int j=0;j<5;j++){

				if(max<array[j]){
					max=array[j];

				}

			}
			if(win==max){
				System.out.println("Champions");
			
			}
			else{
				System.out.println("-1");

			}

		}









		}










}
