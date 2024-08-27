import java.util.*;

class StringDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                
		System.out.print("Enter string1: ");
                String str1 = sc.nextLine();

		System.out.print("Enter string2: ");
                String str2 = sc.nextLine();

		String str3 = str1.concat(str2);
		
		System.out.println("Output: "+str3);
		System.out.println("Length of the string: "+str3.length());

        }
}
