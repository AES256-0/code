class EvenOdd{

	public static void main(String[] args){

		int[] arr={23,22,21,4,6,8};
		int start=0;
		int end=arr.length-1;
		while(start<end){
			if(arr[start]%2!=0){
				if(arr[end]%2==0){
					int t=arr[end];
					arr[end]=arr[start];
					arr[start]=t;
					start++;
			
				}
				end--;
			}
			else{
				start++;
			}

		}
		for(int i:arr){
			System.out.print(i+" ");
		
		}

	}

}
