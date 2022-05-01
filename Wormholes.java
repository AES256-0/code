import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

class Wormholes{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static Set<Integer> returnArray(int len) throws IOException{
		Set<Integer> t=new TreeSet<Integer>();
		StringTokenizer s=new StringTokenizer(bread.readLine());
		int i=0;
		while(s.hasMoreTokens()){
			t.add(Integer.parseInt(s.nextToken()));
		}
		return t;
	}

	public static void main(String[] args) throws IOException{
		String[] info=bread.readLine().split(" ");
		List<String[]> list=new ArrayList<String[]>();
		for(int i=0;i<Integer.parseInt(info[0]);i++){
			String[] exam=bread.readLine().split(" ");
			list.add(exam);
			
		}
		Set<Integer> a=returnArray(Integer.parseInt(info[1]));
		Set<Integer> b=returnArray(Integer.parseInt(info[2]));
		Integer[] X=a.toArray(new Integer[0]);
		Integer[] Y=b.toArray(new Integer[0]);
		int min=Integer.MAX_VALUE;
		for(int j=0;j<list.size();j++){
			String[] t=list.get(j);
			int x=Arrays.binarySearch(X,Integer.parseInt(t[0]));
			int y=Arrays.binarySearch(Y,Integer.parseInt(t[1]));
			if(x<0){
				if(x!=-1){
					x=Math.abs(x)-2;
				}
			}
			if(y<0){
				if(y!=-1*(Y.length+1)){
					y=Math.abs(y)-1;
				
				}
			}
			if(x!=-1 && y!=-1*(Y.length+1)){
					int cal=Y[y]-X[x]+1;
					if(cal<min){
						min=cal;
						
					}
		
			}
		}
		System.out.println(min);
		
	}
}
