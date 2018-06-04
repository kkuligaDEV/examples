package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LocksDemo {
	private Counter counter = new Counter();
	private SyncCounter syncCounter = new SyncCounter();
	
	public void demoCounter() {
		ExecutorService service = Executors.newCachedThreadPool();
		IntStream.range(0,1000).forEach(i -> service.submit(counter::increment));
		service.shutdown();
		System.out.println("Counter count: " + counter.getCount());
	}
	
	public void synDemoCounter() {
		ExecutorService service = Executors.newCachedThreadPool();
		IntStream.range(0,1000).forEach(i -> service.submit(syncCounter::increment));
		service.shutdown();
		System.out.println("Sync Counter count: " + syncCounter.getCount());
	}
	
	public static void main(String[] args) {
		LocksDemo locks = new LocksDemo();
		locks.demoCounter();
		locks.synDemoCounter();
	}

}
