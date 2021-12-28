import java.util.Scanner;

public class two {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int in=input.nextInt();
        String question=input.next();
        String answer=input.next();
        String[] text1=new String[in];
        String[] text2=new String[in];
        text1=question.split("");
        text2=answer.split("");
        int j=0;
        for(int i=0;i<in;i++){
            if(!text1[i].equals(text2[i])){
                j++;
            }}
        System.out.println(j);

    }
}
