/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Numfact
{
    public static void primeFactors(int n , Map<Integer, Integer> map)
    {
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            if(map.containsKey(2)){
                map.put(2,map.get(2)+1);
            }
            else{
                map.put(2,1);
            }
        //    System.out.print(2 + " ");
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }
                else{
                    map.put(i,1);
                }
                
        
            //System.out.print(i + " ");
                n /= i;
            }
        }
 
        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        
            
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner  sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0; t<tc; t++){
		    int n = sc.nextInt();
		    Map<Integer,Integer> map = new HashMap<>();
		    for(int i=0; i<n; i++){
		        int a= sc.nextInt();
		        primeFactors(a,map);
		    }
		    long ans =1;
		    for(int key: map.keySet()){
		        int val = map.get(key);
		        ans=ans*(val+1);
		    }
		    
		    System.out.println(ans);
		}
	}
}

