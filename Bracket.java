import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Bracket{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int n=Integer.parseInt(bread.readLine());
		String arr[]=bread.readLine().split(" ");
		int findex=-1,lindex=-1,depth=0,len=0;
		int count=0;
		StringBuilder ob=new StringBuilder("");
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals("1")){
				ob.append("(");
			}
			else{
				if(depth<ob.length()){
					depth=ob.length();
					findex=i;
				
				}
				count++;
				ob.deleteCharAt(ob.length()-1);
				if(ob.length()==0){
					if(count>len){
					len=2*count;
					lindex=i-len+2;
					}
					count=0;

				}
				
			}

		}
		System.out.println(depth+" "+findex+" "+len+" "+lindex);


	}


}
