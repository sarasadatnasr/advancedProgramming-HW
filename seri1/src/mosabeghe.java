import java.util.*;
public class mosabeghe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code;
        code=scanner.nextLine();
        String pattern = "(1|144|14)+";

        if(code.matches(pattern)==true) {
            System.out.println("YES");
        }

        else
            System.out.println("NO");

        scanner.close();
    }

}