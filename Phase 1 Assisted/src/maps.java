import java.util.*;

public class maps {

	public static void main(String[] args) {
		
		//Hash Map
		System.out.println("\nThis Is Hash Map:");

		Map<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Harry Potter", 1);
        hashmap.put("Hermione Granger", 2);
        hashmap.put("Ron Weasley", 3);
        
        System.out.print("\t" + hashmap);
        
        //Tree Map
		System.out.println("\nThis Is Tree Map:");

        Map<String, Integer> treemap = new TreeMap<>();
		treemap.put("Earth", 1);
        treemap.put("Mars", 2);
        treemap.put("Enceladus", 3);
        
        System.out.print("\t" + treemap);
        
        //Linked Hash Map
		System.out.println("\nThis Is Linked Hash Map:");

		Map<String, Integer> linkmap = new LinkedHashMap<>();
		linkmap.put("Apple", 1);
		linkmap.put("Google", 2);
		linkmap.put("Microsoft", 3);
		
		System.out.print("\t" + linkmap);
        
	}

}
