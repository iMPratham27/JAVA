
import java.io.*;

class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int rows = Integer.parseInt(br.readLine());

		int num = 1;
		for(int i=1; i<=rows; i++){
		
			for(int j=1; j<=i; j++){
			
				if(i%2==0){
				
					System.out.print((char)(num+64)+" ");
				}else{
				
					System.out.print(j+" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
