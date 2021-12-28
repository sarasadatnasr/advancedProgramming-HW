import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class salam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        str=str.toLowerCase();
        int size=str.length();

        int h=0,e=0,l=0,l1=0,o=0;

        for(int i=0 ;i<size ;i++) {
             h = str.indexOf("h");
            if (h != -1) {
                 e = str.indexOf("e", h + 1);
                if (e != -1) {
                     l = str.indexOf("l", e + 1);
                    if (l != -1) {
                         l1 = str.indexOf("l", l + 1);
                        if (l1 != -1) {
                             o = str.indexOf("o", l1 + 1);
                        }
                    }
                }
            }
        }
        if (h < e && e<l && l<l1 && l1<o ){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }


}





