import java.util.Scanner;

public class Sample7 {
    public static void main(String[] args) {
        System.out.println("Programmed by Figura");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third integer (c): ");
        int c = sc.nextInt();

        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        System.out.println("Largest number: " + largest);

        sc.close();
    }
}