package sbu.cs.taylor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Taylor {

    private static BigDecimal taylor = new BigDecimal(0, new MathContext(100, RoundingMode.HALF_DOWN)).setScale(34, RoundingMode.HALF_DOWN);

    synchronized public static void endComputation(BigDecimal bd) {
        taylor = taylor.add(bd);
    }

    public static BigDecimal getTaylor() {
        return taylor;
    }
}
