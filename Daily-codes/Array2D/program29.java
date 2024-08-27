import java.util.*;

class ArrayDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter size of array: ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                System.out.println("Size of an array: "+ arr.length);

                for(int i=0; i<arr.length; i++){

                        System.out.print("Enter element: ");
                        arr[i] = sc.nextInt();
                }

                System.out.println("Array elements: ");
                for(int i=0; i<arr.length; i++){

                        System.out.println(arr[i]);
                }

		int sum = 0;
		for(int i=0; i<arr.length; i++){
		
			sum+=arr[i];
		}
		System.out.println("Sum is: "+sum);
        }
}
