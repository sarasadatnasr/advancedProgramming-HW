import java.util.Scanner;

public class KalameKalame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        int number =count(string);
        System.out.println(pow(number));
}


public static int count(String str){
        int vowels=0;
      for(int i=0 ; i<str.length(); i++) {
          if(str.charAt(i)=='a'){
              vowels++;
          }
          else if(str.charAt(i)=='o'){
              vowels++;
          }
          else if(str.charAt(i)=='i'){
              vowels++;
          }
          else if(str.charAt(i)=='u'){
              vowels++;
          }
          else if(str.charAt(i)=='e'){
              vowels++;
          }
      }
      return vowels;

    }
    public static long pow(int n){
        int i=0;
        long result=1;
        while(i<n){
            result*=2;
            i++;
        }
        return result;
    }
}