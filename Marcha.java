import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Marcha{
	private static boolean flag;
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){

			String[] data=bread.readLine().split(" ");
			int n=Integer.parseInt(data[0]);
			int m=Integer.parseInt(data[1]);
			int[] notes=new int[n];
			int i=0;
			flag=false;
			while(i<n){
				notes[i++]=Integer.parseInt(bread.readLine());
			}
			detect(m,notes,0);
			if(flag){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}

		}
	}
	private static void detect(int m,int[] notes,int index){
		if(m==0){
			flag=true;
			return;
		}
		if(index==notes.length){
			return;
		}
		detect(m-notes[index],notes,index+1);
		detect(m,notes,index+1);
	}

}
