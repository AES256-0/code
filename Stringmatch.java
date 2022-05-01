import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Stringmatch{
	public static void main(String[] args){
		String s="aabaacaadaabaaba";
		String p="aaba";
		for(int i=0;i<=s.length()-p.length();i++){
			if(s.charAt(i)==p.charAt(0)){
				if(s.substring(i,i+p.length()).equals(p)){
					System.out.println(i);
				}
			}
		}
	}

}
