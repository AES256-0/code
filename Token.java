import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class Token{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		for(int j=0;j<t;j++){
			int n=Integer.parseInt(bread.readLine());
			String[] arr=bread.readLine().split(" ");
			long count=0;
			int index=arr.length;
			int temp=index;
			while(index!=0){
				boolean round=false;
				int min=min(arr,temp);
				for(int i=0;i<index;i++){
					arr[i]=String.valueOf(Integer.parseInt(arr[i])-min);
					if(Integer.parseInt(arr[i])==0 && !round){
						round=true;
						temp=i;
					}
					count=count+min;
				}
				index=temp;		
			}
			System.out.println(count);


		}






	}

	public static int min(String[] arr,int index){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<index;i++){
			int num=Integer.parseInt(arr[i]);
			if(min>num){
				min=num;

			}
			

		}
		return min;

	}
	


}

