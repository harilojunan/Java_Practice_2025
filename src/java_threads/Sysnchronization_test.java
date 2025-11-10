package java_threads;

class CounterTest {
	private int count = 0;
	
	public synchronized void increament() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

public class Sysnchronization_test {

	public static void main(String[] args) throws InterruptedException {
		CounterTest counter = new CounterTest();
		
		Thread t1 = new Thread(() -> {
			for (int i=0; i<1000; i++)
				counter.increament();
		});
		Thread t2 = new Thread(() -> {
			for (int i=0; i<1000; i++)
				counter.increament();
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Final count: " + counter.getCount());

	}

}
