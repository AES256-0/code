import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flow{

	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			if(s.equals("B") || s.equals("b")){
				System.out.println("BattleShip");
			}
			else if(s.equals("C") || s.equals("c")){
				System.out.println("Cruiser");
			}
			else if(s.equals("D") || s.equals("d")){
				System.out.println("Destroyer");
		
			}
			else if(s.equals("F") || s.equals("f")){
				System.out.println("Frigate");

			}




		}
	




	}





}
