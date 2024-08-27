
// print sum of every subarray:-

/*
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{2,4,1,3};

		for(int i=0; i<arr.length; i++){
		
			for(int j=i; j<arr.length; j++){
			
				int sum = 0;
				for(int k=i; k<=j; k++){
				
					sum = sum + arr[k];
				}

				System.out.println(sum);
			}
		}
	}
}

//	T.C. => O(N^3)
//	S.C. => O(1)

*/

//--------------------------------------------------------

/*
//using prefix-sum
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{2,4,1,3};

		int prefixSum[] = new int[arr.length];

		prefixSum[0] = arr[0];	

		for(int i=1; i<arr.length; i++){
		
			prefixSum[i] = prefixSum[i-1] + arr[i];
		}
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=i; j<arr.length; j++){
				
				int sum = 0;

				if(i==0)
					sum = prefixSum[j];
				else
					sum = prefixSum[j] - prefixSum[i-1];

				System.out.println(sum);
			}
		}
	}
}

//	T.C. => O(N^2)
//	S.C. => O(N)

*/

//------------------------------------------------------------------------------


//using carryforward
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{2,4,1,3};

		for(int i=0; i<arr.length; i++){
		
			int sum = 0;
			for(int j=i; j<arr.length; j++){
			
				sum = sum + arr[j];
				System.out.println(sum);
			}
		}
	}
}

//	T.C. => O(N^2)
//	S.C. => O(1)


