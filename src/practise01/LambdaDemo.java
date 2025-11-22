package practise01;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Bavan");
		nameList.add("Mahela");
		nameList.add("Chamara");
		nameList.add("Piyumi");
		
//		printName(nameList);
		
		nameList.forEach((name) -> System.out.println(name));

	}
	
//	private static void printName(List<String> nameList) {
//		for(int i=0;i<nameList.size();i++) {
//			System.out.println(nameList.get(i));
//		}
//	}

}
