
import java.io.*;

class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){
		
			int ch1 = 64+rows;
			int ch2 = 96+rows;
			for(int j=1; j<=i; j++){
			
				if(i%2==0){
				
					System.out.print((char)ch1+" ");
					ch1--;
				}else{
				
					System.out.print((char)ch2+" ");
					ch2--;
				}
			}
			System.out.println();
		}
	}
}
