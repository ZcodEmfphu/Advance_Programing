package Week_1.Labs1;

import java.util.Scanner;

public class NumberAdder {

    // Viết phương thức addNumbers(int a, int b) trong lớp NumberAdder
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " + " + num2 + " is " + sum);
        scanner.close();
    }
}
