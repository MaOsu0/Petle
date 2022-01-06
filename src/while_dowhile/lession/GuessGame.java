package while_dowhile.lession;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int number = 1512;
        int userInput;

//        System.out.println("Zgadnij liczbę");
//
//        while ((userInput = scanner.nextInt()) != number) {
//            if (userInput > number) {
//                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
//            } else {
//                System.out.println("podana liczba jest za mała, zgaduj dalej!");
//            }
//        }

        do {
            System.out.println("Zgadnij liczbę");
            userInput = scanner.nextInt();
            if (userInput > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            } else if (userInput < number) {
                System.out.println("podana liczba jest za mała, zgaduj dalej!");
            }
        } while (userInput != number);

        System.out.println("Brawo zgadłeś liczbę");
        scanner.close();
    }
}
