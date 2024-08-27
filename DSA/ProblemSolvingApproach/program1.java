
import java.util.*;

// brute-force approach=>

/*class Factors{

	 static int factors(int num){
	 
		 int count = 0;

		 for(int i=1; i<=num; i++){
		 
			 if(num%i == 0){
			 
				 count++;
			 }
		 }
		 return count;
	 }

	 public static void main(String[] args){
	 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter num: ");
		 int num = sc.nextInt();

		 int count = factors(num);

		 System.out.println("total factors of "+num+" is: "+count);
	 }
}*/


// optimised approach=>

class Factors{

         static int factors(int num){

                 int count = 0;

                 for(int i=1; i*i<=num; i++){

                         if(num%i == 0){

                                 if(i == num/i)
					 count = count + 1;
				 else
					 count = count + 2;
                         }
                 }
                 return count;
         }

         public static void main(String[] args){

                 Scanner sc = new Scanner(System.in);
                 System.out.print("Enter num: ");
                 int num = sc.nextInt();

                 int count = factors(num);

                 System.out.println("total factors of "+num+" is: "+count);
         }
}
