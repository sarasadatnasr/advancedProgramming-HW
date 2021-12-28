import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class ip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        input.nextLine();
        String[] str=new String[number];
        for(int i=0 ;i<number ;i++) {
            String pattern = "^([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])\\.([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])$";
            String code = input.nextLine();
            if (code.matches(pattern)) {
                str[i] = "valid";
            }
            else {
                str[i] = "invalid";
            }
        }
        for(int j=0 ;j<number;j++){
        System.out.println(str[j]);}
    }
}