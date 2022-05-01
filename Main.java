
import java.util.Scanner; 

  
public class Main 
{ 
    private static Scanner s=new Scanner(System.in); 
  
    public static void main(String[] args) 
    { 
        int testcase=s.nextInt();
	for(int i=0;i<testcase;i++)
	{
		int no_of_cars=s.nextInt();
		System.out.println("m here");
		String temp=s.next();
		System.out.println("m also herer");
		String speeds=s.nextLine();
		String[] car_speed=speeds.split(" ");
		int max_speed=Integer.parseInt(car_speed[0]),count=0;
		for(int j=0;j<no_of_cars;j++){

			int speed=Integer.parseInt(car_speed[j]);
			if(max_speed>=speed){
				max_speed=speed;
				count++;

			}
		

		}
		System.out.println(count);


	}

    } 
} 

