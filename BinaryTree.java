import java.util.LinkedList;
import java.util.TreeSet;
public class BinaryTree{
	private Node root;
	private static class Node{
		int data;
		Node left;
		Node right;
		public Node(){}
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}

	}
	public BinaryTree(int data){
		this.root=new Node(data);
	}
	public BinaryTree(){
		this.root=null;
	}
	public boolean insert(Node node,int data){
		if(node==null){
			node=new Node(data);
		}
		else{		
			if(node.data<=data){
				if(node.right!=null){
					insert(node.right,data);
				}
				else{
					node.right=new Node(data);
				}
			}
			else{
				if(node.left!=null){
					insert(node.left,data);
				}
				else{
					node.left=new Node(data);
				}
			}
		}
		return true;
	}
	public void preOrder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder(Node root){
		if(root==null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	
	}
	public void postOrder(Node root){
		if(root==null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

	public void levelTraversal(Node root){
		LinkedList<Node> list=new LinkedList<Node>();
		list.add(root);
		while(list.size()!=0){
			Node fn=list.pollFirst();
			if(fn.left!=null)
				list.add(fn.left);
			if(fn.right!=null)
				list.add(fn.right);
			System.out.print(fn.data+" ");
		}
	}
	public boolean insertBt(Node root,int data){
		if(root==null){
			root=new Node(data);
		}
		else{
			LinkedList<Node> list=new LinkedList<Node>();
			list.add(root);
			while(list.size()!=0){
				Node fn=list.pollFirst();
				if(fn.left!=null){
					list.add(fn.left);
				}
				else{
					fn.left=new Node(data);
					return true;
				}
				if(fn.right!=null){
					list.add(fn.right);

				}
				else{
					fn.right=new Node(data);
					return true;
				}
			}
		}
		return true;
	}
	public Node deepestNode(Node root){
		LinkedList<Node> list=new LinkedList<Node>();
		list.add(root);
		Node temp=null;
		while(list.size()!=0){
			 temp=list.pollFirst();
			if(temp.left!=null)
				list.add(temp.left);
			if(temp.right!=null)
				list.add(temp.right);
		}
		return temp;
	}



	/*public boolean deleteNode(Node root,Node toDelete){
		LinkedList<Node> list=new LinkedList<Node>();
		list.add(root);
		Node lastNode=null,dlt=null;
		boolean flag=true;
		while(list.size()!=0){
			lastNode=list.pollFirst();
			if(lastNode==toDelete && flag){
				dlt=lastNode;
				flag=false;
			}
			if(lastNode.left!=null)
			{	
				list.add(lastNode.left);
			}
			if(lastNode.right!=null){
				list.add(lastNode.right);
			}
		}
		return true;
		
	}*/
	public boolean delete(Node root,int data){
		LinkedList<Node> list=new LinkedList<Node>();
		list.add(root);
		Node find=null,temp=null;
		while(list.size()!=0){
			temp=list.pollFirst();
			if(temp.data==data){
				find=temp;
			}
			if(temp.left!=null){
				list.add(temp.left);
			}
			if(temp.right!=null){
				list.add(temp.right);
			}
		}
		if(find!=null){
			deleteDeepestNode(root,temp);
			find.data=temp.data;
			return true;
		}
		return false;
	}
	public void deleteDeepestNode(Node root,Node delNode){
		LinkedList<Node> list=new LinkedList<Node>();
		list.add(root);
		Node temp=null;
		while(list.size()!=0){
			temp=list.pollFirst();
			if(temp==delNode){
				temp=null;
				return;
			}
			if(temp.left!=null){
				if(temp.left==delNode){
					temp.left=null;
					return;
				}
				list.add(temp.left);
			}
			if(temp.right!=null){
				if(temp.right==delNode){
					temp.right=null;
					return;
				}
				list.add(temp.right);
			}
		}
		
	}
	public Node searchBst(Node root,int data){
		/*if(root==null){
			return null;
		}
		if(root.data==data){
			return root;
		}
		if(root.data<data){
			return searchBst(root.right,data);
		}
		else if(root.data>=data){
			return searchBst(root.left,data);
		}
		return null;*/
		if(root==null || root.data==data){
			return root;
		}
		if(root.data<data)
			return searchBst(root.right,data);
		return searchBst(root.left,data);
	}
	public static Node construct(int[] pre,int[] in,int plo,int phi,int ilo,int ihi){
		if(plo>phi || ilo>ihi){
			return null;
		}
		Node nn=new Node();
		nn.data=pre[plo];
		int si=-1;
		for(int i=ilo;i<=ihi;i++){
			if(pre[plo]==in[i]){
				si=i;
				break;	
			}
		}
		int nel=si-ilo;
		nn.left=construct(pre,in,plo,plo+nel,ilo,si-1);
		nn.right=construct(pre,in,plo+nel+1,phi,si+1,ihi);
		return nn;


	}
	public int height(Node root,TreeSet<Integer> set){
		if(root==null){
			return -1;
		}
		int left=0,right=0;
		left=height(root.left,set);
		right=height(root.right,set);
		set.add(left+right+2);
		if(left>right)
			return left+1;
		return right+1;
	}
	public int diameter(Node root,TreeSet<Integer> set){
		height(root,set);
		return set.last();

	}
	/*
	public int balanced(Node root){
		if(root==null){
			return -1;
		}
		int left=balanced(root.left);
		int right=balanced(root.right);
		if(Math.abs(left-right)>1){
			flag=true;	
		}
	}*/
	public void deleteBst(Node root,Node prev,int key){
		if(root==null)
			return;
		if(root.data==key){
			if(root.left==null&&root.right==null){
				if(prev.left==root){
					prev.left=null;
				}
				else{
					prev.right=null;
				}				
			}
			else if(root.left==null || root.right==null){
				Node temp=null;
				temp=root.left!=null?root.left:root.right;
				if(prev.left==root){
					prev.left=temp;
				}
				else{
					prev.right=temp;
				}				
			}
			else{
				
			}
			return ;			
		}
		if(root.data<=key){
			deleteBst(root.right,root,key);
		}
		else{
			deleteBst(root.left,root,key);
		}

	}


	public static void main(String... args){
		BinaryTree bt=new BinaryTree(10);
		bt.insert(bt.root,5);
		bt.insert(bt.root,11);
		bt.insert(bt.root,12);
		bt.insert(bt.root,6);
		bt.insert(bt.root,7);
		bt.insert(bt.root,8);
		bt.insert(bt.root,9);
		bt.insert(bt.root,4);
		bt.insert(bt.root,3);
		bt.insert(bt.root,2);
		bt.insert(bt.root,1);
	/*	bt.insert(bt.root,13);
		bt.insert(bt.root,14);
		bt.insert(bt.root,15);
		bt.insert(bt.root,16);
	*/	
		bt.inOrder(bt.root);
		System.out.println();
		bt.preOrder(bt.root);
		System.out.println();
		bt.postOrder(bt.root);
		System.out.println();
		bt.levelTraversal(bt.root);
	//	System.out.println(bt.deepestNode(bt.root).data);
	//	System.out.println(bt.searchBst(bt.root,120));
	//	System.out.println(bt.searchBst(bt.root,4).data);
	//	System.out.println(bt.delete(bt.root,5));
	//	System.out.println(bt.delete(bt.root,19));
		
		bt.levelTraversal(bt.root);
		TreeSet<Integer> set=new TreeSet<Integer>();
		//System.out.println("\n"+bt.height(bt.root,set));
		System.out.println("\n"+bt.diameter(bt.root,set));
	}
}
