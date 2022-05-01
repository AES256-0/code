#include<stdio.h>
void main(){
	int t;
	scanf("%d",&t);
	while(t-->0){
			int n;
			scanf("%d",&n);
			
			int sum=0;
			int start=0;
			int end=1;
			int diff=-1;
			int stop=n%2==0?n/2:n/2+1;
			for(int i=0;i<=n/2+1;i++){
				if(i==0){
					sum+=2*n;
				        if(n==1)
					break;	
				}
				else if(i==stop){
					
						sum+=1;
						break;
					
				}
				else{
					diff=((n-i)-start)+(n-i)-end;
					sum+=diff;
					start=i;
				        end=i+1;	
				}
				

			}
			printf("%d",sum);

		}
	}






