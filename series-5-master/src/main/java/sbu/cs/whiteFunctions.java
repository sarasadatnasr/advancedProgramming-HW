package sbu.cs;

public  class whiteFunctions implements White {
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

    public  String whiteFunction2(String arg1, String arg2){
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

    public  String whiteFunction4(String arg1, String arg2){
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
}
