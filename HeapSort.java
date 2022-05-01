import java.util.*;
class HeapSort{
	//nlgn ==> for each n ==>lgn
	private static void makeHeap(int[] arr){
		int index=2;
		while(index<=arr.length-1){
			int child=index;
			int parent=index/2;
			while(child>1){
				if(arr[child]>arr[parent]){
					int t=arr[child];
					arr[child]=arr[parent];
					arr[parent]=t;
				}
				else{
					break;
				}
				child=parent;
				parent=child/2;
	
			}
			index++;
		}
	
	}
	
	//7 6 5 2 3 1
	//1 6 5 2 3                7
	private static void heapSort(int[] arr){
		
		int size=arr.length;
		while(size>1){
			int t=arr[1];
			arr[1]=arr[size-1];
			arr[size-1]=t;

			size--;
			int parent=1;
			int left=2*parent;
			int right=2*parent+1;
			while(left<size){
				int max=parent;
				if(arr[parent]<arr[left])
					max=left;
				if(right<size && arr[max]<arr[right])
					max=right;
				if(max==parent)
					break;
				int temp=arr[parent];
				arr[parent]=arr[max];
				arr[max]=temp;
				parent=max;
				left=2*parent;
				right=2*parent+1;

			}

		
		}
	

	}

	public static void main(String[] args){
		int[] arr={0,6,2,1,3,7,5};
		makeHeap(arr);
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));

	}





}
