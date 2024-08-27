
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
		
			int num = rows-i+1;
			for(int j=1; j<=rows-i+1; j++){
			
				if(rows%2==0){
					if(i%2==0){
				
						System.out.print((char)(num+96) + " ");
					}else{
				
						System.out.print((char)(num+64) + " ");
					}
					num--;
				}else{
				
					if(i%2==0){
				
						System.out.print((char)(num+64) + " ");
					}else{
				
						System.out.print((char)(num+96) + " ");
					}
					num--;
				}
			}
			System.out.println();
		}
	}
}
