import java.util.*;
class Subset{
	public static void subset(LinkedList<Integer> list,int k,int n){
		if(k==n){
			System.out.println(list);
			return;	
	
		}	
		subset(list,k+1,n);
		list.add(k);
		subset(list,k+1,n);
		list.pollLast();
	}
	public static void iter(int n){
		int p=(int)Math.pow(2,n);
		for(int mask=0;mask<p;mask++){
			for(int j=0;j<n;j++){
				if((mask&(1<<j))>0){
					System.out.print(j+" ");
				}
			}
			System.out.println();

		}

	}
	public static void main(String[] args){
		subset(new LinkedList<Integer>(),0,3);
		iter(3);
	}


}
