package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LocksDemo {
    LockedCounter lc = new LockedCounter();

    public void demoLockedCounter() {
        ExecutorService service = Executors.newCachedThreadPool();
        IntStream.range(0, 1000)
                .forEach(i -> service.submit(lc::increment));
        service.shutdown();
        System.out.println("Locked Counter count= " + lc.getCount());
    }

    public static void main(String[] args) {
        LocksDemo ld = new LocksDemo();
        ld.demoLockedCounter();
    }
}
