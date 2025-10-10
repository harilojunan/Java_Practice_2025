package practise01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPalindrom {

	public static void main(String[] args) {
		List<String> lis = Arrays.asList("ABBA","ACCA","test","rest");
		
		List<String> palindromList = lis.stream()
				.filter(x -> x.equals(new StringBuilder(x).reverse().toString()))
				.collect(Collectors.toList());
		
		System.out.println(palindromList);
	}

}
