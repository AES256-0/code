import java.util.Scanner;
import java.util.Arrays;
class Lapindromes{
			
		private static Scanner scan=new Scanner(System.in);
		


		public static void main(String[] args){
				int t=scan.nextInt();
				while(t-->0){
					String s=scan.next();
					char[] ch=s.toCharArray();
					int len=s.length();
				
					int middle=len%2==0?len/2:len/2+1;		
					char[] array1=s.substring(0,len/2).toCharArray();
					char[] array2=s.substring(middle,len).toCharArray();
					Arrays.sort(array1);
					Arrays.sort(array2);
					if(new String(array1).equals(new String(array2))){
						System.out.println("YES");
					}
					else{
						System.out.println("NO");

					}
					
					

					

				}
			


		}





}
