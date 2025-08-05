package practise01;

class Addition //variable length argument
{
	
//	public int add(int i , int j) {
//		return i+j;
//	}
	
//	public int add(int i , int j, int k) {
//		return i+j+k;
//	}
	
	int sum = 0;
	public int add(int ...i) {
		for(int val:i)
			sum = sum + val;
		
		return sum;
	}
}

public class VarArgsDemo {

//	public static void main(String[] args) {
//		
//		Addition obj = new Addition();
//		int result = obj.add(10,15,36,658);
//		System.out.println(result);
//
//	}
	
	public static void main(String... args) {
		
		Addition obj = new Addition();
		int result = obj.add(10,15,36,658);
		System.out.println(result);

	}

}
