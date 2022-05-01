import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class Carvans 
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String[] nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
           { 
                e.printStackTrace(); 
            } 
            return str.split(" "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        FastReader s=new FastReader(); 
        int testcase=s.nextInt();
	for(int i=0;i<testcase;i++)
	{
		int no_of_cars=s.nextInt();
		String[] car_speed=s.nextLine();
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
