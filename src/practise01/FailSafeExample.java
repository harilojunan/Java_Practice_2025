package practise01;

import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		for(Integer key: map.keySet()) {
			System.out.println("Key :" + key + ", Value :" + map.get(key));
			map.put(4, "D");
		}
		System.out.println("Final map: " + map);
	}

}
