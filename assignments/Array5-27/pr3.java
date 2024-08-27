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
                int flag=0;
                for(int  i=0;i<size/2;i++){
                     
		if(arr[i]!=arr[size-i-1]){
			flag++;

		}


            }
	    if(flag==0){
	    
	    System.out.print("number is palindrome ");
	    }else{
	     System.out.print("number is not palindrome "); 
	    
	    }

                }

        }

