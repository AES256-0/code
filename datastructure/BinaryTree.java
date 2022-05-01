import tree.binarytree.BTNode;
import java.io.*;
import java.util.*;
class BinaryTree{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static BTNode<Integer> makeTreeRec() throws IOException{
		System.out.print("Enter data:");
		int data=Integer.parseInt(bread.readLine());
		if(data==-1){
			return null;
		}
		BTNode<Integer> root=new BTNode<>(data);
		root.left=makeTreeRec();
		root.right=makeTreeRec();
		return root;
	}
	private static BTNode<Integer> takeInputBFS() throws IOException{
		System.out.print("Enter data:");
		int data=Integer.parseInt(bread.readLine());
		if(data==-1){
			return null;
		}
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		BTNode<Integer> root=new BTNode<>(data);
		list.add(root);
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			System.out.print("Enter left data:");
			data=Integer.parseInt(bread.readLine());
			if(data==-1){
				node.left=null;
			}
			else{
				node.left=new BTNode<>(data);
				list.add(node.left);
			}
			System.out.print("Enter right data:");
			data=Integer.parseInt(bread.readLine());
			if(data==-1){
				node.right=null;
			}
			else{
				node.right=new BTNode<>(data);
				list.add(node.right);
		
			}
		}
		return root;

	}
	private static void printTree(BTNode<Integer> root){
		if(root==null)
			return;
		System.out.print(root.data+":");
		if(root.left!=null){
			System.out.print("L:"+root.left.data);
		}
		if(root.right!=null){
			System.out.print("R:"+root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}

	private static void printBFS(BTNode<Integer> root){
		if(root==null){
			return;
		}
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		list.add(root);
		list.add(null);
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			if(node!=null){
				System.out.print(node.data+" ");
				if(node.left!=null){
					list.add(node.left);
				}
				if(node.right!=null){
					list.add(node.right);
				}
			}
			else{
				if(list.size()==0)
					break;
				list.add(null);
				System.out.println();
			}
		}
	}

	private static int countNodesRec(BTNode<Integer> root){
		if(root==null){
			return 0;
		}
		int left=countNodesRec(root.left);
		int right=countNodesRec(root.right);
		return 1+left+right;
	}

	private static int countNodesItr(BTNode<Integer> root){
		if(root==null)
			return 0;
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		list.add(root);
		int count=0;
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			count++;
			if(node.left!=null){
				list.add(node.left);
			}
			if(node.right!=null){
				list.add(node.right);
			}
		}
		return count;
	}

	private static boolean isPresentRec(BTNode<Integer> root,int data){
		if(root==null)
			return false;
		if(root.data==data){
			return true;
		}
		boolean left=isPresentRec(root.left,data);
		boolean right=isPresentRec(root.right,data);
		if(left || right)
			return true;
		return false;	

	}

	private static int heightRec(BTNode<Integer> root){
		if(root==null)
			return 0;
		int left=heightRec(root.left);
		int right=heightRec(root.right);
		return 1+Math.max(left,right);
	}
	// 	   1                             1
	//  
	// 	2    3                       3      2
	//
	//    4   5 6   7                  7    6 5    4  
	private static BTNode<Integer> mirrorTree(BTNode<Integer> root){
		if(root==null){
			return null;
		}
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		LinkedList<BTNode<Integer>> newList=new LinkedList<>();
		list.add(root);
		BTNode<Integer> newRoot=new BTNode<>(root.data);
		newList.add(newRoot);
		while(!list.isEmpty()){
			//1 
			//1
			//1.r==3 ,1.l==2
			BTNode<Integer> node=list.pollFirst();
			BTNode<Integer> newNode=newList.pollFirst();
			if(node.right!=null){
					newNode.left=new BTNode<>(node.right.data);
					newList.add(newNode.left);

			}
			if(node.left!=null){
					newNode.right=new BTNode<>(node.left.data);
					newList.add(newNode.right);
			}
			if(node.right!=null){
				list.add(node.right);
			}
			if(node.left!=null){
				list.add(node.left);
			}

		}
		return newRoot;
	}

	private static void postOrder(BTNode<Integer> root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}

	

	private static void postOrderItr(BTNode<Integer> root){
		if(root==null)
			return;
		LinkedList<BTNode<Integer>> stack=new LinkedList<>();
		while(root!=null || !stack.isEmpty()){
			while(root!=null){
				stack.add(root);
				root=root.left;
			}
			BTNode<Integer> node=stack.pollLast();
			if(node.right==null){
				System.out.print(node.data);
			}





		}



	}


	private static void preOrder(BTNode<Integer> root){
		if(root!=null){
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	private static void preOrderItr(BTNode<Integer> root){
		if(root==null)
			return;
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		while(root!=null || !list.isEmpty()){
			while(root!=null){
				System.out.print(root.data+" ");
				list.add(root);
				root=root.left;
			}
			root=list.pollLast();
			root=root.right;
		}
	}


	private static void inOrder(BTNode<Integer> root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}

	private static void inOrderItr(BTNode<Integer> root){
		if(root==null)
			return;
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		while(root!=null || !list.isEmpty()){
			while(root!=null){
				list.add(root);
				root=root.left;
			}
			root=list.pollLast();
			System.out.print(root.data+" ");
			root=root.right;
		}
	}

/*	private static BTNode<Integer> buildTree(int[] inOrder,int[] preOrder,int start,int end,int inOrderIndex){
		if(start>end){
			return null;
		}
		BTNode<Integer> root=new BTNode<>(preOrder[inOrderIndex++]);
		if(start==end){
			return root;
		}
		int index=search(inOrder,start,end);


	}*/

	//           1
	//        2     3
       //     4      5
 //        6     7  
//     8      9 

	private static class Node{
		int height;
		int diameter;
		public Node(int height,int diameter){
			this.height=height;
			this.diameter=diameter;
		}

	}

	public static int diameter(BTNode<Integer> root){
		if(root==null){
			return 0;
		}
		int height=heightRec(root.right)+heightRec(root.left)+1;
		int left=diameter(root.left);
		int right=diameter(root.right);
		return Math.max(height,Math.max(right,left));

	}

	public static Node diameterOn(BTNode<Integer> root){
		if(root==null)
			return new Node(0,0);
		Node left=diameterOn(root.left);
		Node right=diameterOn(root.right);
		int left_h=left.height;
		int right_h=right.height;
		int total_h=left_h+right_h+1;
		int diameter=Math.max(total_h,Math.max(left.diameter,right.diameter));
		return new Node(Math.max(left_h,right_h)+1,diameter);
	}

	private static class MinMax{
		public int min=Integer.MAX_VALUE;
		public int max=Integer.MIN_VALUE;
	}

	public static MinMax minMax(BTNode<Integer> root){
		MinMax minmax=new MinMax();
		if(root==null){
			minmax.min=-1;
			minmax.max=-1;
			return minmax;
		}
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		list.add(root);
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			minmax.min=Math.min(minmax.min,node.data);
			minmax.max=Math.max(minmax.max,node.data);
			if(node.left!=null)
				list.add(node.left);
			if(node.right!=null)
				list.add(node.right);
		}
		return minmax;
	}

	public static int sum(BTNode<Integer> root){
		if(root==null)
			return 0;
		int sum=0;
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		list.add(root);
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			sum+=node.data;
			if(node.left!=null)
				list.add(node.left);
			if(node.right!=null)
				list.add(node.right);

		}
		return sum;

	}

	public static BTNode<Integer> removeLeaf(BTNode<Integer> root){
		if(root==null){
			return null;
		}
		if(root.left==null && root.right==null)
			return null;
		root.left=removeLeaf(root.left);
		root.right=removeLeaf(root.right);
		return root;		
	}
	
	public static void zigzag(BTNode<Integer> root){
		if(root==null)
			return;
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		LinkedList<BTNode<Integer>> val=new LinkedList<>();
		list.add(root);
		list.add(null);
		int count=0;
		String s="";
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			if(node!=null){
				if(count%2==0){
					s+=" "+node.data;
				}
				else{
					s=node.data+" "+s;
				}
				if(node.left!=null){
					list.add(node.left);
				}
				if(node.right!=null){
					list.add(node.right);
				}

			}
			else{
				if(count%2==0){
					System.out.println(s.trim());
				}
				else{
					System.out.println(s.trim());
				}
				if(list.isEmpty()){
					break;
				}
				list.add(null);
				s="";
				count++;
			}
		}
	}

	public static void noSibling(BTNode<Integer> root){
		if(root==null)
			return;
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		list.add(root);
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			if((node.left==null && node.right!=null)||(node.left!=null &&node.right==null) ){
				if(node.left==null){
					System.out.print(node.right.data+" ");
				}
				else{
					System.out.print(node.left.data+" ");
				}

			}
			if(node.left!=null){
				list.add(node.left);
			}
			if(node.right!=null){
				list.add(node.right);
			}
		}

	}


	public static BTNode<Integer> delete(BTNode<Integer> root,BTNode<Integer> delete){
		LinkedList<BTNode<Integer>> list=new LinkedList<>();
		if(root==null)
			return root; 
		list.add(root);
		Map<Integer,BTNode<Integer>> map=new HashMap<>();
		BTNode<Integer> last=null,del=null;
		while(!list.isEmpty()){
			BTNode<Integer> node=list.pollFirst();
			if(node.data==delete.data){
				del=node;
			}
			if(node.left!=null){
				map.put(node.left.data,node);
				list.add(node.left);
			}
			if(node.right!=null){
				map.put(node.right.data,node);
				list.add(node.right);
			}
			last=node;		
		}
		int data=last.data;
		del.data=data;
		if(map.get(data).left.data==data){
			map.get(data).left=null;
		}
		else{
			map.get(data).right=null;
		}
		return root;
	}



	private static class Balance{
		int h;
		boolean bal;
		public Balance(int h,boolean bal){
			this.h=h;
			this.bal=bal;
		}

	}
	

	public static Balance isBalance(BTNode<Integer> root){
		if(root==null)
			return new Balance(0,true);
		Balance left=isBalance(root.left);
		Balance right=isBalance(root.right);
		boolean isBal=Math.abs(left.h-right.h)<=1?true:false;
		int height=Math.max(left.h,right.h)+1;
		return new Balance(height,isBal&&left.bal&&right.bal);
	}


	public static void main(String[] args) throws IOException{
		BTNode<Integer> root=takeInputBFS();
		printTree(root);
		printBFS(root);
		/*System.out.println();
		System.out.println(countNodesRec(root));
		System.out.println(countNodesItr(root));
		System.out.println(isPresentRec(root,10));
		System.out.println(heightRec(root));
		BTNode<Integer> newRoot=mirrorTree(root);
		System.out.println();
		printBFS(newRoot);
		System.out.println();
		printTree(newRoot);
		System.out.println();
		postOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		preOrderItr(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		inOrderItr(root);
		System.out.println();
		System.out.println(diameter(root));
		System.out.println(diameterOn(root).diameter);
		MinMax mM=minMax(root);
		System.out.println(mM.min+" "+mM.max);
		System.out.println(sum(root));*/
	//	printBFS(removeLeaf(root));
		System.out.println();
		printBFS(delete(root,new BTNode<Integer>(2)));
	//	zigzag(root);
	//	noSibling(root);
	//	System.out.println(isBalance(root).bal);
	}


}
