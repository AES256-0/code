import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Playfit{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int max=0;
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
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			int n=Integer.parseInt(bread.readLine());
			int[] arr=readInput(n);
			if(n==1){

				System.out.println("UNFIT");
			}
			else{	
				sort(arr,0,n-1);
				if(max==0){
					System.out.println("UNFIT");
				}
				else{
					System.out.println(max);
				}
			}
			max=0;
			}
			

		}


	
    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];



        int i = 0, j = 0;

        int k = l;
	int ln=L.length;
	int rn=R.length;
	//max=Math.max(L[ln-1]-L[i],max);
	
//	max=Math.max(R[rn-1]-R[i],max);
//	max=Math.max(L[ln-1]-R[i],max);
	max=Math.max(R[rn-1]-L[i],max);
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }



}
