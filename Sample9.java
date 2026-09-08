
package com.mycompany.samplecodes6to10;

import java.util.Scanner;

public class Sample9 {
    public static void main(String[] args) {
        System.out.println("Programmed by Figura");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int not = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;

        System.out.println("AND=" + and);
        System.out.println("OR=" + or);
        System.out.println("XOR=" + xor);
        System.out.println("NOT a=" + not);
        System.out.println("a<<1=" + leftShift);
        System.out.println("a>>1=" + rightShift);

        sc.close();
    }
}