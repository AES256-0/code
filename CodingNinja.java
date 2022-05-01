import java.util.*;
import java.io.*;
class CodingNinja{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		String[] inp=bread.readLine().split(" ");
		int n=Integer.parseInt(inp[0]);
		int m=Integer.parseInt(inp[1]);
		char[][] graph=new char[n][m];
		LinkedList<String> list=new LinkedList<>();
		for(int i=0;i<n;i++){
			String s=bread.readLine();
			for(int j=0;j<m;j++){
				graph[i][j]=s.charAt(j);
				if(graph[i][j]=='C')
					list.add(String.valueOf(i)+":"+String.valueOf(j));
			}
		}
		char[] ch="CODINGNINJA".toCharArray();
		boolean ans=false;
		while(!list.isEmpty()){
			String node=list.pollFirst();
			inp=node.split(":");
			int i=Integer.parseInt(inp[0]);
			int j=Integer.parseInt(inp[1]);

			ans=ans|| dfs(graph,i,j,n,m,1,ch);

		}
		System.out.println(ans);
	



	}

	private static boolean dfs(char[][] graph,int i,int j,int n,int m,int c,char[] ch){

		if(c==ch.length)
			return true;
		
		boolean[] arr=new boolean[8];
		if(i+1<n && ch[c]==graph[i+1][j]){
			arr[0]=dfs(graph,i+1,j,n,m,c+1,ch);
		}
		if(i-1>=0 && ch[c]==graph[i-1][j]){			
			arr[1]=dfs(graph,i-1,j,n,m,c+1,ch);
		}
		if(j-1>=0 && ch[c]==graph[i][j-1]){
			arr[2]=dfs(graph,i,j-1,n,m,c+1,ch);
		}
		if(j+1<m && ch[c]==graph[i][j+1]){

			arr[3]=dfs(graph,i,j+1,n,m,c+1,ch);
		}
		if(i+1<n &&j-1>=0 && ch[c]==graph[i+1][j-1]){
			
			arr[4]=dfs(graph,i+1,j-1,n,m,c+1,ch);
		}
		if(i+1<n && j+1<m && ch[c]==graph[i+1][j+1]){

			arr[5]=dfs(graph,i+1,j+1,n,m,c+1,ch);
		}
		if(i-1>=0 && j-1>=0 && ch[c]==graph[i-1][j-1]){

			arr[6]=dfs(graph,i-1,j-1,n,m,c+1,ch);
		}
		if(i-1>=0 && j+1<m &&ch[c]==graph[i-1][j+1]){			
			arr[7]=dfs(graph,i-1,j+1,n,m,c+1,ch);
		}
		boolean an=false;
		for(boolean ca:arr){
			an=an||ca;
		}
		return an;
	}



}
