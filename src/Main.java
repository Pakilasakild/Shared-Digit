import java.util.Scanner;

public class Main {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
            return false;
        }
        int num1Digit1 = num1 % 10;
        int num2Digit1 = num2 % 10;
        int num1Digit2 = num1 / 10;
        int num2Digit2 = num2 / 10;
        if (num1Digit1 == num2Digit1 || num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number (10-99): ");
        int num1 = sc.nextInt();
        System.out.println("Input second number (10-99): ");
        int num2 = sc.nextInt();
        if (hasSharedDigit(num1, num2)) {
            System.out.println("The numbers have shared digits");
        }
        else {
            System.out.println("No shared digits");
        }
    }
}