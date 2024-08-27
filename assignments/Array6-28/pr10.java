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
	int min=arr[0];
	for(int i=1;i<size;i++){
	if(arr[i]<min){
	min=arr[i];
	}
	}

	int max=min;
        for(int i=0;i<size;i++){
	if(arr[i]>max){
		max=arr[i];
	}
	}
	int max1=min;
        for(int i=0;i<size;i++){
        if(arr[i]>max1&&arr[i]<max){                                                             max1=arr[i];                                                      }
	}
	int max2=min;
        for(int i=0;i<size;i++){
        if(arr[i]>max2&&arr[i]<max1){                                                             max2=arr[i];                                                       }
        
	}
	System.out.println("Third largest element is : "+max2);

    
	}
}
