class Insertionsort{
	public static int[] sort(int[] array){
		for(int j=1;j<array.length;j++){
			int element=array[j];
			int i=j-1;
			while(i>=0 && array[i]>element){
				array[i+1]=array[i];
				i--;

			}
			array[i+1]=element;
		
		}
		return array;

	}
	public static void main(String[] args){
		int[] arr={3,2,4,5,1};
		sort(arr);
		for(int i:arr){
		System.out.println(i);
		
		}



	}

}
