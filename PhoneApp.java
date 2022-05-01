import java.util.Scanner;
import java.util.Arrays;
class PhoneApp{
	private static Scanner scan=new Scanner(System.in);



	public static void main(String[] args){
	long sum=0,max=-1,temp=-1;
	int n=scan.nextInt(),ind=-1;
	long[] budget=new long[n];
	for(int i=0;i<n;i++){
		budget[i]=scan.nextLong();

	}
	Arrays.sort(budget);
	for(int i=0;i<n;i++){
		if(temp!=budget[i]){
			ind=i;
			temp=budget[i];
		}
		sum=(n-ind)*budget[i];
		if(max<sum){
			max=sum;
		}
			
	}
	System.out.println(max);
   } 

}
