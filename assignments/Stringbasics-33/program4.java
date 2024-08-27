
import java.util.*;

class StringDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter string1: ");
                String str1 = sc.next();

                System.out.print("Enter string2: ");
                String str2 = sc.next();

                if(str1.equals(str2)){
		
			System.out.println("Strings are equal.");
			System.out.println("Difference: "+ str1.compareTo(str2));
		}else{
		
			System.out.println("Strings are not  equal.");
			System.out.println("Difference: "+ str1.compareTo(str2));
		}

        }
}
