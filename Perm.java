import java.util.ArrayList;
class Perm{
public static ArrayList<ArrayList<Integer>> permute(int[] num) {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	result.add(new ArrayList<Integer>());
	for (int i = 0; i < num.length; i++) {
		ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
		for (ArrayList<Integer> l : result) {
			for (int j = 0; j < l.size()+1; j++) {
				System.out.println("i:"+i+" l:"+l);
				l.add(j, num[i]);
				ArrayList<Integer> temp = new ArrayList<Integer>(l);
				current.add(temp);
				System.out.println("current:"+current);
				l.remove(j);
			}
		}

		result = new ArrayList<ArrayList<Integer>>(current);
	}

	return result;
}

	public static void main(String[] args){

	 ArrayList<ArrayList<Integer>> per=permute(new int[]{1,2,3});
	System.out.println(per);



	}


}
