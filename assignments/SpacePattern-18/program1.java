
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
		
			for(int space=1; space<=rows-i; space++){
			
				System.out.print(" "+"\t");
			}

			int num = 1;
			for(int j=1; j<=i; j++){
			
				System.out.print(num+"\t");
				num++;
			}

			System.out.println();
		}
	}
}
