import java.util.Scanner;

public class ReverseNumber{

	private static Scanner scan;
	static{

		scan=new Scanner(System.in);

	}




	public static void reverseNumber(){
	//	Scanner scan=new Scanner(System.in);
		int t=ReverseNumber.scan.nextInt();
		for(int i=0;i<t;i++){
			int num=ReverseNumber.scan.nextInt();
			System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()));
		}
		


	}
	public static void main(String... s){
		ReverseNumber.reverseNumber();


	}





}
