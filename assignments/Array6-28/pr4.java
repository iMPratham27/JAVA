import java.util.*;
class arrayDemo{

        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array: ");

        int size = sc.nextInt();

        int arr[] = new int [size];
	int arr1[] = new int [size];

	System.out.print("Enter elements of Array 1 ");

        for(int i=0;i<size;i++){

                arr[i] = sc.nextInt();

        }
	System.out.print("Enter elements of Array 2 ");
	for(int i=0;i<size;i++){                                                                                                                                        arr1[i] = sc.nextInt();                                                                                                                          }
	System.out.print("Common elements are: ");
        for(int i=0;i<size;i++){
	for(int j=0;j<size;j++){
        if(arr[i]==arr1[j]){
        System.out.print(arr[i]+",");
        }
        }
	}
        
        }

}
