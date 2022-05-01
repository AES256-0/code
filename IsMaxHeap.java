import java.io.*;
import java.util.*;
class IsMaxHeap{
	public static void main(String[] args)
	{
		int[] arr={0,42,20,18,21,14,11,9,4};
		System.out.println(isMaxHeap(arr));

	}
	private static boolean isMaxHeap(int[] arr){
		int index=1;
		boolean isHeap=true;
		while(index<=arr.length){
			int left=2*index;
			if(left>arr.length)
				break;
			int right=2*index+1;
			if(right>arr.length)
				break;
			if(!(arr[index]>arr[left] && arr[index]>arr[right])){
				isHeap=false;
				break;
			}
			index++;	

		}
		return isHeap;
	}

}
