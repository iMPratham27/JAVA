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
                int even=0;
                int odd=0;
                for(int  j=0;j<arr.length;j++){

                        if(arr[j]%2==0){
			
				even+=arr[j];
			
			}else{
			
				odd+=arr[j];
			}

                }

                System.out.println("even sum is : "+even);
		System.out.println("odd sum is : "+odd);

        }

}
