
import java.util.*;

class Demo{

	public static void main(String[] args){
		
		///DEFINE
		ArrayList<Integer> arrayList = new ArrayList<>();

		///ADD AN ELEMENT
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);

		//ArrayList maintain the order

		///PRINT ARRAYLIST
		System.out.println("array list: " + arrayList);

		///SIZE
		System.out.println("Size: " + arrayList.size());

		///GET AN ELEMENT
		System.out.println("element at index 1: " + arrayList.get(1));

		///DELETE AN ELEMENT
		arrayList.remove(3);
		System.out.println("removed element at index 3: " + arrayList);




	}
}
