
class ArrayDemo{

	public static void main(String[] args){
	
		int A[] = new int[]{1,2,2};

		int B = 2;

		int count = 0;
		for(int i=0; i<A.length; i++){
		
			if(A[i] == B)
				count++;
		}
		
		System.out.println(count);
	}
}

//	T.C. => O(N)
