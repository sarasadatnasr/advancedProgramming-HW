package sbu.cs;
public  class blackFunctions implements Black{
    public  String blackFunction1(String arg){
        StringBuilder str= new StringBuilder();
        char[] arr1 = arg.toCharArray();
        for (int i = arr1.length - 1; i >= 0; i--)
            str.append(arr1[i]);
        return str.toString();
    }

    public  String blackFunction2(String arg){
        StringBuilder str= new StringBuilder();
        char[] try1 = arg.toCharArray();
        for (char c : try1) {
            str.append(c).append(c);
        }
        return str.toString();
    }

    public String blackFunction3(String arg){
        return arg+arg;
    }

    public  String blackFunction4(String arg){
        StringBuilder str= new StringBuilder();
        String result;
        char[] try1 = arg.toCharArray();
        for (int i=0;i<try1.length-1;i++){
            str.append(try1[i]);}
        result= String.valueOf(try1[arg.length()-1])+str;
        return result;}

    public String blackFunction5(String arg){
        StringBuilder result = new StringBuilder();
        char[] try1 = arg.toCharArray();
        for (int i = 0; i < try1.length; i++) {
            int ascii = try1[i];
            if (ascii <=109) {
                int t = 109 - ascii;
                int finalAnswer = 110 + t;
                try1[i] = (char) finalAnswer;
                result.append(try1[i]);
            }
            if (ascii >= 110) {
                int t = ascii - 110;
                int finalAnswer = 109 - t;
                try1[i] = (char) finalAnswer;
                result.append(try1[i]);
            }
        }
        return result.toString();
    }

}


