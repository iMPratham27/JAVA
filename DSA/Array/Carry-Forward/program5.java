// to get count of abc, same as program4
class ArrayDemo{

	public static void main(String[] args){
	
		char arr[] = new char[]{'a','b','c','a','b','c'};
		int N = 6;
		int count = 0;
		int aCount = 0;
		int bCount = 0;

		for(int i=0; i<N; i++){
		
			if(arr[i]=='a')
				aCount++;
			else if(arr[i]=='b')
				bCount = bCount + aCount;
			else if(arr[i]=='c')
				count = count + bCount;
		}
		System.out.println("count: "+count); //4
	}
}

// T.C. => O(N)
