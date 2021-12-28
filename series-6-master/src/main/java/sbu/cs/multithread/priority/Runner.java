package sbu.cs.multithread.priority;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.List;


public class Runner extends Thread {

    public static List<Message> messages = new ArrayList<>();

    /**
     * add your codes to this function. this function is the caller function which will be called first.
     * changing other codes in this function is allowed.
     *
     * @param blackCount    number of black threads
     * @param blueCount     number of blue threads
     * @param whiteCount    number of white threads
     */
    public void run(int blackCount, int blueCount, int whiteCount) throws InterruptedException {
        List<ColorThread> colorThreads = new ArrayList<>();

        for (int i = 0; i < blackCount; i++) {
            BlackThread blackThread = new BlackThread();
            colorThreads.add(blackThread);
            blackThread.start();Thread.sleep(10);
        }
        for (int i = 0; i < blueCount; i++) {
            BlueThread blueThread = new BlueThread();
            colorThreads.add(blueThread);
            blueThread.start();Thread.sleep(10);
        }
        for (int i = 0; i < whiteCount; i++) {
            WhiteThread whiteThread = new WhiteThread();
            colorThreads.add(whiteThread);
            whiteThread.start();Thread.sleep(10);
        }
    }

    synchronized public static void addToList(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService service = Executors.newFixedThreadPool(3);
        Thread black = new Thread(new BlackThread());
        Thread blue = new Thread(new BlueThread());
        Thread white = new Thread(new WhiteThread());
        black.start();
        blue.start();
        white.start();
        try {
            countDownLatch.await();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void countDown() {

    }
}
