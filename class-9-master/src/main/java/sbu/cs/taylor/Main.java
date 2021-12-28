package sbu.cs.taylor;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static final AtomicInteger ai = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        int threadCount = Integer.parseInt(args[1]);
        long st = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            while (ai.get() >= threadCount) {
                Thread.sleep(10);
            }
            ai.incrementAndGet();
            new Thread(new Calculator(i)).start();
        }
        while (ai.get() != 0) {
            Thread.sleep(10);
        }
        System.out.println("time in milis: " + (System.currentTimeMillis() - st));
        System.out.println(Taylor.getTaylor());
    }

    public static void decreseCounter() {
        ai.decrementAndGet();
    }
}
