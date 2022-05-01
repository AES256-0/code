class Outer{
	int x=10;
	static int y=20;

	public A show(){
		class Inner implements A{
			public void innerMethod(){
				System.out.println(x+" "+y);
	
			}
		}
		return new Inner();
	}
	public static void main(String[] args){
		Outer ob=new Outer();
		A a=ob.show();
		a.innerMethod();


	}
}
interface A{
	void innerMethod();
}
