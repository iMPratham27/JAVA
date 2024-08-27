
// find maximum-subarray sum

/*
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){
			
			for(int j=i; j<arr.length; j++){
			
				int sum = 0;
				for(int k=i; k<=j; k++){
				
					sum = sum + arr[k];
				}

				if(sum > maxSum)
					maxSum = sum;
			}
		}

		System.out.println("Maximum sum: "+ maxSum);
	}
}

//	T.C. => O(N^3)
//	S.C. => O(1)

*/

//---------------------------------------------------------------------------------

//uing prefix-sum
/*
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int prefixSum[] = new int[arr.length];

		int maxSum = Integer.MIN_VALUE;

		prefixSum[0] = arr[0];
		for(int i=1; i<arr.length; i++){
		
			prefixSum[i] = prefixSum[i-1] + arr[i];
		}
		
		for(int i=0; i<arr.length; i++){
			
			int sum = 0;
			for(int j=i; j<arr.length; j++){
			
				if(i==0)
					sum = prefixSum[j];
				else
					sum = prefixSum[j] - prefixSum[i-1];

				if(sum > maxSum)
					maxSum = sum;
			}
		}

		System.out.println("Maximum sum: "+ maxSum);
	}
}

//	T.C. => O(N^2)
//	S.c. => O(N)

*/


//-------------------------------------------------------------------------------------

//carry-forward

class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){
			
			int sum = 0;
			for(int j=i; j<arr.length; j++){
			
				sum = sum + arr[j];

				if(sum > maxSum)
					maxSum = sum;
			}
		}

		System.out.println("Maximum sum: "+ maxSum);
	}
}

//	T.C.=> O(N^2)
//	S.C => O(1)


// this is more optimized in program7




