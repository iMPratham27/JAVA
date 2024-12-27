
import java.util.*;

class Demo{

	public static void main(String[] args){
	
				
		HashMap<String,Integer> empIds = new HashMap<>();

		///ADD ELEMENT
		empIds.put("John",12345);
		empIds.put("Rock",23456);
		empIds.put("Brock",543210);

		System.out.println(empIds);

		System.out.println(empIds.get("John"));

		System.out.println(empIds.containsKey("George"));
		System.out.println(empIds.containsValue(12345));
		
	}
}
