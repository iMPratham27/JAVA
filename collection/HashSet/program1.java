

import java.util.*;

class Demo{

	public static void main(String[] args){
	
		Set<String> names = new HashSet<>();

		///ADD ELEMENTS
		names.add("Walter");
		names.add("Jesse");
		names.add("Skyler");
		names.add("Mike");
		names.add("Saul");
		names.add("Walter");
		names.add("Walter");
		names.add("Walter");

		//HashSet does not add "DUPLICATES" and does not print the elements in specific order
		System.out.println(names);


		///SIZE OF HASHSET
		System.out.println("Size: " + names.size());

		///REMOVE ELEMENTS
		names.remove("Walter");
		System.out.println("Removed Walter: "+ names);


	}
}
