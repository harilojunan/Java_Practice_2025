package java_threads;

// Extends Thread class
class Cake extends Thread{
	public void run() {
		System.out.println("Mixing ingredients for cake "+ Cake.currentThread().getId());
		System.out.println("Backing cake "+ Cake.currentThread().getId());
		System.out.println("Decorating cake "+ Cake.currentThread().getId());
	}
}

// Implements Runnable
//class Cake implements Runnable{
//	public void run() {
//		System.out.println("Mixing ingredients for cake "+ Cake.currentThread().getId());
//		System.out.println("Backing cake "+ Cake.currentThread().getId());
//		System.out.println("Decorating cake "+ Cake.currentThread().getId());
//	}
//}


public class ThreadBaking {

	public static void main(String[] args) {
		int cakeCount = 5;
		
//		 Extends Thread class
		for(int i=0;i<cakeCount;i++) {
			Cake cake = new Cake();
			cake.start();
		}
		
//		 Implements Runnable
//		for(int i=0;i<cakeCount;i++) {
//			Cake cake = new Cake();
//			Thread thread = new Thread(cake);
//			thread.start();
//		}
	}
}
