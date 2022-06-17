package com.linecompare;

import java.util.Scanner;
import java.lang.Math;

public class ComparingLines {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Coordinates for Line 1.");
        System.out.println("Enter X1:");
        Integer x1 = scanner.nextInt();
        System.out.println("Enter Y1:");
        Integer y1 = scanner.nextInt();
        System.out.println("Enter X2:");
        Integer x2 = scanner.nextInt();
        System.out.println("Enter Y2:");
        Integer y2 = scanner.nextInt();
        double lengthL1 = Math.sqrt(((x2-x1)*(x2-x1))+(y2-y1)*(y2-y1));
        System.out.println("Length of Line L1 is : "+lengthL1);
    }
}
