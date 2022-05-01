import java.util.*;
import java.io.*;
class PrimeFactor{
	private static HashMap<Integer,Integer> map=new HashMap<>();
	public static void primeFactor(int n){
		int c=0;
		while(n%2==0){
			c++;
			n/=2;
		}
		map.put(2,c);
		
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			int p=0;
			while(n%i==0){
				p++;
				n/=i;	
			}
			map.put(i,p);

		}
		if(n>2){
			if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            	}
            	else{
                	map.put(n,1);
            	}
		}
	//	System.out.println(map);

	}
	public static void main(String[] args) {

		primeFactor(1000);
	}

}
