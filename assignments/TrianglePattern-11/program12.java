
import java.io.*;

class InputDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int rows = Integer.parseInt(br.readLine());
		
		if(rows%2==0){
			for(int i=1; i<=rows; i++){
			
				int ch = 64+i;		
				for(int j=1; j<=rows-i+1; j++){
			
					if(ch%2==0){
				
						System.out.print((char)ch+" ");
					}else{
				
						System.out.print(ch+" ");
					}
					ch++;
				}
				System.out.println();
			}
		}else{
		
			for(int i=1; i<=rows; i++){
			
				int ch1 = 64+i;
				for(int j=1; j<=rows-i+1; j++){
				
					if(ch1%2==0){
					
						System.out.print(ch1+" ");
					}else{
					
						System.out.print((char)ch1+" ");
					}
					ch1++;
				}
				System.out.println();
			}
		}
	}
}
