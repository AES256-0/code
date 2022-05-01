mport java.util.Scanner;
class Main{
		private static Scanner scan=new Scanner(System.in);
			public static void main(String[] args){
					        int t=scan.nextInt();
								for(int i=0;i<t;i++){
												int n=scan.nextInt();
															int max=Integer.MIN_VALUE;
																		for(int j=0;j<n;j++){
																					       		int s=scan.nextInt();
																										       	int v=scan.nextInt();
																															int p=scan.nextInt();
																																			max=Math.max(max,(int)(p/(s+1))*v);
																																						}
																			  		System.out.println(max);

																							}

								 	 }
				
}

