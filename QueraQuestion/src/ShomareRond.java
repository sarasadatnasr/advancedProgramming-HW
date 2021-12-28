import java.util.Arrays;
import java.util.Scanner;

public class ShomareRond {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        String[] result=new String[n];
       /* String str= input.next();
        System.out.println(repeatFourTime(str));
        System.out.println(consecutiveNumber(str));
        System.out.println(mirror(str));*/
        for(int i=0;i<n;i++){
            String str= input.next();
            if(repeatFourTime(str)|| consecutiveNumber(str) || mirror(str)){
                result[i]="Ronde!";
            }
            else {
                result[i]="Rond Nist";
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }
    }

    public static boolean repeatFourTime(String str) {
        int p = 0;
        boolean answer = false;
        int[] digit = new int[8];
        int[] repeats = new int[8];
        String[] strDigit = new String[8];
        strDigit = str.split("");
        for (int i = 0; i < 8; i++) {
            digit[i] = Integer.parseInt(strDigit[i]);
        }
        Arrays.sort(digit);
        for (int i = 0; i < 7; i++) {
            if (digit[i] == digit[i + 1]) {
                repeats[p]++;
                if (repeats[p] >= 3) {
                    answer = true;
                }
            } else {
                p++;
            }
        }
        return answer;
    }
    public static boolean consecutiveNumber(String str){
    int p = 0;
    boolean answer = false;
    int[] digit = new int[8];
    int[] repeats = new int[8];
    String[] strDigit = new String[8];
    strDigit = str.split("");
        for (int i = 0; i < 8; i++) {
        digit[i] = Integer.parseInt(strDigit[i]);
    }
        for (int i = 0; i < 7; i++) {
            if (digit[i] == digit[i + 1]) {
                repeats[p]++;
                if (repeats[p] >= 2) {
                    answer = true;
                }
            } else {
                p++;
            }
        }
    return answer;}

    public static boolean mirror(String str){
        int j = 0;
        boolean answer = false;
        int[] digit = new int[8];

        String[] strDigit = new String[8];
        strDigit = str.split("");
        for (int i = 0; i < 8; i++) {
            digit[i] = Integer.parseInt(strDigit[i]);
        }
        while(j<=4){
            if(digit[j]==digit[7-j]){
                j++;
                if(j==4){
                answer=true;}
            }
            else {
                break;
            }
        }
        return answer;
    }



}
