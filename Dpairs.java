import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Collections;
import java.util.HashSet;

class Dpairs{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static TreeMap<Integer,Integer> readInput() throws IOException{
		TreeMap<Integer,Integer> s=new TreeMap<Integer,Integer>();
		StringTokenizer ob=new StringTokenizer(bread.readLine());
		int i=0;
		while(ob.hasMoreTokens()){
			s.put(Integer.parseInt(ob.nextToken()),i++);			
		}
		return s;
	}

	public static void main(String args[]) throws IOException{
		String[] dim=bread.readLine().split(" ");
		TreeMap<Integer,Integer> X=readInput();
		TreeMap<Integer,Integer> Y=readInput();
		HashSet<Integer> result=new HashSet<Integer>();
		Set<Integer> keyx=X.keySet();
		Set<Integer> keyy=Y.keySet();
		int i=0,last=-1;
		for(Integer x:keyx){
			if(i==0){
			for(Integer y:keyy){
				if(result.add(x+y)){
					System.out.println(X.get(x)+" "+Y.get(y));
				}
				last=y;

			}
			i++;
			}
			else{

				if(result.add(x+last)){
					
					System.out.println(X.get(x)+" "+Y.get(last));
		
				}

			}
			if(check(result,dim)){
				break;

			}



		}
	
	}
	private static boolean check(HashSet<Integer> result,String[] dim){

			if(result.size()==Integer.parseInt(dim[0])+Integer.parseInt(dim[1])-1){	
				return true;
			}
			return false;

	}


}
