
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
			
			int ch = rows+64;		
			for(int j=1; j<=rows; j++){
			
				if(i%2==0){
				
					System.out.print(j + " ");
				}else{
				
					System.out.print((char)ch + " ");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
