class BinaryCount extends A{
	public int count(int k){
		if(k==1)
			return 2;
		if(k==2)
			return 3;
		return count(k-1)+count(k-2);		
	}
	public static void A(){
		System.out.println("yes");
	}

	public static void main(String[] args){
		BinaryCount ob=new BinaryCount();
		System.out.println(ob.count(4));
		ob.A();
		//ob.s();		

	}

}
class A{
	public static void A(){
		System.out.println("no");
	}
	public void s(){
		System.out.println("yes");

	}

}
