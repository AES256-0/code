
import java.io.*; 
import java.util.*; 
import java.lang.Math; 
class Unsquers{
	
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static int lengthOfLIS(int[] nums) {

		if(nums == null || nums.length == 0) return 0;

    int [] dp = new int[nums.length];
    int len = 0;

    for(int num : nums){
        int index = Arrays.binarySearch(dp, 0, len, num);

        if(index < 0)
            index = -(index+1);
        dp[index] = num;

        if(index == len)
            len++;
    }

    return len;
}
	  /*static int CeilIndex(int A[], int l, int r, int key) 
    { 
        while (r - l > 1) { 
            int m = l + (r - l) / 2; 
            if (A[m] >= key) 
                r = m; 
            else
                l = m; 
        } 
  
        return r; 
    } 
  
    static int LongestIncreasingSubsequenceLength(int A[], int size) 
    { 
        // Add boundary case, when array size is one 
  
        int[] tailTable = new int[size]; 
        int len; // always points empty slot 
  
        tailTable[0] = A[0]; 
        len = 1; 
        for (int i = 1; i < size; i++) { 
            if (A[i] < tailTable[0]) 
                // new smallest value 
                tailTable[0] = A[i]; 
  
            else if (A[i] > tailTable[len - 1]) 
                // A[i] wants to extend largest subsequence 
                tailTable[len++] = A[i]; 
  
            else
                // A[i] wants to be current end candidate of an existing 
                // subsequence. It will replace ceil value in tailTable 
                tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i]; 
        } 
  
        return len; 
    } 
	*/




	private static int[] readInput(int n) throws IOException{
		int[] arr=new int[n];
		int i=0;
		StringTokenizer st=new StringTokenizer(bread.readLine());
		while(st.hasMoreTokens()){
			arr[i++]=Integer.parseInt(st.nextToken());
		}
		return arr;

	}
	public static void main(String[] args) throws IOException{
		String[] test=bread.readLine().split(" ");
		int n=Integer.parseInt(test[0]);
		int q=Integer.parseInt(test[1]);
		int s=Integer.parseInt(test[2]);
		int[] H=readInput(n);
		int[][] dp=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			dp[i][i]=1;
			int temp=H[i-1];
			int count=1;
			for(int j=i+1;j<=n;j++){
				if(temp<H[j-1]){
					dp[i][j]=++count;
					temp=H[j-1];
				}
				else{

					dp[i][j]=count;
				}
		

			}
		}
		int last=0;
		while(q-->0){
			//max_ref=0;
			String[] xy=bread.readLine().split(" ");
			int x=Integer.parseInt(xy[0]);
			int y=Integer.parseInt(xy[1]);
			int L=(x+s*last-1)%n+1;
			int R=(y+s*last-1)%n+1;
			if(L>R){
				int temp=R;
				R=L;
				L=temp;
			}
			int sat=0;
			int max=-1;
			// int[] subArray = Arrays.copyOfRange(H,L-1, R);
		//	sat=lengthOfLIS(subArray);
			for(int i=L;i<=R;i++){
				max=Math.max(max,dp[i][R]);
			}
			last=max;
			System.out.println(max);

		}



	}
}
