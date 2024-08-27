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

                int idx=0;

                for(int  i=0;i<size;i++){
                        int count=0;
                      for(int j=1;j<=arr[i];j++){

                              if(arr[i]%j==0){
                                 count++;
                            }
			    
		      }
                     if(count>2){
		     	
			     System.out.println("composite no are: "+arr[i]);
		     
		     }
                   

                        }


   
	}
}
