package java_threads;

class CakeCounter{
	
	int cakeCount = 0;
	
	public synchronized void increament() {
		cakeCount++;
	}
}

class Team implements Runnable{
	
	CakeCounter counter;
	
	Team(CakeCounter counter){
		this.counter = counter;
	}
	
	public void run() {
		for(int i =0;i<1000;i++) {
			counter.increament();
		}
	}
}


public class SynchronizedBackery {

	public static void main(String[] args) {
		CakeCounter counter = new CakeCounter();
		Thread team1 = new Thread(new Team(counter));
		Thread team2 = new Thread(new Team(counter));
		Thread team3 = new Thread(new Team(counter));
		
		team1.start();
		team2.start();
		team3.start();
		
		try {
			team1.join();
			team2.join();
			team3.join();
		}catch(Exception e) {
			
		}
		
		System.out.println(counter.cakeCount);
	}

}
