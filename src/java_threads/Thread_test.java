package java_threads;

class Counter {
	private int count = 0;
	
	public void increament() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

public class Thread_test {

	public static void main(String[] args) throws InterruptedException{
		Counter counter = new Counter();
		
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
