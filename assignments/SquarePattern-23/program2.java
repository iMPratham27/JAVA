
import java.util.*;

class PatternDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter rows: ");
                int rows = sc.nextInt();

                int ch = rows;
                for(int i=1; i<=rows; i++){
			
			int num = rows - i + 1;
                        for(int j=1; j<=rows; j++){
                        
				if(j>=num){
				
					System.out.print((char)(ch+64)+"\t");
				}else{
				
					System.out.print((char)(ch+96)+"\t");
				}

				ch++;
			}

                        System.out.println();
                }
        }
}
