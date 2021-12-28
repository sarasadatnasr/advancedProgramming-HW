import java.util.Scanner;

public class Charger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        System.out.println(simulation(n));
}
        public static long simulation (int n){
        long result=0;

             for(int i=0;i<=n;i++){
                 result=result+i;
                // System.out.println(result);
             }
        return result;
        }


}
