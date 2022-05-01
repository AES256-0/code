package tree.genericTree;
import tree.node.*;
import java.io.*;
import java.util.*;
class GenericTree{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));

	private static Node<Integer> makeTreeDfs() throws IOException{
		System.out.println("Enter the data:");
		int data=Integer.parseInt(bread.readLine());
		Node<Integer> root=new Node<>(data);
		System.out.println("Enter no of node:");
		int n=Integer.parseInt(bread.readLine());
		for(int i=0;i<n;i++){
			root.list.add(makeTreeDfs());
		}
		return root;
	}

	private static void printTreeDfs(Node<Integer> root){
		System.out.print(root.data+":");
		for(Node<Integer> node:root.list){
			System.out.print(node.data+" ");
		}
		System.out.println();
		for(Node<Integer> child:root.list){
			printTreeDfs(child);
		}
	}

	private static Node<Integer> removeLeaf(Node<Integer> root){
		for(Node<Integer> child:root.list){
			if(child.size()==0){
				
			}
		}

	}
	
	private static Node<Integer> makeTreeBfs() throws IOException{
		LinkedList<Node<Integer>> list=new LinkedList<>();
		System.out.print("Enter data:");
		int data=Integer.parseInt(bread.readLine());
		System.out.println();
		Node<Integer> root=new Node<>(data);
		list.add(root);
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			System.out.print("Enter no of childer:");
			int n=Integer.parseInt(bread.readLine());
			for(int i=0;i<n;i++){
				System.out.print("Enter data:");
				data=Integer.parseInt(bread.readLine());
				System.out.println();
				Node<Integer> child=new Node<>(data);
				node.list.add(child);
				list.add(child);
			}

		}
		return root;
	}
	
	private static void printLevelWise(Node<Integer> root){
		LinkedList<Node<Integer>> list=new LinkedList<>();
		list.add(root);
		list.add(null);
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			if(node!=null){
				System.out.print(node.data+" ");
				for(Node<Integer> child:node.list){
					list.add(child);
				}
			}
			else{
				System.out.println();
				if(list.size()==0){
					break;
				}
				list.add(null);
			}
		}

	}
	private static int countNodesRec(Node<Integer> root){
		if(root==null){
			return 0;
		}
		int ans=1;
		for(Node<Integer> node:root.list){
			ans+=countNodesRec(node);
		}
		return ans;
	}

	private static int countNodesItr(Node<Integer> root){
		LinkedList<Node<Integer>> list=new LinkedList<>();
		list.add(root);
		int count=0;
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			count++;
			for(Node<Integer> child:node.list){
				list.add(child);
			}
		}
		return count;
	}

	private static long sumNodesRec(Node<Integer> root){
		if(root==null){
			return 0;
		}
		long ans=root.data;
		for(Node<Integer> child:root.list){
			ans+=sumNodesRec(child);
		}
		return ans;
	}

	private static long sumNodesIter(Node<Integer> root){
		LinkedList<Node<Integer>> list=new LinkedList<>();
		long count=0;
		list.add(root);
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			count+=node.data;
			for(Node<Integer> child:node.list){
				list.add(child);
			}
		}
		return count;
	}

	private static int maxNodeRec(Node<Integer> root){
		if(root==null){
			return -1;
		}
		int max=root.data;
		for(Node<Integer> node: root.list){
			max=Math.max(max,maxNodeRec(node));
		}
		return max;
	}

	private static int maxNodeItr(Node<Integer> root){
		LinkedList<Node<Integer>> list=new LinkedList<>();
		int max=-1;
		list.add(root);
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			max=Math.max(max,node.data);
			for(Node<Integer> child:node.list){
				list.add(child);
			}
		}
		return max;
	}

	private static int heightRec(Node<Integer> root){
		if(root==null){
			return -1;
		}
		int height=0;
		for(Node<Integer> node:root.list){
			height=Math.max(height,heightRec(node));
		}
		return height+1;
	}

	private static int heightItr(Node<Integer> root){
		LinkedList<Node<Integer>> list=new LinkedList<>();
		list.add(root);
		list.add(null);
		int height=1;
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			if(node!=null){
				for(Node<Integer> child:node.list){
					list.add(child);
				}
			}
			else{
				if(list.size()==0){

					break;
				}
				height++;
				list.add(null);	
			}

		}
		return height;
	}

	private static int leafNodeRec(Node<Integer> root){
		if(root==null)
		{	
			return 0;
		}
		if(root.list.size()==0){
			return 1;
		}
		int count=0;
		for(Node<Integer>  node:root.list){
			count+=leafNodeRec(node);
		}
		return count;
	}

	private static int leafNodeItr(Node<Integer> root){
		LinkedList<Node<Integer>> list=new LinkedList<>();
		list.add(root);
		int count=0;
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			if(node.list.size()==0){
				count++;
			}
			for(Node<Integer> child:node.list){
				list.add(child);
			}
		}
		return count;

	}

	private static void postOrderRec(Node<Integer> root){
		if(root==null)
			return;
		for(Node<Integer> node:root.list){
			postOrderRec(node);
		}
		System.out.print(root.data+" ");
	}

	private static Node<Integer> childWithMaxNodesRec(Node<Integer> root){
		if(root==null){
			return root;
		}
		Node<Integer> max=root;
		for(Node<Integer> node:root.list){
			Node<Integer> child=childWithMaxNodesRec(node);
			max=max.list.size()>child.list.size()?max:child;
		}
		return max;
	}

	private static Node<Integer> childWithMaxNodesItr(Node<Integer> root){
		if(root==null){
			return root;
		}
		LinkedList<Node<Integer>> list=new LinkedList<>();
		list.add(root);
		Node<Integer> max=root;
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			max=max.list.size()>node.list.size()?max:node;
			for(Node<Integer> child:node.list){
				list.add(child);
			}
		}
		return max;			
	}

	private static boolean identicalRec(Node<Integer> root1,Node<Integer> root2){
		if(root1==null && root2==null){
			return true;
		}
		if(root1.list.size()!=root2.list.size()){
			return false;
		}
		if(root1.data!=root2.data){
			return false;
		}
		for(int i=0;i<root1.list.size();i++){
			boolean res=identicalRec(root1.list.get(i),root2.list.get(i));
			if(!res){
				return false;
			}
		}
		return true;

	}

	private static boolean identicalItr(Node<Integer> root1,Node<Integer> root2){
		if(root1.data!=root2.data){
			return false;
		}
		LinkedList<Node<Integer>> list1=new LinkedList<>();
		LinkedList<Node<Integer>> list2=new LinkedList<>();
		list1.add(root1);
		list2.add(root2);
		while(!list1.isEmpty() || !list2.isEmpty()){
			Node<Integer> node1=list1.pollFirst();
			Node<Integer> node2=list2.pollFirst();
			if(node1.data!=node2.data){
				return false;
			}
			if(node1.list.size()!=node2.list.size()){
				return false;
			}
			for(int i=0;i<node1.list.size();i++){
				list1.add(node1.list.get(i));
				list2.add(node2.list.get(i));
			}


		}
		return true;

	}

	private static Node<Integer> nextLarger(Node<Integer> root,int n){
		if(root==null){
			return null;
		}
		Node<Integer> max=null;
		if(root.data>n){
			max=root;
		}
		for(Node<Integer> node:root.list){
			Node<Integer> child=nextLarger(node,n);
			if(child!=null){
				if(max==null){
					max=child;
				}
				else{
					max=max.data<child.data?max:child;
				}
			}
		}
		return max;
	}

	private static void postOrderItr(Node<Integer> root){


	}
	private static class NodeSum{
		int sum;
		Node<Integer> node;
		public NodeSum(int sum,Node<Integer> node)
		{
			this.sum=sum;
			this.node=node;
		}

		public String toString(){
			return "sum is:"+this.sum+" node is:"+this.node.data;
		}
	
	}

	private static NodeSum nodeWithMaxSumRec(Node<Integer> root){
		if(root==null){
			return null;
		}
		int sum=root.data;
		for(Node<Integer> node:root.list){
			sum+=node.data;
		}
		NodeSum maxSum=new NodeSum(sum,root);
		for(Node<Integer> child:root.list){
			NodeSum nodeSum=nodeWithMaxSumRec(child);
			if(maxSum.sum<nodeSum.sum){
				maxSum.sum=nodeSum.sum;
				maxSum.node=nodeSum.node;
			}
		}
		return maxSum;
	}

	private static Node<Integer> nodeWithMaxSumItr(Node<Integer> root){
		if(root==null)
			return null;
		LinkedList<Node<Integer>> list=new LinkedList<>();
		list.add(root);
		Node<Integer> maxNode=null;
		int max=-1;
		while(!list.isEmpty()){
			Node<Integer> node=list.pollFirst();
			int sum=node.data;
			for(Node<Integer> child:node.list){
				sum+=child.data;
				list.add(child);
			}
			if(max<sum){
				max=sum;
				maxNode=node;
			}
		}
		return maxNode;
	}

	private static Node<Integer> replaceWithDepth(Node<Integer> root){
		if(root==null){
			return null;
		}
		for(Node<Integer> node:root.list){
			node.data=root.data+1;
			Node<Integer> child=replaceWithDepth(node);
			
		}
		return root;	
	}

	public static void main(String[] args) throws IOException{
		
		Node<Integer> root=makeTreeBfs();
		printTreeDfs(root);
		printLevelWise(root);
		System.out.println(countNodesRec(root));
		System.out.println(countNodesItr(root));
		System.out.println(sumNodesRec(root));
		System.out.println(sumNodesIter(root));
		System.out.println(maxNodeRec(root));
		System.out.println(maxNodeItr(root));
		System.out.println(heightRec(root));
		System.out.println(heightItr(root));
		System.out.println(leafNodeRec(root));
		System.out.println(leafNodeItr(root));
		postOrderRec(root);
		System.out.println();
		System.out.println(childWithMaxNodesRec(root).data);
		System.out.println(childWithMaxNodesItr(root).data);
		System.out.println(nextLarger(root,21).data);
		System.out.println(nodeWithMaxSumRec(root));
		System.out.println(nodeWithMaxSumItr(root).data);
		root.data=0;
		printLevelWise(replaceWithDepth(root));
		/*Node<Integer> root2=makeTreeBfs();
		printTreeDfs(root2);
		System.out.println(identicalRec(root,root2));
		System.out.println(identicalItr(root,root2));*/

	}


}

