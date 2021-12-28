
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HamkariPorDardsar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min=0;
        //n mohammad javad
        //m mostafa
        int n= input.nextInt();
        int m= input.nextInt();
        int[] mohammad=new int[n];
        int[] mostafa=new int[m];
        int moshtarak=0;
        String result=null;
        for(int i=0;i<n;i++){
            mohammad[i]=input.nextInt();
        }

        for(int i=0;i<m;i++){
            mostafa[i]=input.nextInt();
        }

        Arrays.sort(mohammad);
        Arrays.sort(mostafa);
        if (m>n){
            min=n;
        }
        else {
            min=m;
        }
        for(int i=0;i<min;i++) {
            if (mohammad[i] == mostafa[i]) {
                moshtarak++;
            }
        }
         //   System.out.println("moshtarak  "+moshtarak);


        if(m>moshtarak && n==moshtarak){
            System.out.println("Mohammad Javad");
        }
           else if(m==moshtarak && n>moshtarak){
            System.out.println("Mostafa");
        }
           else if(m==moshtarak && n==moshtarak){
            System.out.println("Both");
        }
           else {
            System.out.println("None");
        }
    }
}
