

#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#define ARRSIZE(arr) (sizeof(arr)/sizeof(*(arr)))
struct Edge{
	int src;
	int dst;
	long weight;

};

void prims(struct Edge edge,int n){
	int parent[n];
	int weight[n];
	bool visited[n];












}





int main(){
	int n,d;
	scanf("%d %d",&n,&d);
	int i=0;
	int node[n][d];
	long no=(n*(n-1))/2;
	struct Edge edge[no];
	while(i<n){
		for(int j=0;j<d;j++){
			scanf("%d",&node[i][j]);		
		}
		i++;
	}
	int c=0;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(i!=j){
			int sum=0;
			switch(d){
				case 1:
			 		sum=abs(node[i][0]-node[j][0])+sum;
					break;
				case 2:
				        sum=abs(node[i][0]-node[j][0])+abs(node[i][1]-node[j][1]) +sum;
					break;
				case 3:
				        sum=abs(node[i][0]-node[j][0])+abs(node[i][1]-node[j][1])+abs(node[i][2]-node[j][2]) +sum;
					break;
				case 4:
				        sum=abs(node[i][0]-node[j][0])+abs(node[i][1]-node[j][1])+abs(node[i][2]-node[j][2])+abs(node[i][3]-node[j][3]) +sum;
					break;
				case 5:
				        sum=abs(node[i][0]-node[j][0])+abs(node[i][1]-node[j][1])+abs(node[i][2]-node[j][2])+abs(node[i][3]-node[j][3])+abs(node[i][4]-node[j][4]) +sum;
					break;
			}
			edge[c].src=i;
			edge[c].dst=j;
			edge[c].weight=-1*sum;
			c++;
			}
	       	}
	   }
	prims(edge,n);
	
}


