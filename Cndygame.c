#include<stdio.h>
int main(){
		int t;
		scanf("%d",&t);
		while(t-->0){
			int n;
			scanf("%d",&n);
			int arr[n],mem[n];
			for(int i=0;i<n;i++){
				scanf("%d",&arr[i]);
			}
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
			int q;
			scanf("%d",&q);
			long round_sum=0;
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
				long round;
				scanf("%ld",&round);
				if(n==1){
					if(round==1){
						printf("%d\n",arr[0]%1000000007);
					}
					else{
						if(arr[0]%2!=0){
							sum=sum+arr[0]*round;
						}
						else{
							sum=sum+(arr[0]-1)*(round-1)+arr[0];	
						}
						printf("%d\n",sum%1000000007);
					}

				}
				else if(round<=n){
							printf("%d\n",mem[(int)round-1]);

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
					printf("%d\n",total%1000000007);
				}
			}
		}
	return 0;
}
