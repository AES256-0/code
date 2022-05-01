#include<stdio.h>
int check(int n){
	    int temp=1;
	    
	    while(1){
	        temp=temp*2;
	        if(temp==n)
	        {
	        
		 return 1;
	         break;
	        }
	        else if(temp>n){
	            break;
	        }
	     }
	     return 0;
	    }






void main(){
	int t,n;
	scanf("%d",&t);
	while(t-->0){
		scanf("%d",&n);
			int temp[]={1,3,2,6,4,5,7,9,8};
			int count=check(n);
		
			if(count==1){
			    printf("-1");
			}
			else{
			    if(n==5){
				   printf("2 3 1 5 4");
    				}
	    			else {
					int j=0;
				    for( j=0;j<n;j++){
					    if(j>=9){
						    break;
					    }
				    	printf("%d ",temp[j]);

				    }
				    for(int i=j+1;i<=n;i++){
					    if(check(i)==1){
						printf("%d %d",i+1,i);
						i=i+1;
					    }
				    	else{
						   printf("%d ",i);
				    	}
			    	}
			    }
			}
            		printf("\n");
		}




	}




