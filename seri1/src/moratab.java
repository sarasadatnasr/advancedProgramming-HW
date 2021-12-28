import java.util.Arrays;
import java.util.Scanner;
public class moratab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String[] castNames = new String[number];
        for(int i=0 ; i<number ;i++){
            castNames[i] =input.next();
            for(int p=0 ;p<i ; p++){
                if(castNames[i].equals(castNames[p])){
                    castNames[i]="";

                }
            }
        }

        Arrays.sort(castNames);
        for (int j = 0; j< castNames.length; j++) {
            System.out.println(castNames[j]);
        }
    }

}