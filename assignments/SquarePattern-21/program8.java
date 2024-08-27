
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		

		for(int i=1; i<=rows; i++){
			
			int ch = rows+64;

			for(int j=1; j<=rows; j++){
			
				if(i%2==0){
				
					if(j%2==0){
					
						System.out.print("#"+"\t");
					}else{
					
						System.out.print((char)ch+"\t");
						ch--;
					}
				}else{
				
					if(j%2==0){
					
						System.out.print((char)ch+"\t");
						ch--;
					}else{
					
						System.out.print("#"+"\t");
					}
				}
			}
			System.out.println();
		}
	}
}
