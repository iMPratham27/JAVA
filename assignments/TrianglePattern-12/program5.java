
import java.io.*;

class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int rows = Integer.parseInt(br.readLine());

		int ch = 64+rows+1;
		for(int i=1; i<=rows; i++){
		
			for(int j=1; j<=i; j++){
			
				System.out.print((char)ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
