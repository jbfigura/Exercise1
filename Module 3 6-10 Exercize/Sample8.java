package com.mycompany.samplecodes6to10;

import java.util.Scanner;

public class Sample8 {
    public static void main(String[] args) {
        System.out.println("Programmed by Figura");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        double grade = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        boolean eligible = (grade >= 85) && (attendance >= 80);

        System.out.println("Eligible: " + eligible);

        sc.close();
    }
}