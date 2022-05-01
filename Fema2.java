import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Fema2{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
			int t=Integer.parseInt(bread.readLine());
			while(t-->0){
				String[] data=bread.readLine().split(" ");
				int n=Integer.parseInt(data[0]);
				int k=Integer.parseInt(data[1]);
				String s=bread.readLine();
				//String[] sub=s.split("X");
				int total=0;
				int i=0,j=0;
				while(i<n&&j<n){
					//System.out.println("i:"+i+" j:"+j);
					if(s.charAt(i)=='M'){
						if(s.charAt(j)=='I'){
							int c=0;
						//	if(s.indexOf(':')!=-1)
							 c=count(s,i,j);
							int p=k+1-Math.abs(i-j)-c;
							if(p>0){
								total++;
								i++;
								j++;
							}
							else{
								if(i<j){

									i++;
								}
								else{
									j++;
								}

							}
											
						}
						else if(s.charAt(j)=='X'){
							i=j;
							j++;
							i++;

						}
						else{
							j++;
						}

					}
					else if(s.charAt(i)=='X'){

						j=i;
						j++;
						i++;

					}
					else{
						i++;
					}



				}
				System.out.println(total);

			}
	}
	
	private static int count(String s,int a,int b){
		int start=0;
		int end=0;
		int count=0;
		if(a<b){
			start=a;
			end=b;

		}
		else{
			start=b;
			end=a;

		}
		for(int i=start;i<=end;i++){
			if(s.charAt(i)==':'){
				count++;

			}

		}
		return count;
	}
}
