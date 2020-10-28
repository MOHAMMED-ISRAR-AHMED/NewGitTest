package maps;

import java.util.*;

public class sortedmap {
public static void main(String[] args) {
	
	// SortedMap implementation by TreeMap class
	SortedMap<Integer,String> sm=new TreeMap<>();
	
	sm.put(2, "zurich");
	sm.put(4, "kuwait");
	sm.put(3, "london");
	sm.put(1, "dubai");
	
	System.out.println("maintains the insertion order in ascending order\n"+sm+"\n");
	// Access the first key of the map
    System.out.println("First Key: " + sm.firstKey()+"\n");

    // Access the last key of the map
    System.out.println("Last Key: " + sm.lastKey()+"\n");

}
}