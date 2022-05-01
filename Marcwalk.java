import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

class Marcwalk{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static long returnMiles(Integer[] calorie){
		Arrays.sort(calorie,Collections.reverseOrder());
		long sum=0l;
		for(int i=0;i<calorie.length;i++){
			long mult=(long)Math.pow(2,i);
			sum=sum+mult*calorie[i];
		}
		return sum;

	}
	public static void main(String[] args){
		Integer arr[]={7,4,9,6};
		System.out.println(returnMiles(arr));


	}





}
