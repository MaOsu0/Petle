package for_foreach.lession;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        int[] numbers = new int[100];
//
//        for(int i = 0; i < numbers.length; i++) {
//            numbers [i] = i + 1;
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbe do spradzenia: ");
            int tmp = scanner.nextInt();

            if (tmp % 2 == 0) {
                System.out.println("Liczba " + tmp + " jest parzysta");
            } else {
                System.out.println("Liczba " + tmp + " jest nieparzysta");
            }
        }
        scanner.close();
    }
}
