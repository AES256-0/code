#include<stdio.h>
#include<limits.h>

void main(){
	int t;
	scanf("%d",&t);
	while(t-->0){
		int n,m;
	        scanf("%d",&n);
		scanf("%d",&m);
	        int arr[n+1];
	        int b[m];
	        int ans[n+1];
		int start=-1;
	        for(int i=1;i<=n;i++){
			scanf("%d",&arr[i]);
			if(arr[i]==1){
				start=i;
				ans[i]=0;
			}
			else{
				if(start==-1){
					ans[i]=INT_MAX;
				}
				else{
					ans[i]=i-start;
				}
	
			}
		}
		start=-1;
	/*	printf("----------");
		for(int i=1;i<=n;i++){
			printf("%d ",ans[i]);
		}
		*/
		for(int i=n;i>=1;i--){
			if(arr[i]==2){
				start=i;
				ans[i]=0;
			}
			else{
				if(start!=-1){
					int diff=start-i;
					if(diff<ans[i]){
						ans[i]=diff;
					}
				}
			}

		}
	/*	for(int i=1;i<=n;i++){
			printf("%d ",ans[i]);
		}*/
	//	printf("-----------");
		for(int i=0;i<m;i++){
			scanf("%d",&b[i]);
		}
		for(int i=0;i<m;i++){
			if(b[i]==1){
				printf("0 ");
			}
			else if(ans[b[i]]==INT_MAX){
				printf("-1 ");
			}
			else{
				printf("%d ",ans[b[i]]);
			}
		}
		printf("\n");

	

	}	

}
