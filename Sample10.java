
package com.mycompany.samplecodes6to10;

import java.util.Scanner;

public class Sample10 {
    public static void main(String[] args) {
        System.out.println("Programmed by Figura");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        System.out.print("Enter amount paid: ");
        double amountPaid = sc.nextDouble();

        double grossAmount = price * quantity;
        double discount = grossAmount * (discountPercent / 100);
        double discountedAmount = grossAmount - discount;
        double vat = discountedAmount * 0.12;
        double finalBill = discountedAmount + vat;
        double difference = amountPaid - finalBill;

        String status = (amountPaid >= finalBill) ? "SUFFICIENT PAYMENT" : "INSUFFICIENT PAYMENT";

        System.out.println("Gross=" + grossAmount);
        System.out.println("Discount=" + discount);
        System.out.println("After Discount=" + discountedAmount);
        System.out.println("VAT=" + vat);
        System.out.println("Final Bill=" + finalBill);
        System.out.println("Change/Difference=" + difference);
        System.out.println(status);

        sc.close();
    }
}