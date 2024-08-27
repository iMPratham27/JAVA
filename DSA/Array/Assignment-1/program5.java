
class ArrayDemo{

	public static void main(String[] args){
	
		int A[] = new int[]{1,2,3,4,5};

		int psArr[] = new int[A.length];
		psArr[0] = A[0];
		for(int i=1; i<A.length; i++){
		
			psArr[i] = psArr[i-1] + A[i];
		}

		for(int i=0; i<A.length; i++){
		
			System.out.print(psArr[i] + "\t");
		}

		System.out.println();
	}
}
