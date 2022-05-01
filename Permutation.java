class Permutation{
	public static void permutation(String perm,String ans){
		if(perm.length()==0){
			System.out.println(ans);
			return;

		}
		for(int i=0;i<perm.length();i++){
			permutation(perm.substring(0,i)+perm.substring(i+1),ans+perm.charAt(i));
		}
	
	}
	public static void main(String[] args){

		permutation("ABC","");
	
	}
	


}
