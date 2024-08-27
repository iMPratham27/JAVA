
class ArrayDemo{

	public static void main(String[] args){
	
		char arr[] = new char[]{'a','b','c','y','x','o','p'};

		for(int i=0; i<arr.length; i++){
		
			if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u' && arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U'){
			
				System.out.print(arr[i]+"\t");
			}
		}
	}
}
