package com.company;

public class Solution {
    public static String solution(double a, double b, double c, double d) {
        if(a!=0) {
            double p = (3*a*c - Math.pow(b,2))/(3*Math.pow(a,2));
            double q = (2*Math.pow(b,3) - 9*a*b*c + 27*d*Math.pow(a,2))/(27*Math.pow(a,3));
            double k = Math.pow(q,2)/4 + Math.pow(p,3)/27;
            double s1 = Math.cbrt(-q/2 + Math.sqrt(k));
            double s2 = Math.cbrt(-q/2 - Math.sqrt(k));
            double discriminantCubic = -4*Math.pow(b,3)*d+Math.pow(b*c,2)-4*Math.pow(c,3)*a+18*a*b*c*d-27*Math.pow(a*d,2);
            System.out.println("("+a+")x^3 + ("+b+")x^2 + ("+c+")x + ("+d+") = 0");
            System.out.println("D = "+discriminantCubic);
            double x1 = s1 + s2 - b / (3 * a);
            double x2 = -(s1 + s2) / 2 - b / (3 * a) + (s1 - s2) / 2 * Math.sqrt(3);
            double x3 = -(s1 + s2) / 2 - b / (3 * a) - (s1 - s2) / 2 * Math.sqrt(3);
            double re = -(s1 + s2) / 2 - b / (3 * a);
            double im = (s1 - s2) / 2 * Math.sqrt(3);
            String x2i = re+"+"+im+"i";
            String x3i = re+"-"+im+"i";
            /*if(discriminantCubic<0) {
                //String solutionCubic = "["+x1+", "+x2+", "+x3+"]";
                // можно захардкодить через иф, чтобы были разные знаки без скобок
                //ToDo обязательно нужно сделать проверку на корни, такие числа, как 0.9999... округлять до 1 и делать с ними тоже проверку
                return "[" + x1 +  "]";
            }
            else if(discriminantCubic==0){
                return "[" + x1 + ", " + x2 + ", " + x3 + "]";
            }*/
            if(discriminantCubic>0) {
                double phi = Math.acos(q/(2*Math.sqrt(Math.pow(-p/3,3))))/3;
                double x11=-2*Math.sqrt(-p/3)*Math.cos(phi)-b/(3*a);
                double x22=-2*Math.sqrt(-p/3)*Math.cos(phi+2*Math.PI/3)-b/(3*a);
                double x33=-2*Math.sqrt(-p/3)*Math.cos(phi-2*Math.PI/3)-b/(3*a);
                if(d==0) {
                    return "[" + x11 + ", " + x22 + ", 0]";
                }
                else {
                    return "[" + x11 + ", " + x22 + ", " + x33 + "]";
                }
            }
            else if(discriminantCubic<0) {
                if(d==0) {
                    return "[0, " + x2i + ", " + x3i + "]";
                }
                else {
                    return "[" + x1 + ", " + x2i + ", " + x3i + "]";
                }
            }
            else {
                return "[" + x1 + ", " + x2 + ", " + x3 + "]";
            }
        }
        else if(b!=0) {
            double discriminant = Math.pow(c, 2)-4*b*d;
            double x1 = (-c-Math.sqrt(discriminant))/(2*b);
            double x2 = (-c+Math.sqrt(discriminant))/(2*b);
            System.out.println("("+b+")x^2 + ("+c+")x + ("+d+") = 0");
            if (x1==x2){
                return "["+x1+"]";
            }
            else {
                return "["+x1+", "+x2+"]";
            }
        }
        else if(c!=0){
            System.out.println("("+c+")x + ("+d+") = 0");
            double x = -d/c;
            return "["+x+"]";
        }
        else {
            System.out.println("("+d+") = 0");
            if(d==0) {
                return "[Infinity]";
            }
            else {
                return "[No solutions]";
            }
        }
    }
}