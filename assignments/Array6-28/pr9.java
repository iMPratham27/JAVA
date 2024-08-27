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
	int count=0;
        for(int i=0;i<size;i++){
	int num=arr[i];
	int rev=0;
	int rem=0;
	while(num>0){
	rem=num%10;
	rev=rem+rev*10;
	num=num/10;

	}
	if(arr[i]==rev){
	count++;
	}
        }
	System.out.println("count of palindrome no is"+count);
        }

    }
