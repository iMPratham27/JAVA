
import java.util.*;

class StringDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter string: ");
                String str = sc.nextLine();

                System.out.println("Output: "+str.replace('a','e'));

        }
}
