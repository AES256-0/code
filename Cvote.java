import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

class Cvote{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	private static Integer nm=-1,anm=-1;
	private static String player_max="",country_max="";
	//N number of chefs
	//M number of emails
	//N lines following contains 2 space separated strings denoting name of the chef and country of the chef
	//Next M lines = emails
	public static void main(String[] args) throws IOException{
		String[] info=bread.readLine().split(" ");
		HashMap<String,String> map=new HashMap<String,String>();
		for(int i=0;i<Integer.parseInt(info[0]);i++){
			String temp[]=bread.readLine().split(" ");
			map.put(temp[0],temp[1]);
		}
		HashMap<String,Integer> country_count=new HashMap<String,Integer>();
		HashMap<String,Integer> player_count=new HashMap<String,Integer>();

		// String player_max="",country_max="";
		for(int j=0;j<Integer.parseInt(info[1]);j++){
			String s=bread.readLine();
			player_max=addData(player_count,s,player_max,nm,1);
			country_max=addData(country_count,map.get(s),country_max,anm,2);
		}
		System.out.println(country_max);
		System.out.println(player_max);
	}



	private static String addData(HashMap<String,Integer> map,String s,String max,Integer num,int c){
			if(map.containsKey(s)){
				map.put(s,map.get(s)+1);

			}
			else{
				map.put(s,1);

			}
			if(max.equals("")){
				max=s;
			}
			int value=map.get(s);
			if(value>=num){
				if(value==num){
					max=max.compareTo(s)<0?max:s;
				}
				else{
				max=s;
				}
				num=value;
			}
			if(c==1){
				nm=num;
			}
			else{
				anm=num;
			}	
			return max;

	}

}
