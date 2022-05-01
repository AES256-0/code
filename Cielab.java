import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Cielab{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		String[] s=bread.readLine().split(" ");
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		int diff=Math.abs(a-b);
		String sdiff=String.valueOf(diff);
		if(sdiff.length()==1){
			if(sdiff.equals("9")){
				System.out.println(sdiff.charAt(0)-'1');
			}
			else{
				System.out.println((char)(sdiff.charAt(0)+1));
			}

		}
		else{
			int len=sdiff.length()-1;
			sdiff=sdiff.substring(0,len)+"0";
			System.out.println(sdiff);


		}
	}

}
