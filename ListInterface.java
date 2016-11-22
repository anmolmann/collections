package collections;
import java.util.*;

public class ListInterface {
	List<Integer> a;
	List<Integer> v;
	List<String> l;
	public ListInterface() {
		
		//implementation of ArrayList
		/*
		 * if we're at n-1 location(during insertion) -> double size of array 
		 * if half ArrayList is half empty -> reduce size of the ArrayList by half
		 * 
		 * good performance only over a period of time (Imortisation)
		 */
		a = new ArrayList<Integer>();	// not thread safe
		
		v = new Vector<Integer>();	// thread safe
		
		// linkedList can be used either as a queue or as a stack
		// steady performance over a period of time
		l = new LinkedList<String>();	// default implementation as -> circular doubly linked list
	}
	
	public void array() {
		a.add(5);
		a.add(3);
		a.add(10);
		a.add(0);
		System.out.println("-------LIST INTERFACE-------\n" + a.contains(2) + " " + a.remove(0));
		System.out.println("Array : " + a);
		Collections.sort(a);	// only used for list interface
		
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			Integer t = (Integer)i.next();
			System.out.print(t + " ");
			//i.next();
		}
		System.out.println("\nSize :- " + a.size() + ", hashCode : " + a.hashCode() + "\n" + a.get(0) + " " + a.get(2));
	}
	
	public void vector() {
		
	}
	
	public void linked_list() {
		l.add("anmol mann");
		l.add("satinder kaur");
		l.add("lucky");
		System.out.println("Size  : " + l.size());
		l.sort(new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.compareTo(s2) > 0)
					return -1;
				else if(s1.compareTo(s2) < 0)
					return 1;
				return 0;
			}
		});
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			String t = (String)i.next();
			System.out.println(t);
		}
	}
}
