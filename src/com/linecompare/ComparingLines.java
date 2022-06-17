package com.linecompare;

import java.util.Scanner;
import java.lang.*;

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
        Double lengthL1 = Math.sqrt(((x2-x1)*(x2-x1))+(y2-y1)*(y2-y1));
        System.out.println("Length of Line L1 is : "+lengthL1);
        System.out.println("Please Enter Coordinates for Line 2.");
        System.out.println("Enter X3:");
        Integer x3 = scanner.nextInt();
        System.out.println("Enter Y3:");
        Integer y3 = scanner.nextInt();
        System.out.println("Enter X4:");
        Integer x4 = scanner.nextInt();
        System.out.println("Enter Y4:");
        Integer y4 = scanner.nextInt();
        Double lengthL2 = Math.sqrt(((x4-x3)*(x4-x3))+(y4-y3)*(y4-y3));
        System.out.println("Length of Line L2 is : "+lengthL2);
        boolean result = lengthL1.equals(lengthL2);
        int comp = lengthL1.compareTo(lengthL2);
        if(result){
            System.out.println("Both Lines are Equal");
        }
        else if (comp>0){
            System.out.println("Line 1 is Larger");
            System.out.println("Line 2 is Smaller");
        }
        else {
            System.out.println("Line 2 is Larger");
            System.out.println("Line 1 is Smaller");
        }
    }
}
