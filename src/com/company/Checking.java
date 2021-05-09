package com.company;

//import java.text.DecimalFormat;

public class Checking {
    public static double checking(double a, double b, double c, double d) {
        //double x = solution(a,b,c,d);
        double x = -0.89442719099991587856366946749251;
        /*DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        String betterRes = decimalFormat.format(x);
        System.out.println(betterRes);*/
        double cubic = a*Math.pow(x,3)+b*Math.pow(x,2)+c*x+d;
        System.out.println("cubic = "+cubic);
        return cubic;









        /*if(cubic==0)
        int x = Integer.parseInt("9");
        double l = Double.parseDouble("5");
        int j = Integer.parseInt("444",16);

        System.out.println(x);
        System.out.println(l);
        System.out.println(j);*/











        /*if(cubic==0) return x;
        else return -1;*/
        /*if(cubic==0) {
            double xnew =Math.round(x);
            System.out.println(xnew);
            if(cubic==0) {
                return xnew;
            }
            else return x;
        }
        else {
            double xnew =Math.round(x);
            System.out.println(xnew);
            if(cubic==0) {
                return xnew;
            }
            else return -1;
        }*/
        //ToDo если 8 знаков после запятой совпадают, то можно смело округлять!
    }
}
