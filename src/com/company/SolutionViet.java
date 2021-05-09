package com.company;

public class SolutionViet {
    public static String solutionViet(double a, double b, double c, double d) {
        double a1=b/a;
        double b1=c/a;
        double c1=d/a;
        double q=(Math.pow(a1,2)-3*b1)/9;
        double r=(2*Math.pow(a1,3)-9*a1*b1+27*c1)/54;
        double s = Math.pow(q,3)-Math.pow(r,2);
        if(s>0) {
            double phi = Math.acos(r/Math.sqrt(Math.pow(q,3)))/3;
            double x1=-2*Math.sqrt(q)*Math.cos(phi)-a1/3;
            double x2=-2*Math.sqrt(q)*Math.cos(phi+2*Math.PI/3)-a1/3;
            double x3=-2*Math.sqrt(q)*Math.cos(phi-2*Math.PI/3)-a1/3;
            return "s>0::  ["+x1+", "+x2+", "+x3+"]";
        }
        else if(s<0) {
            if(q>0) {
                double argArsh =(Math.abs(r)/Math.sqrt(Math.pow(q,3)));
                double phi =Math.log(argArsh+Math.sqrt(Math.pow(argArsh,2)-1))/3;
                double chphi = (Math.pow(Math.E,phi)+Math.pow(Math.E,-phi));
                double shphi = (Math.pow(Math.E,phi)-Math.pow(Math.E,-phi))/2;
                double x1=-Math.signum(r)*Math.sqrt(q)*chphi-a1/3;
                double x2=Math.signum(r)*Math.sqrt(q)*chphi/2-a1/3+Math.sqrt(-3*q)*shphi;
                double x3=Math.signum(r)*Math.sqrt(q)*chphi/2-a1/3-Math.sqrt(-3*q)*shphi;
                return "s<0, q>0::  ["+x1+", "+x2+", "+x3+"]";
            }
            else if(q<0) {
                double argArsh = (Math.abs(r)/Math.sqrt(Math.abs(Math.pow(q,3))));
                double phi =Math.log(argArsh+Math.sqrt(Math.pow(argArsh,2)-1))/3;
                double chphi = (Math.pow(Math.E,phi)+Math.pow(Math.E,-phi));
                double shphi = (Math.pow(Math.E,phi)-Math.pow(Math.E,-phi))/2;
                double x1=-2*Math.signum(r)*Math.sqrt(Math.abs(q))*shphi-a1/3;
                double x2=Math.signum(r)*Math.sqrt(Math.abs(q))*shphi-a1/3+Math.sqrt(-3*Math.abs(q))*chphi;
                double x3=Math.signum(r)*Math.sqrt(Math.abs(q))*shphi-a1/3-Math.sqrt(-3*Math.abs(q))*chphi;
                return "s<0, q<0::  ["+x1+", "+x2+", "+x3+"]";
            }
            else if(q==0) {
                double x1=-Math.cbrt(c1-Math.pow(a1/3,3))-a1/3;
                double x2=-(a1+x1)/2+Math.sqrt(-Math.abs((a-3*x1)*(a+x1)-4*b1))/2;
                double x3=-(a1+x1)/2-Math.sqrt(-Math.abs((a-3*x1)*(a+x1)-4*b1))/2;
                return "s<0, q=0::  ["+x1+", "+x2+", "+x3+"]";
            }
            else {
                return "Unreal";
            }
        }
        else if(s==0) {
            double x1=-2*Math.cbrt(r)-a1/3;
            double x2=Math.cbrt(r)-a1/3;
            return "s=0::  ["+x1+", "+x2+", "+x2+"]";
        }
        else {
            return "Unreal";
        }
    }
}
