import java.util.Scanner;
import java.math.BigInteger;

public class Factorial{

	private static Scanner scan=new Scanner(System.in);

	public static void main(String[] args){
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			long num=scan.nextLong();
			BigInteger half=new BigInteger("1");
			BigInteger multi=new BigInteger("1");
			for(long j=0;j<num/2;j++){
					half=half.multiply(BigInteger.valueOf(j+1));
					multi=multi.multiply(BigInteger.valueOf(num-j));

			}
			if(num%2!=0){
				half=half.multiply(BigInteger.valueOf(num/2+1));

			}
			BigInteger count=BigInteger.valueOf(0);
			System.out.println(half.multiply(multi));
			while(true){
					BigInteger[] arr=half.divideAndRemainder(BigInteger.valueOf(10));
					if(arr[1].compareTo(BigInteger.valueOf(0))==0){
						count=count.add(BigInteger.valueOf(1));
						half=arr[0];
					}
					else{

						break;
					}

			}
			System.out.println(count);

		}
	


	}








}
