import java.util.Scanner;

public class MajidMiladReshtesazi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int R = input.nextInt();
        int size=1;
        String str="1";
        while (size<R+1){
            str=function(str);
            size=str.length();
        }
        System.out.println(str.substring(L-1,R));
}

public static String function(String str){
       String reverse=str;
       int n=reverse.length();
       String[] letter=new String[n];
       letter=reverse.split("");

       System.out.println("letter :" +letter[0]);

       for(int i=0 ; i<n ; i++){
            if (letter[i]=="0"){
                letter[i]="1";
            }
            else if(letter[i]=="1"){
                letter[i]="0";
            }
            reverse+=letter[i];
       }
      return (str+reverse);

}




}
