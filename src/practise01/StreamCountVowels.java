package practise01;

public class StreamCountVowels {

	public static void main(String[] args) {
		String str = "Programming is JAVA is Awesome";
		
		String vowels = "aeiouAEIOU";
		
		long count = str.chars()
				.filter(c -> vowels.indexOf(c) != -1)
				.count();
		
		System.out.println(count);
	}

}
