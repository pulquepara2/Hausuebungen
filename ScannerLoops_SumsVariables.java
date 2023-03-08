import java.util.Scanner;

public class ScannerLoops_SumsVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        double sum = 0;
        double number = scanner.nextDouble();

        while (number > 0) {
            if (number == 2) {
                sum = sum * 2;
            } else if (number == 3) {
                sum = sum * 3;
            } else if (number == 22) {
                sum = sum / 2;
            } else {
                sum = sum + number;
            }
            System.out.println("Please enter another number");
            number = scanner.nextInt();
        }
        System.out.println("The result of all entered numbers is " + sum);
    }
}