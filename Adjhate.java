import java.util.*;
import java.io.*;
class Adjhate{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static int[] readInput(int len) throws IOException{
		int[] arr=new int[len];
		int i=0;
		StringTokenizer s=new StringTokenizer(bread.readLine());
		while(s.hasMoreTokens()){
			arr[i++]=Integer.parseInt(s.nextToken());
		}
		return arr;
	}
	public static void main(String[] args) throws IOException{
		FastReader fr=new FastReader();
		int t=fr.nextInt();
		while(t-->0){
			int n=fr.nextInt();
			int arr[]=new int[n];
			int ec=0,oc=0;
			for(int i=0;i<n;i++){
				arr[i]=fr.nextInt();
				if(arr[i]%2==0){
					ec++;
				}
				else{
					oc++;
				}

			}
			if(ec==0 || oc==0){
				System.out.println("-1");	
			}
			else{
				int start=0;
				int end=arr.length-1;
				while(start<end){
					if(arr[start]%2!=0){
						if(arr[end]%2==0){
						int te=arr[end];
						arr[end]=arr[start];
						arr[start]=te;
						start++;

						}
						end--;
					}
					else{
						start++;
					}

				}
				for(int j:arr){
					System.out.print(j+" ");
				}	
				System.out.println();
			}
		}

	}
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(
                new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}


