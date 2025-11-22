package java_threads;

class Task implements Runnable{
	
	private String taskName;
	
	public Task(String name) {
		this.taskName = name;
	}

	@Override
	public void run() {
//		the logic for thread goes here
		System.out.println(taskName + " is running on thread: " +
				Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		}catch (InterruptedException e){
			Thread.currentThread().interrupt();	
		}
		
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
//		 Create an instance of the Runnable task
		Task task1 = new Task("Printer A");
		Task task2 = new Task("Printer B");
		
//		Create the actual Thread objects and pass the Runnable o them
		Thread threadA = new Thread(task1);
		Thread threadB = new Thread(task2);
		
//		Start the threads. This calls the run() method internally
		threadA.start();
		threadB.start();

	}

}
