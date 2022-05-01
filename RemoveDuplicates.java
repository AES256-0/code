class RemoveDuplicates{
	public static void main(String[] args)
	{
		String s="abccd";
		char ch[]=s.toCharArray();
		int c=0;
		int m=0;
		while(m<ch.length){
			if(ch[c]!=ch[m]){
				ch[c+1]=ch[m];
				c++;
		
			}
			m++;
		}
		System.out.println(c);
		System.out.println(new String(ch,0,c+1));
	}
	public static void solveRecursive(char[] ch,int ci){
		if(ci==ch.length)
			return;
		if(ch[ci]==ch[ci+1]){
			int i=ci+1;
			for(i=ci+1;i<ch.length;i++){
				ch[i]=ch[i+1];
			}
			solveRecursive
	
		}


	}


}
