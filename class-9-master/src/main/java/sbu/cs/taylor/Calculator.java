package sbu.cs.taylor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator implements Runnable {

    private final int counter;
    private static final BigDecimal ONE = new BigDecimal(1, new MathContext(100, RoundingMode.HALF_DOWN));

    public Calculator(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        BigDecimal bigDecimal = new BigDecimal(1);
        bigDecimal = bigDecimal.setScale(100, BigDecimal.ROUND_HALF_DOWN);
        for (int i = 1; i < counter; i++) {
            BigDecimal tmp = new BigDecimal(i).setScale(100, BigDecimal.ROUND_HALF_DOWN);
            bigDecimal = bigDecimal.multiply(tmp, MathContext.DECIMAL128);
        }
        bigDecimal = ONE.divide(bigDecimal, MathContext.DECIMAL128);
        Taylor.endComputation(bigDecimal);
    }
}
