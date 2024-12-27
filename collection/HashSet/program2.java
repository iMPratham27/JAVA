
///Remove Duplicates

import java.util.*;

class RemoveDup{

	public static void main(String[] args){
	
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(2);
		numberList.add(1);

		System.out.println("List: "+ numberList);

		Set<Integer> numberSet = new HashSet<>();
		numberSet.addAll(numberList);
		
		System.out.println("Set: "+ numberSet);
	}
}
