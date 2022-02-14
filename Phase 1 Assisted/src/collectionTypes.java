import java.util.*;
public class collectionTypes {

	public static void main(String[] args) {
		// Arrays
		System.out.println("This Is Array List");
		ArrayList<String> name=new ArrayList<String>();
		name.add("Andrew Spider man");
		name.add("Toby Spider man");
		
		System.out.println(name); 
		
		// Linked
		System.out.println("This Is Linked List");
		LinkedList<String> linkname=new LinkedList<String>();
		linkname.add("Tom Spider Man");
		linkname.add("Iron Man");
		
		System.out.println(linkname); 
		
		//Vector
		System.out.println("This Is Vector Collection");
		Vector<String> vectorname=new Vector<String>();
		vectorname.add("Captain America");
		vectorname.add("Black Widow");
		
		System.out.println(vectorname); 
		
		//Stack
		System.out.println("This Is Stack Collection");
		Stack<String> stackname=new Stack<String>();
		stackname.add("Black Panther");
		stackname.add("Falcon");
		
		System.out.println(stackname); 

		//Hash Set
		System.out.println("This Is Hash Set");
		HashSet<String> hashname=new HashSet<String>();
		hashname.add("Winter Solider");
		hashname.add("Scarlet Witch");
		
		System.out.println(hashname);
		
		//Linked Hash Set
		System.out.println("This Is Linked Hash Set");
		LinkedHashSet<String> linkhashname=new LinkedHashSet<String>();
		linkhashname.add("Thor");
		linkhashname.add("Hulk");
		
		System.out.println(linkhashname);
		
		//Tree Set
		System.out.println("This Is Tree Set");
		TreeSet<String> treename=new TreeSet<String>();
		treename.add("Captain Marvel");
		treename.add("Doctor Strange");
		
		System.out.println(treename);
		
		//Array Deque
		System.out.println("This Is Array Deque");
		Deque<String> dequename=new ArrayDeque<String>();
		dequename.add("Hwakyee");
		dequename.add("Vision");
		
		System.out.println(dequename);
		
		
		
	}

}
