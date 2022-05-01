import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

class Redone{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int i=1;
			BigInteger last=new BigInteger(String.valueOf(n));
			while(i!=n){
				BigInteger mult=last.multiply(new BigInteger(String.valueOf(i)));
				BigInteger add=last.add(new BigInteger(String.valueOf(i)));
				BigInteger temp=mult.add(add);
				last=temp.remainder(new BigInteger("1000000007"));
				i++;
			}
			System.out.println(last);
		}
	}
}
