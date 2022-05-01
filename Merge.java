class Merge{
		private static void mergeSort(int arr[],int p,int q){
			if(p<q){
				int d=p+(q-p)/2;
				mergeSort(arr,p,d);
				mergeSort(arr,d+1,q);
				combine(arr,p,d,q);
				
			}
		}
		private static void combine(int arr[],int p,int d,int q){
			int n1=d-p+2;
			int n2=q-d+1;
			System.out.println("n1:"+n1+"n2:"+n2);
			int left[]=new int[n1];
			int right[]=new int[n2];
			for(int i=0;i<n1;i++){
				left[i]=arr[p+i];
			}
			for(int j=0;j<n2;j++){
				right[j]=arr[d+j+1];
			}
			left[n1]=Integer.MAX_VALUE;
			right[n2]=Integer.MAX_VALUE;
			int i=0;
			int j=0;
			for(int k=p;k<q;k++){
				if(left[i]<=right[j]){
					arr[k]=left[i];
					i++;
				}
				else{
					arr[k]=right[j];
					j++;
				}
			}

		}
		public static void main(String[] args){
			int[] arr={4,3,2,1,5,6};
			mergeSort(arr,0,arr.length);
			for(int i:arr){
				System.out.println(i);

			}
		
		}

}
