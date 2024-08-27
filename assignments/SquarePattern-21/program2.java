
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		
		int num = rows;
		for(int i=1; i<=rows; i++){
		
			for(int j=1; j<=rows; j++){
			
				if(num%3==0){
				
					System.out.print(num*3 + "\t");
				}else if(num%5==0){
				
					System.out.print(num*5 + "\t");
				}else{
				
					System.out.print(num + "\t");
				}

				num++;
			}

			System.out.println();
		}
	}
}
