import java.util.Scanner;

import static java.lang.Math.*;

public class Camera {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int x1=input.nextInt();
        int y1=input.nextInt();
        int x2=input.nextInt();
        int y2=input.nextInt();
        int x3=input.nextInt();
        int y3=input.nextInt();
        int x4,y4;
        double maximum,point12,point13,point23;
        point12=distance(x1,y1,x2,y2);
        point13=distance(x1,y1,x3,y3);
        point23=distance(x2,y2,x3,y3);
        double midX,midY;
        if(point12>point13 && point12>point23){
            maximum=point12;
            midX=abs(x1-x2)/2;
            midY=abs(y1-y2)/2;
        }
        else if(point13>point12 && point13>point23){
            maximum=point13;
            midX=abs(x1-x3)/2;
            midY=abs(y1-y3)/2;
        }
        else if(point23>point13 && point23>point12){
            maximum=point23;
            midX=abs(x2-x3)/2;
            midY=abs(y2-y3)/2;
        }



    }

      public static double distance (int X1,int Y1,int X2,int Y2){
       double dist;
       double x1=X1;
       double x2=X2;
       double y1=Y1;
       double y2=Y2;
       return y1;
      }



}
