package concurrency;

public class Counter {
	private int count;
	
	public void increment() {
		setCount(getCount() + 1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
