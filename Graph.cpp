#include<iostream>
using namespace std;


class Edge{
	public :
		int source;
		int dest;
		int weight;

};
bool compare(Edge e1,Edge e2){
	return e1.weight<e2.weight;
}
int findParent(int v,int *parent){
	if(parent[v]==v){
		return v;
	}
	return findParent(parent[v],parent);


}






void kruskals(Edge *input,int n,int E){

	sort(input,input+E,compare);

	Edge *output=new Edge[n-1];
	int *parent=new int[n];
	for(int i=0;i<n;i++){
		parent[i]=i;

	}


	int count=0;
	int i=0;
	int total=0;
	while(count!=n-1){
		Edge currentEdge=input[i];

		int sourceParent=findParent(currentEdge.source,parent);
		int destParent=findParent(currentEdge.dest,parent);
		if(sourceParent!=destParent){
			output[count]=currentEdge;
			count++;
			parent[sourceParent]=destParent;
			total=currentEdge.weight;

		}
		i++;

	}
	cout<<weight;






}






int main(){
	int n,d;
	cin >> n >> d;
	int dim[n][d];
	int E=(n*(n-1))/2;
	int j=0;
	while()
	Edge *input=new Edge[E];
	for(int i=0;i<E;i++){
		int s,d,w;
		cin >> s >> d >> w;
		input[i].source=s;
		input[i].dest=d;
		input[i].weight=w;
	
	}
	kruskals(input,n,E);




}

