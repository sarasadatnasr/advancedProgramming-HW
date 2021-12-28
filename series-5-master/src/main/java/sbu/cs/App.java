package sbu.cs;
public  class  App implements Black,White{
    /**
     * use this function for magical machine question.
     *
     * @param n     size of machine
     * @param arr   an array in size n * n
     * @param input the input string
     * @return the output string of machine
     */
    public String main(int n, int[][] arr, String input) {
        String[] strRow = new String[n];
        String[] strColumn = new String[n];
        String[] row = new String[n];
        String[] column = new String[n];
        String[] pinkRow=new String[n];
        String[] pinkColumn=new String[n];
        String tempRow=input;
        String tempColumn=input;
        strRow[0]=input;
        strColumn[0]=input;

        //starter string row
        for (int i=1;i<7;i++){
            strRow[i]=setBlack(arr[i-1][0],tempRow);
            tempRow=strRow[i];
        }

        //starter string column
        for (int i=1;i<7;i++){
            strColumn[i]=setBlack(arr[0][i-1],tempColumn);
            tempColumn=strColumn[i];
        }

        //final string row
        for (int i=0;i<7;i++){
            row[i]=row(i,strRow[i],arr);
        }
        //final string column
        for (int i=0;i<7;i++){
            column[i]=column(i,strColumn[i],arr);
        }
        String yellow1=setBlack(arr[0][7],row[0]);
        String yellow2=setBlack(arr[7][0],column[0]);

        String temp1=yellow1;
        String temp2=yellow2;

        for(int i=1;i< arr.length-1;i++){
            pinkRow[i]=setWhite(arr[7][i],temp2,column[i]);
            temp2=pinkRow[i];}

        for(int i=1;i< arr.length-1;i++){
            pinkColumn[i]=setWhite(arr[i][7],row[i],temp1);
            temp1=pinkColumn[i];}


        String final1=setWhite(arr[7][7],pinkRow[6],pinkColumn[6]);
        return final1;}


    /////////////////////////////////////////////////////////////////
    public String blackFunction1(String arg){
        StringBuilder str= new StringBuilder();
        char[] arr1 = arg.toCharArray();
        for (int i = arr1.length - 1; i >= 0; i--)
            str.append(arr1[i]);
        return str.toString();
    }

    public String blackFunction2(String arg){
        StringBuilder str= new StringBuilder();
        char[] try1 = arg.toCharArray();
        for (char c : try1) {
            str.append(c).append(c);
        }
        return str.toString();
    }

    public  String blackFunction3(String arg){
        return arg+arg;
    }

    public String blackFunction4(String arg){
        StringBuilder str= new StringBuilder();
        String result;
        char[] try1 = arg.toCharArray();
        for (int i=0;i<try1.length-1;i++){
            str.append(try1[i]);}
        result= String.valueOf(try1[arg.length()-1])+str;
        return result;}

    public  String blackFunction5(String arg){
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

    public  String whiteFunction1(String arg1, String arg2){
        StringBuilder result= new StringBuilder();
        int shorter;
        int longer;
        char[] l;
        char[] arr1=arg1.toCharArray();
        char[] arr2=arg2.toCharArray();
        if(arr1.length<arr2.length){
            shorter=arr1.length;
            longer=arr2.length;
            l=arr2;
        }
        else {
            shorter=arr2.length;
            longer=arr1.length;
            l=arr1;
        }
        for(int i=0;i<shorter;i++){
            result.append(arr1[i]).append(arr2[i]);
        }
        for(int i=shorter;i<longer;i++){
            result.append(l[i]);

        }
        return result.toString();
    }

    public String whiteFunction2(String arg1, String arg2){
        StringBuilder str = new StringBuilder();
        String result;
        char[] arr2 = arg2.toCharArray();
        for (int i = arg2.length() - 1; i >= 0; i--) {
            str.append(arr2[i]);
        }
        result = arg1 + str;
        return result;
    }

    public  String whiteFunction3(String arg1, String arg2){
        StringBuilder result= new StringBuilder();
        int size1=arg1.length();
        int size2=arg2.length();
        StringBuilder arg1Builder = new StringBuilder(arg1);
        StringBuilder arg2Builder = new StringBuilder(arg2);
        while(size1!=size2){
            if(size1<size2){
                arg1Builder.append("*");
            }
            else{
                arg2Builder.append("*");
            }
            size1= arg1Builder.length();
            size2= arg2Builder.length();
        }
        arg2 = arg2Builder.toString();
        arg1 = arg1Builder.toString();
        int i;
        int j;
        char[] arr1=arg1.toCharArray();
        char[] arr2=arg2.toCharArray();
        for(i=0,j=size1-1;i<size1&&j>=0;i++,j--){
            result.append(arr1[i]).append(arr2[j]);}
        result = new StringBuilder(result.toString().replace("*", ""));
        return result.toString();
    }

    public String whiteFunction4(String arg1, String arg2){
        String result;
        int size1=arg1.length();
        if(size1%2==0){
            result=arg1;
        }
        else {
            result=arg2;
        }
        return result;}

    public  String whiteFunction5(String arg1, String arg2){
        StringBuilder result= new StringBuilder();
        String sub;
        int shorter;
        int size1=arg1.length();
        int size2=arg2.length();
        if(size1>size2){
            sub=arg1.substring(size2,size1);
            shorter=size2;
        }
        else {
            sub=arg2.substring(size1,size2);
            shorter=size1;
        }
        char[] arr1=arg1.toCharArray();
        char[] arr2=arg2.toCharArray();
        for(int i=0;i<shorter;i++){
            int num1=(int)arr1[i]-97;
            int num2=(int)arr2[i]-97;
            int re=((num1+num2)%26)+97;
            result.append((char) re);
        }
        return result+sub;
    }
    ////////////////////////////////////////////////////////////
    public  String setBlack(int n,String str){
        String result="";
        switch (n){
            case 1:
                result=blackFunction1(str);
                break;
            case 2:
                result=blackFunction2(str);
                break;
            case 3:
                result=blackFunction3(str);
                break;
            case 4:
                result=blackFunction4(str);
                break;
            case 5:
                result=blackFunction5(str);
                break;
        }
        return result;}

    ////////////////////////////////////////////////////////////
    public String setWhite(int n,String str1,String str2){
        String result="";
        switch (n){
            case 1:
                result=whiteFunction1(str1,str2);
                break;
            case 2:
                result=whiteFunction2(str1,str2);
                break;
            case 3:
                result=whiteFunction3(str1,str2);
                break;
            case 4:
                result=whiteFunction4(str1,str2);
                break;
            case 5:
                result=whiteFunction5(str1,str2);
                break;}
        return result;
    }


    public  String row (int n,String enter,int[][] arr){
        for(int i=0;i<arr.length-1;i++){
            enter=setBlack(arr[n][i],enter);}
        return enter;
    }


    public   String column(int n,String enter,int[][] arr){
        for (int j=0;j<arr.length-1;j++){
            enter=setBlack(arr[j][n],enter);}
        return enter;
    }
}
