import java.util.*;
class arrayDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Size of Array: ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                System.out.print("Enter the Elements: ");
                for(int i=0;i<size;i++){

                        arr[i] = sc.nextInt();

                }
      
     
                for(int  i=0;i<arr.length;i++){
			int fact=1;
                       for(int j=1;j<=arr[i];j++){
		       
			       fact=fact*j;
		       
		       }
		       System.out.print(fact+",");

		}	

         
              }

        }
