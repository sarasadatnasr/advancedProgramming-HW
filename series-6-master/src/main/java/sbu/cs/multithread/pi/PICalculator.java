package sbu.cs.multithread.pi;
import sbu.cs.multithread.priority.BlackThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class PICalculator {

    /**
     * calculate pi and represent it as string with given floating point number (numbers after .)
     * check test cases for more info
     * check pi with 1000 digits after floating point at https://mathshistory.st-andrews.ac.uk/HistTopics/1000_places/
     *
     * @param floatingPoint number of digits after floating point
     * @return pi in string format
     */
    public String calculate(int floatingPoint) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService service = Executors.newFixedThreadPool(1);
        int userAns = 20;
        userAns = floatingPoint+1;
        Thread function = new Thread(new Functions(floatingPoint));
        function.start();
            //new tester(userAns).print();
            String str=new Functions(userAns).print();
            return str;

    }
    }