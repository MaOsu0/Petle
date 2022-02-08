package ZadaniaRóżne.Zadanie6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadź ilość liczb:");
        int numbers = sc.nextInt();
        int sum = 0;

//        while (numbers-- > 0) {
//            System.out.println("Podaj kolejną liczbę: ");
//            sum = sum + sc.nextInt();
//        }

//        do {
//            System.out.println("Podaj kolejną liczbę: ");
//            sum = sum + sc.nextInt();
//        } while (numbers-- > 1);

        for (int i = 0; i < numbers; i++) {
            System.out.println("Podaj kolejną liczbę: ");
            sum = sum + sc.nextInt();
        }

        System.out.println("Suma wszystkich podanych liczb to: " + sum);
        sc.close();
    }
}
