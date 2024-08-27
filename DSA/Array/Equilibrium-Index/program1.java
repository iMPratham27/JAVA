// brute-force
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{-7,1,5,2,-4,3,0};
		int N = 7;
		int flag = 0;

		for(int i=0; i<N; i++){

			int leftSum = 0;
			int rightSum = 0;
		
			for(int j=0; j<i; j++){
			
				leftSum = leftSum + arr[i];
			}

			for(int j=i+1; j<N; j++){
			
				rightSum = rightSum + arr[i];
			}

			if(leftSum == rightSum){
			
				flag = 1;
				System.out.println("index: "+i);
				break; // to get the minimum index
			}
		}

		if(flag == 0){
		
			System.out.println("-1");
		}
	}
}

// T.C. => O(N^2)  
