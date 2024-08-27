
class ArrayDemo{

	public static void main(String[] args){
	
		int A[] = new int[]{16,17,4,3,5,2};

		for(int i=0; i<A.length; i++){
			
			int max = A[i];
			int flag = 0;
			for(int j=i+1; j<A.length; j++){
			
				if(A[j]>max){
				
					flag = 1;
				}
			}

			if(flag==0)
				System.out.print(max+" ");
		}
	}
}
