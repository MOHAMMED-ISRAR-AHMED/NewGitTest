package maps;

import java.util.*;

public class navigablemap {
public static void main(String[] args) {
	NavigableMap<Integer,String> nm=new TreeMap<>();
	nm.put(3, "uae");
	nm.put(1, "emirates");
	nm.put(2, "muscat");
	nm.put(2, "muscat"); //doesnt allows duplicate
//	nm.put(2, "mucat"); // but if we mismatch the values it will take the update value
	
	System.out.println("doesnt maintains the insert order but follows the order\n"
						+nm+"\n");
}
}