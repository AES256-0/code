class Maxxor{
	
	private static class Trienode{
		Trienode left;
		Trienode right;
	}
	public static void insert(int n,Trienode head){
		Trienode curr=head;
		for(int i=31;i>=0;i--){
			int b=(n>>i)&1;
			if(b==0){
				if(curr.left==null){
					curr.left=new Trienode();
				}
				curr=curr.left;

			}
			else{
				if(curr.right==null){
					curr.right=new Trienode();
				}
				curr=curr.right;

			}
		}

	}
	public static int findMaxXorPair(Trienode head,int[] arr,int n){
		int max_xor=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			int value=arr[i];
			Trienode curr=head;
			int cur_xor=0;
			for(int j=31;j>=0;j--){
				int b=(value>>j)&1;
				if(b==0){
					if(curr.right!=null){
						cur_xor+=Math.pow(2,j);
						curr=curr.right;
					}
					else{
						curr=curr.left;
					}
				}
				else{
					if(curr.left!=null){
						cur_xor+=Math.pow(2,j);
						curr=curr.left;
					}
					else{
						curr=curr.right;
					}
				}
			}
			if(cur_xor>max_xor)
				max_xor=cur_xor;
		}
		return max_xor;
	}
	public static void main(String[] args){
		int[] arr={8,1,2,15,10,5};
		Trienode node=new Trienode();
		for(int i=0;i<arr.length;i++){
			insert(arr[i],node);
		}
		System.out.println(findMaxXorPair(node,arr,arr.length));
		
	}
}
