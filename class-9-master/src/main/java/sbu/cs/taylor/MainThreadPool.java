package sbu.cs.taylor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainThreadPool {

    private static final ExecutorService executor = Executors.newFixedThreadPool(8);

    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        long st = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            executor.submit(new Calculator(i));
        }
        executor.shutdown();
        executor.awaitTermination(10000, TimeUnit.MILLISECONDS);
        System.out.println("time in milis: " + (System.currentTimeMillis() - st));
        System.out.println(Taylor.getTaylor());
    }

}
