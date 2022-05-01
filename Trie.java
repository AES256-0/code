import java.util.*;
import java.io.*;
class Trie{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static class TrieNode{
		TrieNode nodes[];
		boolean isEnd;
		char data;

		public TrieNode(char c){
			this.data=c;
			nodes=new TrieNode[26];
			isEnd=false;
		}

	}

	private static void insert(TrieNode root,String s){
		if(s.length()==0)
			return;
		if(root.nodes[s.charAt(0)-'a']==null){
			root.nodes[s.charAt(0)-'a']=new TrieNode(s.charAt(0));
		}
		if(s.length()==1){
			root.nodes[s.charAt(0)-'a'].isEnd=true;
		}
		insert(root.nodes[s.charAt(0)-'a'],s.substring(1,s.length()));


	}

	private static boolean search(TrieNode root,String s){
		if(s.length()==0)
			return true;
		if(root.nodes[s.charAt(0)-'a']==null)
			return false;
		
		return search(root.nodes[s.charAt(0)-'a'],s.substring(1,s.length()));

	

	}

	private static TrieNode endNode(TrieNode root,String s){
		if(s.length()==0)
			return null;
		if(root.nodes[s.charAt(0)-'a']==null){
			return null;
		}
		if(s.length()==1){
			return root.nodes[s.charAt(0)-'a'];
		}
		return endNode(root.nodes[s.charAt(0)-'a'],s.substring(1,s.length()));	

	}
	private static void printNodes(TrieNode root,String ans){
		if(root.isEnd){
			System.out.println(ans);
		}
		for(TrieNode node:root.nodes){
			if(node!=null){
				printNodes(node,ans+Character.toString(node.data));
			}
		}

	}

	private static boolean isPalindrome(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;

	}
	
	private static void palindromeText(TrieNode root,String[] arr){

		boolean flag=false;
		for(String s:arr){
			if(isPalindrome(s)){
				System.out.println("true");
			}
			else{
				if(search(root,new StringBuilder(s).reverse().toString())){
						System.out.println("true");
						flag=true;
				}
				else{
					insert(root,s);
				}

			}
		}
		if(!flag)
			System.out.println("false");


	}

	public static void main(String[] args) throws IOException{ 
		String[] arr=bread.readLine().split(" ");
		TrieNode root=new TrieNode('1');
		for(String s:arr){
			insert(root,s);
		}
		/*boolean flag=false;
		for(String s:arr){
			if(isPalindrome(s)){
				System.out.println("true");
			}
			else{
				if(search(root,new StringBuilder(s).reverse().toString())){
						System.out.println("true");
						flag=true;
				}
				else{
					insert(root,s);
				}

			}
		}
		if(!flag)
			System.out.println("false");

		
		/*for(String s:arr){
			while(s.length()!=0){
			insert(root,s);
			s=s.substring(1,s.length());
			}
		}*/
	//	String se=bread.readLine();
	//	System.out.println(search(root,se));
	//
		String se=bread.readLine();
		TrieNode r=endNode(root,se);
		String ans=se;
		System.out.println(ans);
		if(r!=null)
		printNodes(r,ans);
	
	}

}
