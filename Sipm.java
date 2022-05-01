import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.HashSet;

class Sipm{
		
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
			int n=Integer.parseInt(bread.readLine());
			int[] array=readInput(n);
			int neg=0,pos=0;
			HashSet<Integer> set=new HashSet<Integer>();
			for(int j=0;j<n;j++){
				if(set.add(array[j])){
						
						if(array[j]>0){
							pos=pos+array[j];

						}
						else{

							neg=neg+array[j];
						}


				}


			}
			System.out.println(pos+" "+neg);




		}









	}
	



}

