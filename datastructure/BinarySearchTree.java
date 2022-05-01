import java.util.*;
import java.io.*;

class BinarySearchTree{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	private static Node takeInputBFS() throws IOException{
		System.out.print("Enter data:");
		int data=Integer.parseInt(bread.readLine());
		if(data==-1){
			return null;
		}
		LinkedList<Node> list=new LinkedList<>();
		Node root=new Node(data);
		list.add(root);
		while(!list.isEmpty()){
			Node node=list.pollFirst();
			System.out.print("Enter left data:");
			data=Integer.parseInt(bread.readLine());
			if(data==-1){
				node.left=null;
			}
			else{
				node.left=new Node(data);
				list.add(node.left);
			}
			System.out.print("Enter right data:");
			data=Integer.parseInt(bread.readLine());
			if(data==-1){
				node.right=null;
			}
			else{
				node.right=new Node(data);
				list.add(node.right);

			}
		}
		return root;

	}


	public static Node search(Node root,int data){
		if(root==null || root.data==data)
			return root;
		if(root.data<data){
			return search(root.right,data);
		}
		else{
			return search(root.left,data);
		}
	}

	public static Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		if(root.data<data){
			root.right=insert(root.right,data);
		}
		else{
			root.left=insert(root.left,data);
		}	
		return root;

	}

	public static void printBFS(Node root){
		if(root==null)
			return;
		LinkedList<Node> list=new LinkedList<>();
		list.add(root);
		list.add(null);
		while(!list.isEmpty()){
			Node node=list.pollFirst();
			if(node!=null){
				System.out.print(node.data+" ");
				if(node.left!=null)
					list.add(node.left);
				if(node.right!=null)
					list.add(node.right);
				
			}
			else{
				System.out.println();
				if(list.size()==0)
					break;
				list.add(null);
			}
	
		}

	}
	

	private static List<Integer> between(Node root,int k1,int k2){
		List<Integer> list=new LinkedList<>();
		if(root==null)
			return list;
		LinkedList<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node node=queue.pollFirst();
			if(k1<=node.data && node.data<=k2)
				list.add(node.data);
			if(node.left!=null)
				queue.add(node.left);
			if(node.right!=null)
				queue.add(node.right);
		}
		return list;
	}
	
	private static class Balance{
		int min,max;
		boolean isBal;
		public Balance(int min,int max,boolean isBal){
			this.min=min;
			this.max=max;
			this.isBal=isBal;
		}
	}

	public static int min(Node root){
		if(root==null){
			return Integer.MAX_VALUE;
		}
		int left=min(root.left);
		int right=min(root.right);
		return Math.min(root.data,Math.min(left,right));

	}

	public static int max(Node root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		int left=max(root.left);
		int right=max(root.right);
		return Math.max(root.data,Math.max(left,right));

	}

	public static int minNode(Node root){
		while(root.left!=null)
		{
			root=root.left;
		}
		return root.data;
	}
	
	public static boolean isBalance(Node root){
		if(root==null)
			return true;
		boolean left=isBalance(root.left);
		boolean right=isBalance(root.right);
		int l=max(root.left);
		int r=min(root.right);
		boolean ans=(l<root.data && r>root.data )&&left&&right;
		return ans;
	}

	public static Balance isBalanceFast(Node root){
		if(root==null)
			return new Balance(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
		Balance left=isBalanceFast(root.left);
		Balance right=isBalanceFast(root.right);
		boolean ans=left.isBal&&right.isBal&&(root.data<right.min &&root.data>left.max );
		int min=Math.min(root.data,Math.min(left.min,right.min));
		int max=Math.max(root.data,Math.max(left.max,right.max));
		return new Balance(min,max,ans);

	}

	public static void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}

	public static void inOrderRev(Node root){
		if(root!=null){
			inOrderRev(root.right);
			System.out.print(root.data+" ");
			inOrderRev(root.left);
		}
	}

	public static String pathToNode(Node  root,int k){
		if(root==null)
			return null;
		if(root.data==k){
			return String.valueOf(k);
		}
		String ans="";
		if(root.data<k){
			ans=pathToNode(root.right,k);
		}
		if(root.data>k){
			ans=pathToNode(root.left,k);	
		}
		if(ans==null)
			return null;
		return String.valueOf(root.data)+" "+ans;
	}
	
	public static Node makeTree(int[] arr,int start,int end){
		if(arr==null)
			return null;
		if(start>end)
			return null;
		if(start==end){
			return new Node(arr[end]);
		}
		int n=(start+end)/2;
		Node root=new Node(arr[n]);
		root.left=makeTree(arr,start,n-1);
		root.right=makeTree(arr,n+1,end);
		return root;		
	}
	
	public static Node delete(Node root,Node del){
		if(root==null){
			return null;
		}
		if(root.data<del.data){
			root.right=delete(root.right,del);
		}
		if(root.data>del.data){
			root.left=delete(root.left,del);
		}
		else{
			if(root.left==null)
				root=root.right;
			else if(root.right==null)
				root=root.left;
			else{
				root.data=minNode(root.right);
				root.right=delete(root.right,root);
			}


		}
		return root;
	}
	public static Node doubleNode(Node root){
		if(root==null)
			return null;
		Node left=doubleNode(root.left);
		Node right=doubleNode(root.right);
		Node leftP=root.left;
		Node newNode=new Node(root.data);
		root.left=newNode;
		newNode.left=left;
		return root;
	}

	public static String pathFromRoot(Node root,int x){
		if(root==null)
			return "";
		if(root.data==x){
			return String.valueOf(root.data);
		}
		String left=pathFromRoot(root.left,x);
		String right=pathFromRoot(root.right,x);
		String s="";
		if(left.equals("") &&right.equals("")){
			return "";
		}
		return right.equals("")?String.valueOf(root.data)+"_"+left:String.valueOf(root.data)+"_"+right;

	}
	
	public static Node lca(Node root,int x,int y){
		String p=pathFromRoot(root,x);
		String q=pathFromRoot(root,y);
		String[] parr=p.split("_");
		String[] qarr=q.split("_");
		for(int i=parr.length-1;i>=0;i--){
			for(int j=qarr.length-1;j>=0;j--){
				if(parr[i].equals(qarr[j])){
					return new Node(Integer.parseInt(parr[i]));
				}
			}
		}
		return null;
	}

	public static Node lcaFast(Node root,int x,int y){
		if(root==null)
			return root;
		if(root.data==x || root.data==y)
			return root;
		Node left=lcaFast(root.left,x,y);
		Node right=lcaFast(root.right,x,y);
		if(left ==null)
			return right;
		if(right==null)
			return left;
		return root;
	}

	public static Node lcaBst(Node root,int x,int y){
		if(root==null || root.data==x || root.data==y){
			return root;
		}
		if(x<root.data &&root.data<y || x>root.data && root.data>y){
			return root;
		}
		Node ans=null;
		if(root.data>x){
			ans=lcaBst(root.left,x,y);
		}
		else{
			ans=lcaBst(root.right,x,y);
		}
		return ans;

	}

	private static Node replaceWithSum(Node root){
		if(root==null)
			return null;
		LinkedList<Node> list=new LinkedList<>();
	//	list.add(root);
		ArrayList<Node> al=new ArrayList<>();
	/*	while(!list.isEmpty()){
			Node node=list.pollFirst();
			al.add(node);
			if(node.left!=null)
				list.add(node.left);
			if(node.right!=null)
				list.add(node.right);
		}
		Collections.sort(al,(i,j)->{
			Integer x=i.data;
			Integer y=(int)j.data;
			return x.compareTo(y);
		});*/
		Node temp=root;
		while(temp!=null || !list.isEmpty()){
			while(temp!=null){
				list.add(temp);
				temp=temp.left;
			}
			temp=list.pollLast();
			al.add(temp);
			temp=temp.right;
		}
		Map<Integer,Integer> map=new HashMap<>();
		map.put(al.get(al.size()-1).data,al.get(al.size()-1).data);
		for(int i=al.size()-2;i>=0;i--){
			map.put(al.get(i).data,al.get(i).data+map.get(al.get(i+1).data));
		}
		for(Node n:al){
			n.data=map.get(n.data);
		}
		return root;

	}

	private static void rootToLeafSum(Node root,int sum,String ans){
		if(root==null)
			return;
		if(sum==root.data && root.left==null&& root.right==null)
		{
			System.out.println(ans+" "+root.data);
			return;
	
		}
		if(sum<0)
			return;
		if(root==null)
			return;
		rootToLeafSum(root.left,sum-root.data,ans+" "+root.data);
		rootToLeafSum(root.right,sum-root.data,ans+" "+root.data);
	}

	private static void inorderItr(Node root,int d){
		LinkedList<Node> stack=new LinkedList<>();
		ArrayList<Integer> list=new ArrayList<>();
		while(root!=null || !stack.isEmpty()){
			while(root!=null){
				stack.add(root);
				root=root.left;	
			}
			root=stack.pollLast();
			list.add(root.data);
			root=root.right;
		}
		for(int i=0;i<list.size();i++){
			int rem=d-list.get(i);
			if(rem!=list.get(i)){
			int ind=Collections.binarySearch(list,rem);
			if(ind>=0)
				System.out.println(rem+" "+list.get(i));
			}
		}

	}

	private static List<Node> pathsToNode(Node root,int x){
		if(root==null)
			return null;
		if(root.data==x)
		{
			List<Node> list=new ArrayList<>();
			list.add(root);
			return list;
		}
		List<Node> left=pathsToNode(root.left,x);
		List<Node> right=pathsToNode(root.right,x);
		if(left==null && right==null)
			return null;
		if(left!=null){
			 left.add(root);
			 return left;
		}
		if(right!=null)
		{
			 right.add(root);
			 return right;
		}
		return null;

	}

	private static void printKdist(Node root,int dist,int k,List<Node> list){
		if(root==null)
			return;
		if(dist==k){
			System.out.println(root.data);
			return;
		}
		if(!list.contains(root.left))
		printKdist(root.left,dist+1,k,list);
		if(!list.contains(root.right))
		printKdist(root.right,dist+1,k,list);

	}

	private static void kthDist(Node root,int x,int k){
		List<Node> list=pathsToNode(root,x);
		for(int i=0;i<list.size();i++){
			printKdist(list.get(i),i,k,list);
		}
	}
	
	private static int transformBstSum(Node root,int sum){
		if(root==null)
			return 0;
		int right=transformBstSum(root.right,sum);
		int t=root.data;
		root.data=right+root.data+sum;
		int left=transformBstSum(root.left,root.data);
		return left+t+right;

	}

	private static class LargestBst{
		int min;
		int max;
	 	boolean isBst;
		int theight;
		int cheight;
		public LargestBst(int min,int max,boolean isBst,int theight,int cheight){
			this.min=min;
			this.max=max;
			this.isBst=isBst;
			this.theight=theight;
			this.cheight=cheight;
		}
	}

	private static LargestBst getLargestBst(Node root){
		if(root==null)
			return new LargestBst(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0,0);
		LargestBst left=getLargestBst(root.left);
		LargestBst right=getLargestBst(root.right);
   		boolean isBst=left.isBst && right.isBst && root.data >left.max &&root.data <right.min;
		int theight=Math.max(left.theight,right.theight);
		int cheight=Math.max(left.cheight,right.cheight)+1;
		if(isBst){
			theight=Math.max(cheight,theight);
			System.out.println("theight is:"+theight);
		}
		int min=Math.min(root.data,Math.min(left.min,right.min));
		int max=Math.max(root.data,Math.max(left.max,right.max));
		return new LargestBst(min,max,isBst,theight,cheight);
	}

	private static void cousin(Node root,int x,int y){
			List<Node> first=pathsToNode(root,x);
			List<Node> second=pathsToNode(root,y);
			if(first.size()!=second.size()){
				System.out.println("NO");
			}
			else{
				if(first.get(first.size()-2)!=second.get(second.size()-2)){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}

	}

	private static List<Integer> pathToDeepestNode(Node root){
		if(root==null){
			return new ArrayList<>();
		}
		List<Integer> left=pathToDeepestNode(root.left);
		List<Integer> right=pathToDeepestNode(root.right);
		if(left.size()>right.size())
		{
			left.add(root.data);
			return left;
		}
		else{
			right.add(root.data);
			return right;
		}

	}


	private static int count(Node root,int x){
		if(root==null){
			return 0;
		}
		int left=count(root.left,x);
		int right=count(root.right,x);
		return root.data>x?left+right+1:left+right;

	}


	public static void main(String[] args) throws IOException{
		Node root=takeInputBFS();
		printBFS(root);
	/*	System.out.println(between(root,6,10));
		System.out.println(min(root));
		System.out.println(max(root));
		System.out.println(isBalance(root));
		System.out.println(isBalanceFast(root).isBal);
		inOrder(root);
		System.out.println();
		inOrderRev(root);
		System.out.println(pathToNode(root,20));
		root=makeTree(new int[]{1,2,3,4,5,6,7},0,6);
		printBFS(root);
		System.out.println(isBalanceFast(root).isBal);*/

	/*	root=delete(root,new Node(8));
		printBFS(root);
		*/
	/*	String s=pathFromRoot(root,7);
		System.out.println(s);
		//root=doubleNode(root);
		printBFS(root);
		System.out.println(lca(root,2,10).data);
		System.out.println(lcaFast(root,2,10).data);
		System.out.println(lcaBst(root,2,10).data);*/
		//rootToLeafSum(root,13,"");
	//	inorderItr(root,12);
		//System.out.println(pathsToNode(root,3));
		//kthDist(root,3,1);
		//transformBstSum(root,0);
	//	printBFS(root);
	/*	LargestBst ans=getLargestBst(root);
		System.out.println(ans.theight);
		//cousin(root,2,4);
		System.out.println(pathToDeepestNode(root));*/
		System.out.println(count(root,2));

	//	printBFS(replaceWithSum(root));


	}



}
