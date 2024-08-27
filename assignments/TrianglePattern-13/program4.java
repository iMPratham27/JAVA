
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		int num = rows*(rows+1)/2;
		int ch = num + 64;
		for(int i=1; i<=rows; i++){
		
			for(int j=1; j<=rows-i+1; j++){
			
				System.out.print((char)ch + " ");
				ch--;
			}
			System.out.println();
		}
	}
}
