import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class barax {


    static String reverseWords(String str) {


        Pattern pattern = Pattern.compile("\\s");


        String[] temp = pattern.split(str);
        String result = "";


        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList alist = new ArrayList();
        int i=0;
        while(input.hasNextLine()){
            String s1 = input.nextLine();
            alist.add(reverseWords(s1));
            i++;
        }
        for(int j=0 ;j<i ;j++){
            System.out.println(alist.get(j));
        }
    }
}