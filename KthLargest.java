import java.io.*;
import java.util.*;
class KthLargest{
	private static int kth(int[] arr){
		PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->i>j?1:-1);
		for(int i:arr){
			pq.add(i);
			if(pq.size()>4){

				pq.poll();
			}
		}
		System.out.println(pq);
		return -1;

	}
	public static void main(String[] args){
		int[] arr={2,6,10,11,13,4,1,20};
		kth(arr);
		


	}

}
