import java.util.*;
class SegmentTree{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		int[] tree=new int[2*arr.length];
		buildTree(arr,tree,0,4,1);
		System.out.println(Arrays.toString(tree));
		updateTree(arr,tree,0,4,1,4,10);
		
		System.out.println(Arrays.toString(tree));
		System.out.println(query(tree,0,4,1,2,4));
	}
	public static void buildTree(int[] arr,int[] tree,int start,int end,int in){
		if(start==end){
			tree[in]=arr[start];
			return;
		}
		int mid=(start+end)/2;
		buildTree(arr,tree,start,mid,2*in);
		buildTree(arr,tree,mid+1,end,2*in+1);
		tree[in]=tree[2*in]+tree[2*in+1];
	}
	public static void updateTree(int[] arr,int[] tree,int start,int end,int in,int idx,int val){
		if(start==end){
			arr[idx]=val;
			tree[in]=arr[idx];
			return;
		}
		int mid=(start+end)/2;
		if(val>mid){
			updateTree(arr,tree,mid+1,end,2*in+1,idx,val);
		}
		else{
			updateTree(arr,tree,start,mid,2*in,idx,val);
		}
		tree[in]=tree[2*in]+tree[2*in+1];
	}
	public static int query(int[] tree,int start,int end,int treeNode,int left,int right){
		if(right<start || left>end)
			return 0;
		if(left<=start && end<=right){
			return tree[treeNode];
		}
		int mid=(start+end)/2;
		return query(tree,start,mid,2*treeNode,left,right)+query(tree,mid+1,end,2*treeNode+1,left,right);

	}


}
