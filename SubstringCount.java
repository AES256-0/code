public class SubstringCount{
	public static void main(String[] args){

		String s="hello world hello world fnelel world ok nhi hworld";
		String k="el";
		int i=0;
		int count=0,matchcount=0;
		for(int j=0;j<s.length();j++){
				
				  int z=j;
				  while(i<k.length() && (k.charAt(i++)==s.charAt(z++))){
				 	matchcount++;
				 
				  }
				 if(matchcount==k.length()){
					count++;
					j=j+k.length()-1;

				 }
			
				 matchcount=0;
				 i=0;

		}	 
		


		System.out.println(count);




	}




}
