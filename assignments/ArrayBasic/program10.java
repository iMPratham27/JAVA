
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];

		System.out.println("Enter marks of (Phy/Chem/Maths): ");
		for(int i=0; i<arr.length; i++){
		
			arr[i]=sc.nextInt();
		}

		int sum = 0;
		for(int i=0; i<arr.length; i++){
		
			sum = sum + arr[i];
		}
		System.out.println("Total marks are: "+sum+"/300");
	}
}
