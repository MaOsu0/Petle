package ZadaniaRóżne.Zadanie5;

public class MEthods {

    int description(int number) {
        if (number == 0) {
            return number;
        } else if (number < 10) {
            return number * 1000;
        } else if (number < 100) {
            return number * 100;
        } else if (number < 1000) {
            return number * 10;
        } else {
            return number;
        }
    }

    void isOddorEven(int number) {
        if (number == 0) {
            System.out.println("Liczba jest 0");
        } else if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }

    void compareAndPrint (int number) {
        System.out.println("wylosowana liczba to: " + number);
        if (number > 5000) {
            System.out.println("Liczba jest większa od 5000");
        } else if (number == 5000) {
            System.out.println("Liczba jest równa 5000");
        } else {
            System.out.println("Liczba jest mniejsza od 5000");
        }
    }
}
