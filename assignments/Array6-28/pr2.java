import java.util.*;
class arrayDemo{

        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array: ");

        int size = sc.nextInt();

        int arr[] = new int [size];

        for(int i=0;i<size;i++){

                arr[i] = sc.nextInt();

        }
	int sum=0;
        int prime=0;
        for(int i=0;i<size;i++){
		int count=0;
               for(int j=1;j<=arr[i];j++){
	       
		       if(arr[i]%j==0){
		       	
			       count++;
		       }
		     
	       
	       }
	        if(count==2){

                               sum=sum+arr[i];
                               prime++;
                       }

        }
        System.out.println("Sum is "+sum);
	System.out.println("prime no count is "+prime);

        }
}
