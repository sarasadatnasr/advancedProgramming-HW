import java.util.Scanner;

public class secretString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int k= input.nextInt();
        String str= input.next();
        int i=0;String result=str;
        while(i<k){
            result=transfer(result);
            result=replaceLetter(result);
            i++;
        }
        System.out.println(result);
    }
    public static String transfer(String str){
     int last=str.length()-1;
     String lastLetter=Character.toString(str.charAt(last));
     String subStr=str.substring(0,last);
     str=lastLetter+subStr;
     return str;
    }


    public static String replaceLetter(String str) {
        char[] letters = new char[str.length()];
        String result = null;

        for (int i = 0; i < str.length(); i++) {
            int letter = ((int) str.charAt(i)) + 1;
            if (letter == 123) {
                letters[i] = 'a';
            } else {
                letters[i] = (char) letter;
            }

            if (i == 0) {
                result = Character.toString(letters[0]);

            } else {
                result += Character.toString(letters[i]);
            }
        }

            return result;

    }
}
