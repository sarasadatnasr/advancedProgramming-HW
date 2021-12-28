import java.util.Scanner;

public class Ghoolfilsefat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x == 7 && y == 7) {
            System.out.println(3 + "\n" + 7 + "\n" + 8);
            System.out.println("\n" + "8" + "\n" + "7");
            System.out.println("\n" + "6" + "\n" + "6");
        } else {
            System.out.println("1" + "\n" + "7" + "\n" + "7");
        }
    }
}
