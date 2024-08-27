
class ArrayDemo{

	public static void main(String[] args){
	
		int arr[] = new int[]{1,4,5,2,7,8,3};
		int N = 7;

		int A = 2;
		int B = 5;
		int flag = 0;
		for(int i=0; i<N; i++){
		
			if(arr[i]>=A && arr[i]<=B)
				flag = 1;
		}


		if(flag==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
