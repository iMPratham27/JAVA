import java.util.*;

class PatternDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of rows: ");
                int rows = sc.nextInt();

                int ch = rows+64;
                for(int i=1; i<=rows; i++){
			
			int num = rows+i-1;
                        for(int j=1; j<=rows; j++){

                                System.out.print((char)ch+""+num+ " ");
                                num--;
                        }
			
                        System.out.println();
                }
        }
}
