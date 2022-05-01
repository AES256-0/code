#include<stdio.h>
int main(){


		int t;
		scanf("%d",&t);
		while(t-->0){
			int n;
			scanf("%d",&n);
			int i=1;
			long last=n;
			while(i!=n){
				long temp=i+last+last*i;
				last=temp%1000000007;
				i++;
			}
			printf("%d\n",last);
		}
	return 0;
}










