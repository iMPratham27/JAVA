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
      
        for(int i=0;i<size;i++){
        if(arr[i]>=65&&arr[i]<=90){
        System.out.print((char)arr[i]+"\t");
        }else{
	System.out.print(arr[i]+"\t");
	}
	}
    }
}
