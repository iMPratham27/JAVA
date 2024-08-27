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
              	
	         	
                for(int  i=0;i<size;i++){
			int count=0;
			int rem=arr[i];
		  while(rem>0){
			  
			 rem=rem/10;
			count++;

		  }
	  	 System.out.print(count+"\t");	  

                

                }
		

                }

        }

