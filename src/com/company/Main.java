package com.company;

import java.util.Scanner;

//import static com.company.Checking.checking;
import static com.company.Solution.solution;
import static com.company.SolutionViet.solutionViet;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        System.out.println(solution(a,b,c,d));
        System.out.println("***************************************");
        System.out.println(solutionViet(a,b,c,d));
        //System.out.println(checking(a,b,c,d));

    }
}
