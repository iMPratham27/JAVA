
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	       	System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		if(rows%2==0){
		
			for(int i=1; i<=rows; i++){
			
				for(int space=1; space<i; space++){
				
					System.out.print(" "+"\t");
				}

				int num=64+i;
				for(int j=1; j<=rows-i+1; j++){
				
					if(num%2==0){
					
						System.out.print((char)(num)+"\t");
					}else{
					
						System.out.print(num+"\t");
					}
					num++;
				}
				System.out.println();
			}
		}else{
		
			for(int i=1; i<=rows; i++){
			
				for(int space=1; space<i; space++){
				
					System.out.print(" "+"\t");
				}

				int num=64+i;
				for(int j=1; j<=rows-i+1; j++){
				
					if(num%2==0){
					
						System.out.print(num+"\t");
					}else{
					
						System.out.print((char)(num)+"\t");
					}
					num++;
				}
				System.out.println();
			}
		}
	}
}
