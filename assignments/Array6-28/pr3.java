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
	int count=0;
        for(int i=0;i<size;i++){
	if(arr[i]==key){
	count++;
	}
        }
	if(count>2){
	for(int j=0;j<size;j++){
	if(arr[j]==key){
	arr[j]=arr[j]*arr[j]*arr[j];
	}
	System.out.print(arr[j]+"\t");
	}
	}else{
        System.out.println("Element not found ");
        }
	}
		
}
	
	
