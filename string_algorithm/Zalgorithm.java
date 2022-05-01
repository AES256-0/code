//time complexity O(n) n=length of text + pattern +1
//inside computeZArray ,while loop only runs till r reaches n so outer loop n times and while loop n times so total = 2n i.e O(n)



class Zalgorithm{
	public static void main(String[] args){
		String s="abc$abcabcdabcabcf";
		int[] zarr=new int[s.length()];
		computeZArray(s,zarr);
		for(int i=0;i<zarr.length;i++){
			if(zarr[i]==3){
				System.out.println(i-4);
			}
		}
	}
	private static void computeZArray(String s,int[] arr){
		int n=s.length();
		int l=0,r=0;
		for(int i=1;i<n;i++){
			if(i>r){
				l=r=i;
				while(r<n && s.charAt(r-l)==s.charAt(r))
					r++;
				arr[i]=r-l;
				r--;

			}
			else{
				int j=i-l;
				if(arr[j]<r-i+1){
					arr[i]=arr[j];
				}
				else{
					l=i;
					while(r<n&&s.charAt(r-l)==s.charAt(r))
						r++;
					arr[i]=r-l;
					r--;

				}
			}

		}
	}

}
