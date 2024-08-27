
//brute-force
/*
class ArrayDemo{

	public static void main(String[] args){
	
		char ch[] = new char[]{'a','b','e','g','a','g'};
		int N = 6;
		int itr = 0;
		int count = 0;
		for(int i=0; i<N; i++){
		
			for(int j=0; j<N; j++){
			
				if(i<j && ch[i]=='a' && ch[j]=='g')
					count++;
				itr++;
			}
		}

		System.out.println("count: "+count);
		System.out.println("itr: "+itr);  // 36
	}
}
*/

//brute-force
/*
class ArrayDemo{

        public static void main(String[] args){

                char ch[] = new char[]{'a','b','e','g','a','g'};
                int N = 6;
                int itr = 0;
                int count = 0;
                for(int i=0; i<N; i++){
			
			if(ch[i]=='a'){
                        	for(int j=i+1; j<N; j++){

                                	if(ch[j]=='g')
                                        	count++;
                                	itr++;
                        	}
			}
                }

                System.out.println("count: "+count);
                System.out.println("itr: "+itr);  // 6
        }
}

T.C => O(N^2)
*/


// optimized
class ArrayDemo{

	public static void main(String[] args){
	
		char arr[] = new char[]{'a','b','e','g','a','g'};
		int N = 6;
		int count = 0;
		int aCount = 0;
		int itr = 0;

		for(int i=0; i<N; i++){
		
			if(arr[i]=='a')
				aCount++;
			else if(arr[i]=='g')
				count = count + aCount;

			itr++;
		}

		System.out.println("Count: "+count);
		System.out.println("itr: "+itr);  // 6
	}
}

// T.C => O(N)
// S.C => O(1)

