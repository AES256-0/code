

import java.util.Scanner;
import java.util.HashSet;

class Pand {
    private static HashSet<Integer> set=new HashSet<Integer>();
    private static Scanner scan=new Scanner(System.in);
    static{
        for(int k:new int[]{2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072}){
            set.add(k);
        }
        
    }
	public static void main(String[] args){
	   // Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int temp[]={1,3,2,6,4,5,7,9,8}; 
			int j=0;
			if(set.contains(n)){
			    System.out.print("-1");
			}
			else{
			    if(n==5){
				    System.out.print("2 3 1 5 4");
    			}
	    		else{
				    for( j=0;j<n;j++){
					    if(j>=9){
						    break;
					    }
				    	System.out.print(temp[j]+" ");

				    }
				    for(int i=j+1;i<=n;i++){
					    if(set.contains(i)){
						System.out.print(i+1+" "+i+" ");
						i=i+1;
					    }
				    	else{
						    System.out.print(i+" ");
				    	}
			    	}
			    }
			}
         		   System.out.println();
		}
	}
}


