package concurrency;

public class MyRunnable implements Runnable {

	private int id;
	private Thread thread = new Thread(this);
	
	public MyRunnable(int id) {
		this.id = id;
	}
	public void start() {
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println("Hello from the "+this);
	}
	
	@Override
	public String toString() {
		return String.format("MyRunnable{id=%d}", id);
	}

}
