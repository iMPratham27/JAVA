class Demo{
	public static void main(String[] args){
		char ch = 'A';

		if(ch >= 'a' && ch <= 'z'){
			System.out.println(ch+" is a lowercase alphabet");
		}else if(ch >= 'A' && ch <= 'Z'){
			System.out.println(ch+" is a uppercase alphabet");
		}else{
			System.out.println("enter a valid alphabet");
		}
	}
}
