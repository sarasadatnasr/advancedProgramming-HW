import java.util.Scanner;

public class security {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] letter = new char[str.length()];
        int[] letter2 = new int[str.length()];
        letter=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(letter[i]>=77 && letter[i]<=90 ){
                letter2[i]=(int) letter[i]-77;
            }
            else if(letter[i]>=97 && letter[i]<=122 ){
                letter2[i]=(int) letter[i]-97;

            }
        }
        String result="";int r=0;
        for (int i = 0; i < str.length(); i++) {
            r=(repeat(str,letter[i])+letter2[i])%26;
            result+=result.valueOf((char) r);
        }
        System.out.println(result);

    }

public static int repeat(String s,char c){
    int distinct = 0 ;

        for (int j = 0; j < s.length(); j++) {
        if(c==s.charAt(j))
        {
        distinct++;

        }
        }
   return distinct;

        }
}