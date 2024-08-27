
import java.util.*;

class PatternDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		for(int i=1; i<=rows; i++){
		
			int num = 1;
			char ch = 'a';
			for(int j=1; j<=rows-i+1; j++){
			
				if(j%2==0){
				
					System.out.print(ch + " ");
					ch++;
				}else{
				
					System.out.print(num + " ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
