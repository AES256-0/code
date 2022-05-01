class Inver{
	public static void main(String[] args){


		int[] arr={2,3,8,6,1};
		int count=0;
		int i=0;
		int j=i+1;
		while(count!=5){
			if(arr[i]<arr[j]){
				System.out.println("{"+arr[i]+","+arr[j]+"}");
				count++;
			}
			if(j==arr.length-1){
				i++;
				j=i+1;
				continue;

			}
			
			j++;



		}


	}
}
