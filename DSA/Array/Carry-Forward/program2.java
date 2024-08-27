
// brute-force
/*
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N = 10;

		int leftMax[] = new int[N];

		for(int i=0; i<N; i++){
		
			int max = Integer.MIN_VALUE;
			for(int j=0; j<=i; j++){
			
				if(arr[j] > max)
					max = arr[j];
			}
			leftMax[i] = max;
		}

		for(int i=0; i<N; i++){
		
			System.out.print(leftMax[i]+"\t");
		}
	}
}

T.C. => O(N^2)
S.C. => O(1)

*/

//optimized 
class ArrayDemo{

        public static void main(String[] args){

                int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
                int N = 10;

                int leftMax[] = new int[N];
		leftMax[0] = arr[0];

                for(int i=1; i<N; i++){

                        //leftMax[i] = max(leftMax[i-1] , arr[i])
			if(arr[i] > leftMax[i-1])
				leftMax[i] = arr[i];
			else
				leftMax[i] = leftMax[i-1];
                }

                for(int i=0; i<N; i++){

                        System.out.print(leftMax[i]+"\t");
                }
        }
}

// T.C. => O(N)
// S.C. => O(1)
