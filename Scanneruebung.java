import java.util.Scanner;

public class Scanneruebung {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie irgendeine blöde Zahl ein");
        int zahl = scanner.nextInt();

    answer(zahl);
    }

public static String answer (int zahl){
        if (zahl >15){
            System.out.println("Diese Zahl gefällt mir nicht");
        } else {
            System.out.println("Das ist eine schöne Zahl");
        }
        return null;
}
}
