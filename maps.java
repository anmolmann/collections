package collections;
import java.util.*;
import java.util.Map.Entry;
public class maps {
	// unordered map
	Map <Integer, String>m;
	maps() {
		m = new HashMap<Integer, String>();
	}
	
	public void test() {
		m.put(100, "Anmol Mann");
		m.put(1001, "Satinder Kaur");
		m.put(201, "Adarshpal Singh Mann");
		m.put(400, "Anmol Mann");
		
		System.out.println("\n--------------UNORDERED MAP-----------\nget() :- " + m.get(100));
		
		Set<Integer> s = m.keySet();
		Iterator <Integer>i1 = s.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
		System.out.print("\n");
		
		Set<Map.Entry<Integer, String>> s1 = m.entrySet();
		
		Iterator<Entry<Integer, String>> i = s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("----SORT MAP BY VALUE-----");
		
		List<Map.Entry<Integer, String>> l = new LinkedList<Map.Entry<Integer, String>>(m.entrySet());
		
		Collections.sort(l, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> a, Entry<Integer, String> b) {
				// TODO Auto-generated method stub
				if(a.getValue().compareTo(b.getValue()) > 0) return 1;
				else if(a.getValue().compareTo(b.getValue()) < 0) return -1;
				return 0;
			}
		});
		
		i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	}
	
	
	public void test2() {
	// treeMap	
		Map<Integer, String> m2 = new TreeMap<Integer, String>();
		m2.put(100, "Anmol Mann");
		m2.put(1001, "Satinder Kaur");
		m2.put(201, "Adarshpal Singh Mann");
		m2.put(400, "Anmol Mann");
		
		System.out.println("\n--------------ORDERED MAP-----------\nget() :- " + m2.get(100));
		
		Set<Integer> s = m2.keySet();
		Iterator <Integer>i1 = s.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
		System.out.print("\n");
		
		Set<Map.Entry<Integer, String>> s1 = m2.entrySet();
		
		Iterator<Entry<Integer, String>> i = s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Equal ? : " + m2.equals(m));
		
		for(Map.Entry<Integer, String> e: m2.entrySet()) 
			System.out.println(e.getKey() + " : " + e.getValue());
	}
}
