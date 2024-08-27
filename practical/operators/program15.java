class C2W{
	public static void main(String[] args){
		int x = 19;

		System.out.println(x++ + x++);
		
		// now x = 21
		System.out.println(++x + x++ + ++x); 
	}
}
