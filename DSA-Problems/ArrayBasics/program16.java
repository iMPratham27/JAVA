

// Last index of One

class ArrayDemo{

	public static void main(String[] args){
	
		String s = "100101";

		int index = -1;

		for(int i=0; i<s.length(); i++){
		
			if(s.charAt(i) == '1'){
			
				index = i;
			}
		}

		if(index == -1){
		
			System.out.println("1 is not present");
		}else{
		
			System.out.println("Last index of 1 is: " + index);
		}
	}
}
