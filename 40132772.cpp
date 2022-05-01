#include<iostream>
#include<vector>
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
				long long m=1LL<<j;
				if((arr[i]&m)==0)continue;
				arr[i]^=m;
				long long d;
				if(++count[j] <first[j].size()){
					d=first[j][count[j]++];

				}
				else{
					d=n-1;
				}
				arr[d]^=m;
				if(--x==0)break;
			}
			if(x==0)break;

		}
		printf("\n\n%lld\n\n",x);
		for(int i=0;i<n;i++){
			printf("%lld ",arr[i]);
		}
		printf("\n");
		
	
	}



}
