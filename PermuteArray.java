import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.IntStream;
class PermutateArray {
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			PermutateArray pa=new PermutateArray();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=i+1;
			}
			List<List<Integer>> permute = pa.permute(arr);
			if(permute.size()!=0){
			for(Integer perm:permute.get(0))
			{
				System.out.print(perm+" ");
			}
			System.out.println();
			}
			else{
				System.out.println("-1");
	
			}
		}
	}
	public List<List<Integer>> permute(int[] arr) {
		List<List<Integer>> list = new ArrayList<>();
		permuteHelper(list, new ArrayList<>(), arr);
		return list;
	}
 
	private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr){
		if(list.size()!=1){
			if(resultList.size() == arr.length){
				list.add(new ArrayList<>(resultList));
			} 
			else{
				for(int i = 0; i < arr.length; i++){ 
					if(resultList.contains(arr[i])) 
					{
						continue;
					}
					if(resultList.size()>=1){
						if((resultList.get(resultList.size()-1)&arr[i])!=0){	
						resultList.add(arr[i]);
						permuteHelper(list, resultList, arr);
						resultList.remove(resultList.size() - 1);
						}
					}
					else{
						resultList.add(arr[i]);
						permuteHelper(list, resultList, arr);
						resultList.remove(resultList.size() - 1);
					}
				}
			}
		}
	} 
 
}

