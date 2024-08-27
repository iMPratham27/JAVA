/*
 	This is useful when we have only one query

import java.util.*;

class ArrayDemo{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of queries: ");
		int Q = sc.nextInt();

                int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

                for(int i=1; i<=Q; i++){

			int sum = 0;
		
			System.out.print("Start index: ");
			int startIdx = sc.nextInt();
			
			System.out.print("End index: ");
			int endIdx = sc.nextInt();

			for(int j=startIdx; j<=endIdx; j++){
			
				sum = sum + arr[j];
			}
                	System.out.println("Sum: "+sum);
		}
        }
}

 T.C. => O(Q*N)

*/

//---------------------------------------------------------------------

//  {range queries => Pefix sum}

import java.util.*;

class ArrayDemo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int N = 10;

		int Q = 3;
		
		// here we create prefix sum array
		int psArr[] = new int[N];

		psArr[0] = arr[0];

		for(int i=1; i<N; i++){
		
			psArr[i] = psArr[i-1] + arr[i]; // using this formula, we put new values in psArr[]
		}

		int sum = 0;
		for(int i=0; i<Q; i++){
		
			System.out.print("Start index: ");
			int startIndex = sc.nextInt();
			
			System.out.print("End index: ");
			int endIndex = sc.nextInt();
			
			if(startIndex == 0)
				sum = psArr[endIndex];
			else
				sum = psArr[endIndex] - psArr[startIndex-1];

			System.out.println("Sum: "+sum);	
		}
	}
}


