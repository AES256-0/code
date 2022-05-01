class BinaryTree{
	Node root;
	private static class Node{
		int data;
		Node left,right;
		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	
	}
	public BinaryTree(){

	}
	public BinaryTree(int data){
		this.root=new Node(data);

	}
	public static void main(String[] args){
		BinaryTree bt=new BinaryTree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
	}
}
