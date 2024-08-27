
import java.util.*;

class Diff{
	
	/*  Brute-force 
	static int diff(int a,int b){
	
		int dist = 0;
		for(int i=a; i<=b; i++){
		
			dist++;
		}

		return dist;
	}*/
	

	// optimized 
	static int diff(int a, int b){
	
		return b-a+1;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = sc.nextInt();

		System.out.print("Enter b: ");
		int b = sc.nextInt();

		int ret = diff(a,b);

		System.out.println(ret);
	}
}
