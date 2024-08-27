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
        System.out.print("Enter element you want to search ");
        int key = sc.nextInt();
        int flag=0;
        for(int i=0;i<size;i++){
	if(arr[i]==key){
	flag++;
	}
        }
	if(flag==0){
	System.out.print("Element is not found ");
	}else{
	 for(int i=0;i<size;i++){
        if(arr[i]%key==0){
        System.out.println("Multiple of "+key+"is found at index "+i);
        }
        }
	}

	}

}
