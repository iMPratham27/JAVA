
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,2,3,4};
		int x = 3;
		int N = 4;

		for(int i=0; i<N; i++){
		
			if(x == arr[i])
				System.out.println(i);
		}
	}
}
