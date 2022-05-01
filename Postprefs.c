#include<stdio.h>
int main(){
	int t;
	scanf("%d",&t);
	while(t-->0){
		int n,k;
		scanf("%d %d",&n,&k);
		if(n==k){
			for(int i=1;i<=k;i++){
					printf("%d ",i);
				}
			}
			else{
				
				int diff=n-k;
				int nc=0;
				if(k==n/2){
				for(int i=1;i<=n;i++){
					if(i%2==0){
						printf("%d ",i);
					}
					else{
						printf("%d ",-1*i);
					}
				}
				}
				else if(k>n/2){
					for(int i=1;i<=n;i++){
						if(i<=2*diff){		
					if(i%2==0){
						printf("%d ",i);
					}
					else{
						printf("%d ",-1*i);
					}
						}
						else{
							printf("%d ",i);
						}
					}
				}
				else{
				
					for(int i=1;i<=n;i++){
						if(i<=2*k){
							
							if(i%2==0){
								printf("%d ",i);
							}
							else{
							printf("%d ",-1*i);
							}
						}
						else{

							printf("%d ",-1*i);
						}
						

					}
					
				}

			}
		printf("\n");	
	}

}
















