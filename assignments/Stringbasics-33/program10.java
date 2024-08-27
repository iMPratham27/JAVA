
import java.util.*;

class StringDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter string: ");
                String str = sc.nextLine();

		int i = str.length()-1;

                if(str.isEmpty()){
		
			System.out.println("String is empty.");
		}else{
		
			System.out.println("Output: "+str.charAt(i));
		}

        }
}
