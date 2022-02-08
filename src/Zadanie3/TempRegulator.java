package Zadanie3;

import java.util.Scanner;

public class TempRegulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj aktualną temperaturę: ");
        double currentTemp = scanner.nextDouble();
        System.out.println("Podaj oczekiwaną temperaturę: ");
        double expectedTemp = scanner.nextDouble();


        while (expectedTemp != currentTemp) {
            System.out.println("Aktualna temperatura to " + currentTemp);
            if (expectedTemp < currentTemp) {
                currentTemp -= 0.5;
            } else if (expectedTemp > currentTemp) {
                currentTemp += 0.5;
            }
        }
        System.out.println("Osiągnięto temperaturę docelową " + expectedTemp);
        scanner.close();
    }

}

