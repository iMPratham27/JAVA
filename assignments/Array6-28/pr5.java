import java.util.*;
class arrayDemo{

        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array 1: ");

        int size = sc.nextInt();

	System.out.print("Enter size of array 2: ");
	
	int size1 = sc.nextInt();
        int arr[] = new int [size];
        int arr1[] = new int [size1];

        System.out.print("Enter elements of Array 1 ");

        for(int i=0;i<size;i++){

                arr[i] = sc.nextInt();

        }
        System.out.print("Enter elements of Array 2 ");                            
       	for(int i=0;i<size1;i++){                                                                                                                                        arr1[i] = sc.nextInt();                                                                                                                          }
	int size3=size+size1;
        int arr3[] = new int[size3];
        for(int i=0;i<size;i++){
	arr3[i]=arr[i];
	}
	for(int i=0;i<size1;i++){
	arr3[size+i]=arr1[i];
	}
	for(int i=0;i<size3;i++){
	System.out.print(arr3[i]+"\t");
	}
     

        }

}
