import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

class Dps{
	private static BufferedReader bread=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int t=Integer.parseInt(bread.readLine());
		while(t-->0){
			String s=bread.readLine();
			if(s.length()==1){
				System.out.println("DPS");
			}
			else{
				int odd=0;
				int even=0;
				HashSet<Character> set=new HashSet<>();
				for(int i=0;i<s.length();i++){
					char ch=s.charAt(i);
					int count=1;
					if(!set.contains(ch)){
						set.add(ch);
						for(int j=i+1;j<s.length();j++){
							if(s.charAt(j)==ch){
								count++;
							}

						}
						if(count%2==0){
							even++;
						}
						else{
							odd++;
						}

					}

				}
				if(odd==1 && even==0){
					System.out.println("DPS");
				}
				else if(even==1&& odd==0){
					System.out.println("!DPS");
				}
				else if(odd>3){
					System.out.println("!DPS");

				}
				else if(odd==0){
					System.out.println("!DPS");
				}
				else if(odd<=3){
					System.out.println("DPS");
				}			
			//abcba
			//abccdeeebccba
			//abcccdddeeefff
			//abccccddeeefffba
			//abdcceeefffccdba
			//efef    fe
			//cccddd -> ccddcc
			//cccdddeeefff->ccdeeedcc   
			}


		}



	}


}
