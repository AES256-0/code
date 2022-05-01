import java.util.Scanner;
import java.util.Arrays;
class Elephant{
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){
		int t=Integer.parseInt(scan.nextLine());
		for(int i=0;i<t;i++){
			int g=Integer.parseInt(scan.nextLine());
			for(int j=0;j<g;j++){
				String[] metadata=scan.nextLine().split(" ");
				int round=Integer.parseInt(metadata[1]);
				int head_count=0,tail_count=0;
				if(round%2==0){
					System.out.println(round/2);

				}
				else{
				/*	if(Integer.parseInt(metadata[0])!=1){
						head_count=round/2+1;
						tail_count=round/2;
					}
					else{
						head_count=round/2;
						tail_count=round/2+1;

					}*/
				/*	if(Integer.parseInt(metadata[0])==Integer.parseInt(metadata[2]))
					{
						System.out.println(round/2);

					}
					else
					{
						System.out.println(round/2+1);
						
					}*/
					System.out.println(Integer.parseInt(metadata[2])==Integer.parseInt(metadata[0])?round/2:round/2+1);
				}
			}

		}

	}

}
