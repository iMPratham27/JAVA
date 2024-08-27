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

                int min=arr[0];
		int min2=arr[0];

                for(int  i=0;i<size;i++){
                        if(arr[i]<min){
			
				min=arr[i];
			}

                      }
                     for(int i=1;i<size;i++){
		     
			     if(arr[i]<min2&&arr[i]>min){
			     
				     min2=arr[i];
			     
			     }
		     
		     }
		     System.out.print("Second min element is "+min2);

	}                  
}

