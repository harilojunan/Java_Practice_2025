package dotEqualsAndHashCode;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "Hari";
		
		Employee e2 = new Employee();
		e2.id = 1;
		e2.name = "Hari";
		
		System.out.println(e1.equals(e2));
		
		int expectedSize = 5;
		int capacity = (int)( expectedSize / 0.75f);
		HashSet<Employee> set = new HashSet<>(capacity);
		set.add(e1);
		set.add(e2);
		
		System.out.println(set.size());
		
//		String s1 = new String("Hari");
//		String s2 = new String("Hari");
//		
//		System.out.println(s1.equals(s2));


	}

}
