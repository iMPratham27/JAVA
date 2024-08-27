
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++){
			int ch1 = i + 64;
			int ch2 = i + 96;
			for(int space=1; space<i; space++){
			
				System.out.print("\t");
			}

			for(int j=1; j<=rows-i+1; j++){
			
				if(rows%2==0){
				
					System.out.print((char)ch2+"\t");
				}else{
				
					System.out.print((char)ch1+"\t");
				}
				ch1++;
				ch2++;
			}
			ch1 = ch1 - 2;
			ch2 = ch2 - 2;
			System.out.println();
		}
	}
}
