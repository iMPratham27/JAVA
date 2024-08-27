
import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.next().charAt(0);
		}

		int vowels = 0;
		int consonents = 0;
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
			
				vowels++;
			}else{
			
				consonents++;
			}
		}

		System.out.println("Total number of vowels are: "+vowels);
		System.out.println("Total number of consonents are: "+consonents);
	}
}
