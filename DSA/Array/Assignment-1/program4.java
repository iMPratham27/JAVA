
class ArrayDemo{

	public static void main(String[] args){

		int A[] = new int[]{2,4,1,3,2};
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0; i<A.length; i++){
	
			if(A[i]>max)
				max = A[i];
		}

		for(int i=0; i<A.length; i++){
	
			count = count + (max - A[i]);
		}

		System.out.println(count);

	}
}
