#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
	long long t,n,x,arr[100001],k=30;
	scanf("%lld",&t);
	while(t--){
		scanf("%lld %lld",&n,&x);
		vector<vector<long long>> first(k+1);
		for(long long i=0;i<n;i++){
			scanf("%lld",&arr[i]);
			if(i==n-1)continue;
			for(long long j=k;j>=0;j--){
				if(arr[i]&(1LL<<j)){
					first[j].push_back(i);
				}

			}
	

		}
		vector<long long> count(k+1,0);
		for(long long i=0;i<n-1;i++){
			for(long long j=k;j>=0;j--){
				long long mask=1LL<<j;
				if((arr[i]&mask)==0)continue;
				arr[i]^=mask;
				long long d;
				if(++count[j] <first[j].size()){
					d=first[j][count[j]++];

				}
				else{
					d=n-1;
				}
				arr[d]^=mask;
				if(--x==0)break;
			}
			if(x==0)break;
		
		

		}
		for(int i=0;i<n;i++){
			printf("%lld ",arr[i]);
		}
		printf("\n %lld\n",x--);
		if(x!=0){
			if(arr[n-2]!=0){
			for(long long j=k;j>=0;j--){
				long long mask=1LL<<j;
				if((arr[n-2]&mask)==0)continue;
				arr[n-2]^=mask;
				arr[n-1]^=mask;
				if(--x==0 || arr[n-2]==0)break;

				
			}
			if(x!=0){
				if(x%2!=0){
					arr[n-2]^=1;
					arr[n-1]^=1;
				}
			}
			}
			else{

				if(x%2!=0){
					arr[n-2]^=1;
					arr[n-1]^=1;
				}
			}
		}
		for(int i=0;i<n;i++){
			printf("%lld ",arr[i]);
		}
		printf("\n");
		
	
	}



}
