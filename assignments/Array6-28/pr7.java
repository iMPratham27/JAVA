import java.util.*;
class arrayDemo{

        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array: ");

        int size = sc.nextInt();

        int arr[] = new int [size];

        for(int i=0;i<size;i++){

                arr[i] = sc.next().charAt(0);

        }
	System.out.println("before reverse array ");
        for(int i=0;i<size;i++){
        System.out.print((char)arr[i]+"\t");
	}
	System.out.println();
	System.out.println("Alternate element before reverse ");
	for(int i=0;i<size;i++){
	if(i%2==0){
	System.out.print((char)arr[i]+"\t");
	}
	}
	System.out.println();
	 System.out.println("After reverse array ");
        for(int i=(size-1);i>=0;i--){
        System.out.print((char)arr[i]+"\t");
        }
	System.out.println();
        System.out.println("Alternate element After  reverse ");
        for(int i=(size-1);i>=0;i--){
       if(i%2==1){
        System.out.print((char)arr[i]+"\t");
        }
	}
	System.out.println();

        }

}
