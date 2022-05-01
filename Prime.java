class Prime{
	public static void main(String[] args){
		int n=2;
		boolean flag=false;
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("NOt Prime");
		}
		else if(n==2){

			System.out.println("prime");
		}
		else{
			System.out.println("Prime");
		}
	}
}
