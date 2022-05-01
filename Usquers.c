#include<stdio.h>
int lis( int arr[], int n )  
{  
    int lis[n]; 
   
    lis[0] = 1;    
  
    /* Compute optimized LIS values in  
       bottom up manner */
    for (int i = 1; i < n; i++ )  
    { 
        lis[i] = 1; 
        for (int j = 0; j < i; j++ )   
            if ( arr[i] > arr[j] && lis[i] < lis[j] + 1)  
                lis[i] = lis[j] + 1;  
    } 
  
    // Return maximum value in lis[] 
    return max_element(lis, lis+n); 
}  
    





int main(){
		
		int n,q,s;
		scanf("%d %d %d",&n,&q,&s);
		int H[n];
		for(int i=0;i<n;i++){
			scanf("%d",&H[i]);

		}
		int last=0;
		while(q-->0){
			//max_ref=0;
			
			int x,y;
			scanf("%d %d",&x,&y);
			int L=(x+s*last-1)%n+1;
			int R=(y+s*last-1)%n+1;
			if(L>R){
				int temp=R;
				R=L;
				L=temp;
			}
			int sat=0;
			int max=-1;
			sat=lis(H+L-1,R-L+1);
			last=sat;
			printf("%d",sat);



	return 0;

}
}
