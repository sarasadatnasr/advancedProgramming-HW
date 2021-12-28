package sbu.cs.multithread.pi;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculationThread implements Runnable {
    private int floatingPoint;

    public CalculationThread(int floatingPoint) {
        this.floatingPoint = floatingPoint;
    }

    @Override
    public void run() {
        BigDecimal bg1 = new BigDecimal(4);
        BigDecimal bg2 = new BigDecimal(2);
        BigDecimal bg3 = new BigDecimal(1);
        BigDecimal bg4 = new BigDecimal(1);
        BigDecimal bg5 = new BigDecimal(1);
//
        bg1 = bg1.divide(BigDecimal.valueOf(8*floatingPoint+1),1000,BigDecimal.ROUND_HALF_UP);
        bg2 = bg2.divide(BigDecimal.valueOf(8*floatingPoint+4),1000,BigDecimal.ROUND_HALF_UP);
        bg3 = bg3.divide(BigDecimal.valueOf(8*floatingPoint+5),1000,BigDecimal.ROUND_HALF_UP);
        bg4 = bg4.divide(BigDecimal.valueOf(8*floatingPoint+6),1000,BigDecimal.ROUND_HALF_UP);
        bg5 = bg5.divide(BigDecimal.valueOf(16),1000,BigDecimal.ROUND_HALF_UP);
//
//        System.out.println("bg1    " + bg1);
//        System.out.println("bg2    " + bg2);
//        System.out.println("bg3    " + bg3);
//        System.out.println("bg4    " + bg4);

        bg1 = bg1.subtract(bg2);
        //       System.out.println("bg1- bg2  "+ bg1);
        bg1 = bg1.subtract(bg3);
        //     System.out.println("bg1-bg3   "+ bg1);
        bg1 = bg1.subtract(bg4);
        //      System.out.println("bg1-bg4   "+bg1);
        bg5 = bg5.pow(floatingPoint);
        //    System.out.println("bg5    "+bg5);
        bg1 = bg1.multiply(bg5);
        //    System.out.println("resault: "+bg1);

        bg1 = bg1.setScale(1000, RoundingMode.HALF_DOWN);
        //  System.out.println("resault with scale: "+bg1);

        Synchronized.addPiNum(bg1);
    }
}
