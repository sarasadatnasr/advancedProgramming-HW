package sbu.cs.multithread.pi;
import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class PICalculator {
    /**
     * calculate pi and represent it as string with given floating point number (numbers after .)
     * check test cases for more info
     * check pi with 1000 digits after floating point at https://mathshistory.st-andrews.ac.uk/HistTopics/1000_places/
     *
     * @param floatingPoint number of digits after floating point
     * @return pi in string format
     */
    public String calculate(int floatingPoint) throws InterruptedException {
        Synchronized.piNum = BigDecimal.valueOf(0);
        final ExecutorService executor = Executors.newFixedThreadPool(8);
        for (int i = 0; i <= floatingPoint; i++) {
            //	BigDecimal decimal = new BigDecimal(i);
            CalculationThread cal = new CalculationThread(i);
            executor.submit(cal);
        }
        executor.shutdown();
        executor.awaitTermination(100, TimeUnit.SECONDS);
//        executor.execute(new Calculator(floatingPoint));
//        Calculator  cal=new Calculator(floatingPoint);
//   //     Thread t1 =new Thread(cal);
//   //     t1.start();
//   //     Calculator cal = new Calculator(floatingPoint);
////        cal.run();
//        executor.execute(cal);

        //     return  Calculator.getResault().toString();
        return Synchronized.getPiNum().toString().substring(0,floatingPoint+2);
    }
}


