class A extends Thread{
	Sync ref;
	public A(Sync ref){
		this.ref=ref;
	}
	public void run(){
		try{
			for(int i=1;i<10;i++){
				synchronized(ref){
				if(i%2==0){
					System.out.println(i);		
					wait();

				}
				}
				notifyAll();
			//	wait();
			//	wait();
			}

		}
		catch(Exception e){


		}

	}

}
class B extends Thread{
	Sync ref;
	public B(Sync s){
		ref=s;
	}
	public void run(){
		try{
			for(int i=1;i<9;i++){
				synchronized(ref){
					if(i%2!=0){
						System.out.println(i);
						wait();
					}
				}
				notifyAll();
				//wait();
			}
				
		}
		catch(Exception e){

		}

	}


}
public class Sync{
	public  synchronized void  print(int i){
		System.out.println(i);

	}
	public static void main(String[] args){
		Sync ob=new Sync();
		B b=new B(ob);
		A a=new A(ob);
		a.start();
		b.start();

	}

}
