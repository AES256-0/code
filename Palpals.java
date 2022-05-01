import java.util.*;
import java.io.*;
class Palpals{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{

		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			char[] arr=s.toCharArray();
            		Arrays.sort(arr);
            		int pairs=0;
            		for(int j=0;j<arr.length-1;j++){
                		if (arr[j]==(arr[j+1])){
                    			pairs++;j++;
               		 }
            		}
           		 int singles=arr.length-2*pairs;
           		 if (pairs>=singles){
                		System.out.println("YES");
            		}else{
                		System.out.println("NO");
            		}
		}



	}
}
