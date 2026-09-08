import java.util.Scanner;

public class Sample6 {
    public static void main(String[] args) {
        System.out.println("Programmed by Figura");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        double grade = sc.nextDouble();

        String result = (grade >= 75) ? "PASSED" : "FAILED";

        System.out.println("Result: " + result);

        sc.close();
    }
}