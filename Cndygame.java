import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Cndygame{
	private static int player=0;
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;

	}
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			int[] mem=new int[n];
			if(n>1 && arr[0]!=1){
				for(int i=0;i<n;i++){
						if(i==0){
							mem[i]=arr[i]%1000000007;
						}
						else{
							if(arr[i-1]%2==0){
								mem[i]=(mem[i-1]+arr[i])%1000000007;
							}
							else{
								if(arr[i-1]==1){
									if(arr[i-2]%2==0){
										mem[i]=(mem[i-2]-1+arr[i])%1000000007;
									}
									else{
										mem[i]=(mem[i-2]+arr[i])%1000000007;			
									}

								}
								else{
									if(arr[i-1]%2==0){
										mem[i]=(mem[i-1]+arr[i])%1000000007;
									}
									else{
										mem[i]=(mem[i-1]+arr[i]-1)%1000000007;
									}
									
								}
							}
					
						}
				}

			}
			else if(arr[0]==1){
				for(int i=0;i<n;i++){
					mem[i]=1;
				}

			}
			int q=Integer.parseInt(bread.readLine());
			long round_sum=0l;
			if(arr[0]==1){
				round_sum=1;
			}else{
			if(arr[n-1]%2==0){
				round_sum=mem[n-1]-1;
			}
			else{
				round_sum=mem[n-1];
			}
			}
			while(q-->0){
				long sum=0l;
				long round=Integer.parseInt(bread.readLine());
				if(n==1){
					if(round==1){
						System.out.println(arr[0]%1000000007);
					}
					else{
						if(arr[0]%2!=0){
							sum=sum+arr[0]*round;
						}
						else{
							sum=sum+(arr[0]-1)*(round-1)+arr[0];	
						}
						System.out.println(sum%1000000007);
					}

				}
				else if(round<=n){
							System.out.println(mem[(int)round-1]);

				}
				else if(round>n){
					long div=round/n;
					int rem=(int)round%n;
					long rem_sum=0l;
					if(rem!=0){
						 if(rem==1 && arr[0]==1){
							
						 }
						 else{
								rem_sum=mem[rem-1];
						 }
					}
				
					long div_sum=round_sum;
					long total=div_sum*div+rem_sum;
					if(rem==0 && arr[0]!=1){
						if(arr[n-1]%2==0){
							total=total+1;
						}
					}
					System.out.println(total%1000000007);
				}
	
			}
		}
	}
}
