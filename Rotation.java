import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


class Rotation{
	public static void main(String[] args){
		String s="A B C";
		String k[]=s.split(" ");
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		String[] target="A B C".split(" ");
		int first=-1,second=-1;
		int x=-1,y=-1;
		boolean flag=false;
		for(int i=0;i<target.length;i++){
			String current=target[i];
			int index=list.indexOf(current);
			if(index==0){
				first=list.size()-1;
			}
			else{
				first=index-1;
			}
			if(index==list.size()-1){
				second=0;
			}
			else{
				second=index+1;
			}
			if(i==0){
				x=target.length-1;
			}
			else{
				x=i-1;
			}
			if(i==target.length-1){
				y=0;
	
			}
			else{
				y=i+1;
			}
			
			if(!(list.get(first).equals(target[x]) && list.get(second).equals(target[y]))){
				System.out.println(list.get(first)+" "+target[x]+" "+list.get(second)+" "+target[y]);
				flag=true;
			}
		}
		if(flag){
			System.out.println("No");
		}
		else{
			System.out.println("YES");
		}




	}







}
