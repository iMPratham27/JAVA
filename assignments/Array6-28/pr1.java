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
	int min = arr[0];
	int flag=0;
	for(int i=1;i<size;i++){
	
		if(arr[i]<min){
		
		min = arr[i];
		
		}else{
		
		flag++;
		}
	
	}
	if(flag==0){
	
		System.out.print("Number is Decending order ");
	}else{
		System.out.print("Number is Not Decending order ");
	}
	
	}

}
