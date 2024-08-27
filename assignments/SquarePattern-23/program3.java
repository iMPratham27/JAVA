
import java.util.*;

class PatternDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter rows: ");
                int rows = sc.nextInt();

                int ch = rows;
                for(int i=1; i<=rows; i++){

                        for(int j=1; j<=rows; j++){

                                if(i%2==0){

					if(j%2==0){

						System.out.print((char)(ch+96)+"\t");
					}else{
				
					System.out.print(ch+"\t");
					}
				}else{
				
					if(j%2==0){
					
						System.out.print(ch+"\t");
					}else{
					
						System.out.print((char)(ch+96)+"\t");
					}
				}
			
				ch++;
                        }

                        System.out.println();
                }
        }
}
