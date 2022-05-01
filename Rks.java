import java.util.*;
import java.io.*;
class Rks{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String[] in=bread.readLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int k=Integer.parseInt(in[1]);
			HashSet<Integer> rows=new HashSet<>();
			HashSet<Integer> cols=new HashSet<>();
			//o(n)
			for(int i=1;i<=n;i++){
				rows.add(i);
				cols.add(i);
			}
			//o(k)
			while(k-->0){
				String[] s=bread.readLine().split(" ");
				int i=Integer.parseInt(s[0]);
				int j=Integer.parseInt(s[1]);
				rows.remove(new Integer(i));
				cols.remove(new Integer(j));
			}
			//map //
			int size=rows.size()>cols.size()?cols.size():rows.size();
			System.out.print(size+" " );
			if(rows.size()>cols.size()){
				printFunc(cols,rows);
			}
			else{
				printFunc(rows,cols);
			}
			System.out.println();
		}

	}
	private static void printFunc(HashSet<Integer> first,HashSet<Integer> second){
		Iterator f_itr=first.iterator();
		Iterator s_itr=second.iterator();
		while(f_itr.hasNext() && s_itr.hasNext()){
			System.out.print(f_itr.next()+" "+s_itr.next()+" ");

		}

	}

}
