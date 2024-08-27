
import java.util.*;

class StringDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter string: ");
                String str = sc.next();
		
		System.out.println("Output: ");
		for(int i=0; i<str.length(); i++){
		
			System.out.println(str.charAt(i));
		}

        }
}
