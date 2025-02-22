

// Find closest number

class ArrayDemo{

	static int findClosestNum(int arr[] , int k){
	
		int closest = arr[0];

		for(int i=1; i<arr.length; i++){
		
			int currentDiff = (arr[i] > k) ? arr[i]-k : k-arr[i] ;

			int closestDiff = (closest > k) ? closest-k : k-closest;

			if(closestDiff > currentDiff || (closestDiff == currentDiff && arr[i] > closest)){
			
				closest = arr[i];
			}
		}

		return closest;
	}

	public static void main(String[] args){
	
		int arr1[] = new int[]{1,3,6,7};
		int arr2[] = new int[]{1,2,3,5,6};
		int k = 4;

		int closestNum = findClosestNum(arr2,k);

		System.out.println(closestNum);
			
	}
}
