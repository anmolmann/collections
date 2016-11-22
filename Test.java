package collections;

public class Test {
	public static void main(String args[]) {
		
		// List Interface (extend Collection) , maintains index
		
		ListInterface l = new ListInterface();
		l.array();
		l.linked_list();	// implements list and queue
		
		// Queue Interface (classes : Priority Queue, linkedList, Stack)
		
		
		// Set Interface ( <- class HashSet(unordered, unsorted) <- class LinkedHashSet(Unordered, sorted))
		//               ( <- SortedSet <- navigableSet <- class TreeSet)
		
		
		/* Map Interface (does not extend Collection)
		 * 				 (unordered map interface)
		 * 				 ( <- class HashTable)
		 *				 ( <- class HashMap(unsorted, unordered) <- class LinkedHashMap(unsorted, ordered))
		 *
		 * HashMaps :- no synchronization
		 * HashTables :- works for multi-threaded tables
		 */
		maps m = new maps();
		m.test();
		
		
		// SortedMap :- ordered map interface ( <- navigableMap <- class TreeMap(sorted, ordered))
		m.test2();
	}
}
