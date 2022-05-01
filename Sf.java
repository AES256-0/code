class Sf{
	public static void main(String... s){
		StringBuffer k=null;
		StringBuffer p=new StringBuffer("hello");
		StringBuffer n=p.append(k);
		System.out.println(p);
		if(n==p){
			System.out.println("true");


		}


	}




}
