
import java.util.*;

class InputDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter num: ");
                int num = sc.nextInt();

                int rev = 0;
                for(int i=num; i>=1; i/=10){
		
			int digit = i%10;
			rev = rev*10 + digit;
		}
                System.out.println("Reverse is: " + rev);
        }
}
