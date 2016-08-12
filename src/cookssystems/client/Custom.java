package cookssystems.client;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Custom implements Runnable{

	
	private static Lock lock = new ReentrantLock();
	private String letter;
	private static AtomicInteger counter = new AtomicInteger(0);
	
	
	public Custom(String letter) {
		super();
		this.letter = letter;
	}


	public static Lock getLock() {
		return lock;
	}


	public static void setLock(Lock lock) {
		Custom.lock = lock;
	}


	public String getLetter() {
		return letter;
	}


	public void setLetter(String letter) {
		this.letter = letter;
	}


	public static AtomicInteger getCounter() {
		return counter;
	}


	public static void setCounter(AtomicInteger counter) {
		Custom.counter = counter;
	}
	
	public void run()
	{
		synchronized(lock){
			for(int i = 0; i< 10; i++)
			{
				int temp = (counter.incrementAndGet() % 3);
				switch (temp) {
					case 1:
						System.out.println("A \t");
						break;
					case 2:
						System.out.println("B \t");
					break;
					case 0:
						System.out.println("C \t");
					break;
				}
			}
		}
	}
	
	
	

	
	
}	


	

	
			
		


