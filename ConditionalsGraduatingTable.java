import java.util.Scanner;

public class ConditionalsGraduatingTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter achieved points");
        int points = scanner.nextInt();

        getGrade (points);

    }
//    Methode
    public static String getGrade (int points) {
        if (points >= 90) {
            System.out.println("Outstanding");
        } else if (89 > points && points > 78) {
            System.out.println("Excellent");
        } else if (77 > points && points > 65) {
            System.out.println("Acceptable");
        } else if (64 > points && points > 51) {
            System.out.println("Passed");
        } else if (points <= 50) {
            System.out.println("Fail");
        }
        return null;
    }
}
