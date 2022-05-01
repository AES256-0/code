import java.lang.reflect.Field;
abstract class A{
	private int a=10;
}
class B extends A{
	int x=10;
	private B(){
		//System.out.println(super.a);
	}
	public static void p(){
		System.out.println("ffff");
	}
	public static void main(String[] args){
		B b=new B();
		try{
		Field privateField = A.class.getDeclaredField("a");

			privateField.setAccessible(true);

			Integer n=(Integer) privateField.get(b);
			b=null;
			System.out.println(b.x);
			b.p();

			System.out.println(n); 

		}
		catch(Exception e){
	
		}
	}
}
