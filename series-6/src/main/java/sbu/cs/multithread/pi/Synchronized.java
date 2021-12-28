package sbu.cs.multithread.pi;
import java.math.BigDecimal;
import java.math.MathContext;
public class Synchronized {

        public static BigDecimal piNum = new BigDecimal(0,new MathContext(10000));

        synchronized static public void addPiNum(BigDecimal bg){
            piNum = piNum.add(bg);
            //System.out.println(piNum);
        }


        public static BigDecimal getPiNum() {
            return piNum;
        }
    }