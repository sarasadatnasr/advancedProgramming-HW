package sbu.cs.multithread.pi;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Functions extends Thread {
    private int reminders[]; //special array required for calculation
    private int piDigits[]; //result array
    private int remSize; //size of reminders array
    private int digits;
    private int tempInvalid = 0; //counter for temporary invalid digits

    private void calc() {
        int carryOver = 0;

        //main iteration
        for (int i = 0; i < digits; i++) {//next number calculation
            int sum = 0;
            for (int k = remSize - 1; k > 0; k--) {
                sum = reminders[k] * 10 + carryOver;
                carryOver = (sum / (2 * k + 1)) * k;
                reminders[k] = sum % (2 * k + 1);
            }
            //last step: k=0
            sum = reminders[0] * 10 + carryOver;
            int nextNumber = sum / 10; //calculated i-th number of pi
            reminders[0] = sum % 10;
            nextNumber = invalidDigitsControl(nextNumber, i);
            piDigits[i] = nextNumber; //write new digit to result
        }
    }

    private int invalidDigitsControl(int nextNumber, int position) {
        if (nextNumber == 9) {
            tempInvalid++;
            return 9;
        }

        if (nextNumber == 10) {
            for (int h = position - tempInvalid; h < position; h++) {
                if (piDigits[h] == 9)
                    piDigits[h] = 0;
                else
                    piDigits[h] += 1;
            }
            tempInvalid = 1;
            return 0;
        }

        tempInvalid = 1;
        return nextNumber;
    }

    public Functions(int digits) {
        this.digits = digits;

        remSize = 10 * digits / 3;
        reminders = new int[remSize];
        piDigits = new int[digits];

        Arrays.fill(reminders, 2); //data initialization
        calc();
    }

    public String print() {
        // System.out.print("3.");
        String str="";
        for (int i = 1; i < piDigits.length; i++){
            str+=Integer.toString(piDigits[i]);}
        return "3."+str;}
}